package com.example.q16;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

/*
  16.	Create application to demonstrate file explorer (Use ListView).
 */

public class MainActivity extends AppCompatActivity {

    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = (ListView) findViewById(R.id.lv);
        String[] files = {"Android","Backup","Bluetooth","ColorOS","CvDocScanner","DCIM","Documents","Download","MIUI","Movies","Music","oppo_logo","Photos"};
        Listadapter listadapter = new Listadapter(this,files);
        LV.setAdapter(listadapter);
    }
}