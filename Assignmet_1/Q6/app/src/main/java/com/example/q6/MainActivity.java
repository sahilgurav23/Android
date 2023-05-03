package com.example.q6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
 6.	Design Following Screens Using Intents. On second activity take Button. On clicking it,
 it should Show Information of profile on Third activity. (Without Using Database)
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Booking.class));
            }
        },3000);
    }
}