package com.domenicpolidoro.codetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    // change image to be loaded here
    private String backgroundImageUrl = "http://media.vector4free.com/normal/Tree-Trunk-Branches-Vector-Illustration-screen.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // dynamically load image to background with a safeguard on failure
        Glide.with(this)
                .load(backgroundImageUrl)
                .error(R.mipmap.ic_launcher_round)
                .into(((ImageView)findViewById(R.id.toolbarImage)));
    }
}
