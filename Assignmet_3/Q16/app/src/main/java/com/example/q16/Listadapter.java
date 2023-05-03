package com.example.q16;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Listadapter extends ArrayAdapter {
    Context context;
    int image;
    String[] names;

    public Listadapter(Context context, String[] names) {
        super(context,R.layout.activity_view,R.id.filename,names);
        this.names=names;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View singleItem = convertView;
        Programholder holder = null;
        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.activity_view,parent,false);
            holder = new Programholder(singleItem);
            singleItem.setTag(holder);
        }
        else {
            holder =(Programholder) singleItem.getTag();
        }
        holder.iv.setImageResource(R.drawable.file);
        holder.tv.setText(names[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Click "+names[position], Toast.LENGTH_SHORT).show();
            }
        });
        return singleItem;
    }
}
