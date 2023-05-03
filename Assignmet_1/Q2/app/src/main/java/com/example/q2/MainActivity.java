package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* 2.	Create a Simple Application Which Send ―Hello‖ message from one activity to another with help of Button (Use Intent).  */

public class MainActivity extends AppCompatActivity {
    TextView hew;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hew = (TextView) findViewById(R.id.mess);
        bt = (Button) findViewById(R.id.butt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ch = hew.getText().toString(); //Get data from EditText
                Intent intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("Message",ch);
                startActivity(intent);
            }
        });

    }
}