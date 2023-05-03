package com.example.q8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/*
 8.	Design an Android Portrait and Landscape Screen Layout Example
 */
public class MainActivity extends AppCompatActivity {

    RadioButton yeartomonth, mothtoyear;
    RadioGroup radioGroup;

    TextView an;
    EditText tv;
    Button bt;
    Double finalAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup =(RadioGroup) findViewById(R.id.rg);
        yeartomonth = (RadioButton) findViewById(R.id.ytm);
        mothtoyear = (RadioButton) findViewById(R.id.mty);
        tv = (EditText) findViewById(R.id.rate);
        an = (TextView) findViewById(R.id.answer);
        bt = (Button) findViewById(R.id.bt);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String ch = tv.getText().toString();
                if(ch.equals(""))
                    Toast.makeText(MainActivity.this, "Input is empty", Toast.LENGTH_SHORT).show();
                else{
                    int n= Integer.parseInt(tv.getText().toString());
                    switch (i)
                    {
                        case R.id.mty:
                        {
                            finalAnswer =((double)n/100)*12;
                            break;
                        }
                        case R.id.ytm:
                        {
                            finalAnswer = (Math.pow(((float)12/100)+1,0.08333333333)-1)*100;
                            break;
                        }
                    }
                }

            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            an.setText("Converted Rate is "+String.valueOf(finalAnswer));
            }
        });
    }
}