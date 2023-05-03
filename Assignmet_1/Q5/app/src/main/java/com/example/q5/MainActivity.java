package com.example.q5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

/* 5.	Create First Activity to accept information like Student First Name, Middle Name, Last Name,
        Date of birth, Address, Email ID and display all information on Second Activity when user
         click on Submit button.*/

public class MainActivity extends AppCompatActivity {

    EditText fn,mn,ls,ad,em;
    DatePicker dp;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn = (EditText) findViewById(R.id.fnedittext);
        mn = (EditText) findViewById(R.id.mdedittext);
        ls = (EditText) findViewById(R.id.lnedittext);
        ad = (EditText) findViewById(R.id.adedittext);
        em = (EditText) findViewById(R.id.emedittext);
        dp = (DatePicker) findViewById(R.id.dp);
        bt = (Button) findViewById(R.id.submitbt);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Show.class);//Explicit

                intent.putExtra("First_name",fn.getText().toString());
                intent.putExtra("Middle_name",mn.getText().toString());
                intent.putExtra("Last_name",ls.getText().toString());
                intent.putExtra("Address",ad.getText().toString());
                intent.putExtra("Email_id",em.getText().toString());
                intent.putExtra("Date",dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
                startActivity(intent);
            }
        });

    }
}