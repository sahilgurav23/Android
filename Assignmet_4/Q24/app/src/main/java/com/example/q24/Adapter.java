package com.example.q24;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.Objects;

/*
   PagerAdapter is an abstract class that is used to implement adapters
   for ViewPager, which is a view group that allows the user to swipe
   left and right to navigate through a collection of views.
 */
public class Adapter extends PagerAdapter {
    Context context;
    int[] images;

    /*
       LayoutInflater is used to inflate or convert an XML layout
       file into its corresponding View objects in memory, which
       can then be used in an activity or fragment
     */
    LayoutInflater mLayoutInflater;

    public Adapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        // inflating the item.xml
        View itemView = mLayoutInflater.inflate(R.layout.item, container, false);
        // referencing the image view from the item.xml file
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageViewMain);
        // setting the image in the imageView
        imageView.setImageResource(images[position]);
        // Adding the View
        Objects.requireNonNull(container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}
