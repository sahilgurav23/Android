package com.example.q24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

/*
   24.	Construct App which shows Slides of multiple images after click on Slide menu
 */

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f};

    // adapter is a bridge between the data source and the ListView or RecyclerView that displays the data
    Adapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new Adapter(MainActivity.this, images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}