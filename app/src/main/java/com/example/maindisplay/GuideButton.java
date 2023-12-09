package com.example.maindisplay;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class GuideButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_viewpager);

        ViewPager guideviewpager = findViewById(R.id.GuideViewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        guideviewpager.setAdapter(adapter);

    }
}
