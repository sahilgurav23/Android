package com.example.q3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Itemclick extends AppCompatActivity {

    TextView tex;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemclick);
        tex = (TextView) findViewById(R.id.itemname);
        Intent intent = getIntent();
        String str = intent.getStringExtra("item");
        tex.setText(str);
    }
}
