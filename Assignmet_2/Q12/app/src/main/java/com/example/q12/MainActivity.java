package com.example.q12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/*
  12.	Create following layout which is changing android spinner text size with styles
 */
public class MainActivity extends AppCompatActivity {

    Spinner sp1;
    Spinner sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Spinner) findViewById(R.id.part1);
        sp2 = (Spinner) findViewById(R.id.part2);

        String [] co={"Filter","Americano","Latte","Espresso","Cappucino","Mocha","Skinny Latte","Espresso Corretto"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,co);

        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);
    }
}