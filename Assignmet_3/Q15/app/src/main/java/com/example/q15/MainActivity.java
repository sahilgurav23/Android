package com.example.q15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.HashMap;

/*
 15.	Create application to demonstrate date and time picker
**/
public class MainActivity extends AppCompatActivity {

    DatePicker dp;

    TimePicker tp;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp =(DatePicker) findViewById(R.id.datep);
        b =(Button) findViewById(R.id.button);
        tp = (TimePicker) findViewById(R.id.timepick);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Display.class);
                Bundle bundle = new Bundle();
                bundle.putString("Date",String.valueOf(dp.getDayOfMonth()));
                bundle.putString("Month",String.valueOf(dp.getMonth()+1));
                bundle.putString("Year",String.valueOf(dp.getYear()));
                bundle.putString("Hours",String.valueOf(tp.getHour()));
                bundle.putString("Minutes",String.valueOf(tp.getMinute()));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}