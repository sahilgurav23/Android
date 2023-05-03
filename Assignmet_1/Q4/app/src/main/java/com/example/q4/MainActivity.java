package com.example.q4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/*
 4.	Create simple application with Login Screen. On successful login, gives message
 go to next Activity (Without Using Database).
 */

public class MainActivity extends AppCompatActivity {

    EditText email,pas;
    Button bt;

    String id="sahilgurav233@gmail.com";
    String passwor = "Gurav@";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        pas = (EditText) findViewById(R.id.pass);
        bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.equals(email.getText().toString()) && passwor.equals((pas.getText().toString())))
                {
                    Toast.makeText(MainActivity.this, "Succesful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),Home.class));
                }
                else
                    Toast.makeText(MainActivity.this, "Invalid Credinals", Toast.LENGTH_SHORT).show();

            }
        });
    }
}