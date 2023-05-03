package com.example.q14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/*
  14.	By using Spinner, Buttons. Write a program to draw following GUI.
 */

public class MainActivity extends AppCompatActivity {

    EditText sc;
    TextView spiadd, spiremo;
    Spinner spi;
    ArrayList<String> al;
    ArrayAdapter<String> ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sc = (EditText) findViewById(R.id.inp);
        spiadd = (TextView) findViewById(R.id.addsp);
        spi=(Spinner) findViewById(R.id.sp);
        spiremo = (TextView)findViewById(R.id.remo);

        al = new ArrayList<String>();
        ad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,al);


        spiadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!sc.getText().toString().isEmpty())
                {
                    al.add(sc.getText().toString());
                    spi.setAdapter(ad);
                    Toast.makeText(MainActivity.this, "Add Successfully", Toast.LENGTH_SHORT).show();
                    sc.setText("");
                }
                else
                    Toast.makeText(MainActivity.this, "Enter input", Toast.LENGTH_SHORT).show();
            }
        });


        spiremo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!sc.getText().toString().isEmpty())
                {
                    if(al.remove(sc.getText().toString())){
                        Toast.makeText(MainActivity.this, "Remove Successfully", Toast.LENGTH_SHORT).show();
                        sc.setText("");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Not Found", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Enter input", Toast.LENGTH_SHORT).show();
            }
        });

    }
}