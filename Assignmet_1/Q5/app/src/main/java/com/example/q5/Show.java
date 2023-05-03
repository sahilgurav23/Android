package com.example.q5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Show extends AppCompatActivity {

    TextView fn,mn,ls,ad,em,dp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        Intent intent = getIntent();

        fn = (TextView) findViewById(R.id.showfn);
        mn = (TextView) findViewById(R.id.showmn);
        ls = (TextView) findViewById(R.id.showls);
        ad = (TextView) findViewById(R.id.showad);
        em = (TextView) findViewById(R.id.showed);
        dp = (TextView) findViewById(R.id.showdb);

        fn.setText(intent.getStringExtra("First_name"));
        mn.setText(intent.getStringExtra("Middle_name"));
        ls.setText(intent.getStringExtra("Last_name"));
        ad.setText(intent.getStringExtra("Address"));
        em.setText(intent.getStringExtra("Email_id"));
        dp.setText(intent.getStringExtra("Date"));


    }
}
