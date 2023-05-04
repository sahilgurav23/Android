package com.example.q23;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Withdrawal extends AppCompatActivity {
    EditText ed;
    Button but;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdrawal);

        ed = (EditText) findViewById(R.id.with);
        but = (Button) findViewById(R.id.bt);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Money m = new Money();
                if(!TextUtils.isEmpty(ed.getText().toString())){
                    if(Integer.parseInt(String.valueOf(ed.getText())) > m.getCash())
                        Toast.makeText(Withdrawal.this, "Insufficient Money", Toast.LENGTH_SHORT).show();
                    else {
                        Toast.makeText(Withdrawal.this, ed.getText()+" Cash is withdrawal successful ", Toast.LENGTH_SHORT).show();
                        m.setCash(m.getCash() - Integer.parseInt(String.valueOf(ed.getText())));
                        ed.setText(" ");
                    }
                }
                else
                    Toast.makeText(Withdrawal.this, "Please Enter Amount", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
