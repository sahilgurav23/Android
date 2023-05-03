package com.example.q2;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);
        TextView tv = (TextView) findViewById(R.id.chan);

        String ch = getIntent().getStringExtra("Message");
        tv.setText(String.valueOf(ch));
    }
}
