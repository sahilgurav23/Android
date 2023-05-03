package com.example.q15;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Display extends AppCompatActivity {

    TextView d,mon,y,h,min;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        d = (TextView) findViewById(R.id.daytv);
        mon = (TextView) findViewById(R.id.monthtv);
        y = (TextView) findViewById(R.id.yeartv);
        h = (TextView) findViewById(R.id.hourstv);
        min = (TextView) findViewById(R.id.minutestv);

        Bundle bundle = getIntent().getExtras();
        d.setText("Date : "+bundle.getString("Date"));
        mon.setText("Month : "+bundle.getString("Month"));
        y.setText("Year : "+bundle.getString("Year"));
        h.setText("Hours : "+bundle.getString("Hours"));
        min.setText("Minutes : "+bundle.getString("Minutes"));
    }
}
