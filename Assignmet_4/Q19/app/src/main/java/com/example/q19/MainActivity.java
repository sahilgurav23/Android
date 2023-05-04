package com.example.q19;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

/*
 19.	Construct an app that toggles a light bulb on and off when the user clicks on toggle button
*/

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        tb = (ToggleButton) findViewById(R.id.bt);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (tb.isChecked())
                    img.setImageResource(R.drawable.off);
                else
                    img.setImageResource(R.drawable.on);

            }
        });
    }
}