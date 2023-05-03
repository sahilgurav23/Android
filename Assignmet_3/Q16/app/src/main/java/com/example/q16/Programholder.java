package com.example.q16;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Programholder {
    TextView tv;
    ImageView iv;

    Programholder(View v)
    {
        iv = v.findViewById(R.id.ima);
        tv = v.findViewById(R.id.filename);
    }
}
