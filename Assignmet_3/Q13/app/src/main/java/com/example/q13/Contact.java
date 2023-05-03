package com.example.q13;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Contact extends AppCompatActivity {

    ImageView ima;
    TextView na,cont,ema;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        ima = (ImageView) findViewById(R.id.imge);
        na = (TextView) findViewById(R.id.name);
        cont = (TextView) findViewById(R.id.contact);
        ema = (TextView)  findViewById(R.id.emailid);

        Intent intent = getIntent();
        ima.setImageURI(Uri.parse(intent.getStringExtra("Image")));
        na.setText(intent.getStringExtra("Name"));
        cont.setText(intent.getStringExtra("Contact"));
        ema.setText(intent.getStringExtra("Email"));
    }
}