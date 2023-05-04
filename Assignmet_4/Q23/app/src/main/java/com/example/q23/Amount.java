package com.example.q23;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Amount extends Money {

    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amount);

        Money m = new Money();
        tv = (TextView) findViewById(R.id.cur);
        tv.setText(String.valueOf(m.getCash()));
    }
}
