package com.sridhar.photoframeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void GoPrev(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.imgs);
        int i = Integer.parseInt(img.getTag().toString());
        img.setTranslationX(-1000f);
        if(i==5) {
            img.setImageResource(R.drawable.four);
            img.setTag(4);
        }
        else if(i==4) {
            img.setImageResource(R.drawable.three);
            img.setTag(3);
        }
        else if(i==3) {
            img.setImageResource(R.drawable.two);
            img.setTag(2);
        }
        else if(i==2) {
            img.setImageResource(R.drawable.one);
            img.setTag(1);
        }
        else{
            img.setImageResource(R.drawable.five);
            img.setTag(5);
        }
        img.animate().translationXBy(1000f).setDuration(300);
    }
    public void GoNxt(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.imgs);
        int i = Integer.parseInt(img.getTag().toString());
        img.setTranslationX(1000f);
        if(i==3) {
            img.setImageResource(R.drawable.four);
            img.setTag(4);
        }
        else if(i==2) {
            img.setImageResource(R.drawable.three);
            img.setTag(3);
        }
        else if(i==1) {
            img.setImageResource(R.drawable.two);
            img.setTag(2);
        }
        else if(i==5) {
            img.setImageResource(R.drawable.one);
            img.setTag(1);
        }
        else{
            img.setImageResource(R.drawable.five);
            img.setTag(5);
        }
        img.animate().translationXBy(-1000f).setDuration(300);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}