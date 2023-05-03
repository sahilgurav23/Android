package com.example.q9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/*
9.	Create the simple calculator shown below also perform appropriate operation
*/

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btzero,btadd,btsub,btdiv,btmulti, btdot,btclear,btequal;
    static ArrayList<String> op = new ArrayList<String>();
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button) findViewById(R.id.one1);
        bt2=(Button) findViewById(R.id.two2);
        bt3=(Button) findViewById(R.id.three3);
        bt4=(Button) findViewById(R.id.four4);
        bt5=(Button) findViewById(R.id.five5);
        bt6=(Button) findViewById(R.id.six6);
        bt7=(Button) findViewById(R.id.seven7);
        bt8=(Button) findViewById(R.id.eight8);
        bt9=(Button) findViewById(R.id.nine9);
        btzero=(Button) findViewById(R.id.zeros);
        btadd=(Button) findViewById(R.id.additi);
        btsub=(Button) findViewById(R.id.substra);
        btdiv=(Button) findViewById(R.id.division);
        btmulti=(Button) findViewById(R.id.multipi);
        btdot=(Button) findViewById(R.id.dott);
        btclear=(Button) findViewById(R.id.clears);
        btequal=(Button) findViewById(R.id.equal);
        tv= (EditText) findViewById(R.id.display);

        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("1");
                else
                    tv.setText(tv.getText().toString()+"1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("2");
                else
                    tv.setText(tv.getText().toString()+"2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("3");
                else
                    tv.setText(tv.getText().toString()+"3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("4");
                else
                    tv.setText(tv.getText().toString()+"4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("5");
                else
                    tv.setText(tv.getText().toString()+"5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("6");
                else
                    tv.setText(tv.getText().toString()+"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("7");
                else
                    tv.setText(tv.getText().toString()+"7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("8");
                else
                    tv.setText(tv.getText().toString()+"8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("9");
                else
                    tv.setText(tv.getText().toString()+"9");
            }
        });

        btzero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("0");
                else
                    tv.setText(tv.getText().toString()+"0");
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("+");
                else
                    tv.setText(tv.getText().toString()+"+");
                op.add("+");
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("-");
                else
                    tv.setText(tv.getText().toString()+"-");
                op.add("-");
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("/");
                else
                    tv.setText(tv.getText().toString()+"/");
                op.add("/");
            }
        });

        btmulti.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText("*");
                else
                    tv.setText(tv.getText().toString()+"*");
                op.add("*");
            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv.getText()==" ")
                    tv.setText(".");
                else
                    tv.setText(tv.getText().toString()+".");
            }
        });

        btclear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String ch = tv.getText().toString();
                String b = Double.toString(result(ch));

                tv.setText(b);
            }
        });
    }
    
   protected static double result(String str)
   {
       ArrayList<String> al = new ArrayList<String>();
       int start,end,i=0, p=0;
       start=0;
       Double ans;

       for(i=0; i<str.length(); i++)
       {
           if(str.charAt(i)!='+' && str.charAt(i)!='-' && str.charAt(i)!='/' && str.charAt(i)!='*')
           {
               continue;
           }
           else
           {
               al.add(str.subSequence(start,i).toString());
               start=i+1;
           }
       }
       al.add(str.subSequence(start,i).toString());

       while(al.size()!=1 && p!=op.size())
       {
           if(op.get(p)=="+")
           {
               ans=Double.parseDouble(al.get(0)) + Double.parseDouble(al.get(1));
               al.remove(0);
               al.remove(0);
               al.add(0,String.valueOf(ans));
           }
           else if(op.get(p)=="-")
           {
               ans=Double.parseDouble(al.get(0)) - Double.parseDouble(al.get(1));
               al.remove(0);
               al.remove(0);
               al.add(0,String.valueOf(ans));
           }
           else if(op.get(p)=="/")
           {
               ans=Double.parseDouble(al.get(0)) / Double.parseDouble(al.get(1));
               al.remove(0);
               al.remove(0);
               al.add(0,String.valueOf(ans));
           }
           else if(op.get(p)=="*")
           {
               ans=Double.parseDouble(al.get(0)) * Double.parseDouble(al.get(1));
               al.remove(0);
               al.remove(0);
               al.add(0,String.valueOf(ans));
           }
           p++;
       }
       ans=Double.parseDouble(al.get(0));
       op.clear();
       return ans;
   }    
}