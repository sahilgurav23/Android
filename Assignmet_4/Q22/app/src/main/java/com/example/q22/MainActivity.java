package com.example.q22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/*
  22.	Construct image switcher using setFactory().
 */

public class MainActivity extends AppCompatActivity {

    ImageButton btPrevious,btNext;
    ImageSwitcher imageSwitcher;

    int[] imageList ={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};
    int count=imageList.length;
    int currentIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPrevious=findViewById(R.id.bt_previous);
        btNext=findViewById(R.id.bt_next);
        imageSwitcher=findViewById(R.id.image_switcher);

        //setFactory() method, which allows you to dynamically change the images displayed
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory(){
            @Override
            public View makeView() {
                ImageView imageView= new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });
        imageSwitcher.setImageResource(imageList[0]);

        btPrevious.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --currentIndex;
                if(currentIndex<0)
                    currentIndex=imageList.length-1;
                imageSwitcher.setImageResource((imageList[currentIndex]));
            }
        });


        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if(currentIndex==count)
                    currentIndex=0;
                imageSwitcher.setImageResource(imageList[currentIndex]);
            }
        });
    }
}