package com.example.q23;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Deposite extends Money {

    Button bt;
    EditText ed;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deposite);

        ed = (EditText) findViewById(R.id.dep);
        bt = (Button) findViewById(R.id.btt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Money m = new Money();
                if(!TextUtils.isEmpty(ed.getText().toString())) {
                    m.setCash(m.getCash() + Integer.parseInt(String.valueOf(ed.getText())));
                    Toast.makeText(Deposite.this, ed.getText()+" Cash is deposite successful", Toast.LENGTH_SHORT).show();
                    ed.setText(" ");
                }
                else
                    Toast.makeText(Deposite.this, "Please Enter Amount", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
