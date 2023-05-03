package com.example.q13;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/*

13.	Create a custom "Contact" layout to hold multiple pieces of information, including: Photo, Name, Contact Number, E-mail id.
*/

public class MainActivity extends AppCompatActivity {


    ImageView iv ;
    EditText na,conta, ema;

    Button bt;

    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv= (ImageView) findViewById(R.id.im);
        na = (EditText)findViewById(R.id.name);
        conta = (EditText)findViewById(R.id.cn);
        ema = (EditText)findViewById(R.id.ei);
        bt = (Button) findViewById(R.id.butto);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pickPhoto = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);//Implicit
                pickPhoto.setType("image/*");
                startActivityForResult(pickPhoto, 1);
            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Contact.class);//Explicit
                intent.putExtra("Name",na.getText().toString());
                intent.putExtra("Contact",conta.getText().toString());
                intent.putExtra("Email",ema.getText().toString());
                intent.putExtra("Image",uri.toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            uri = data.getData();
            iv.setImageURI(uri);
        }
    }
}