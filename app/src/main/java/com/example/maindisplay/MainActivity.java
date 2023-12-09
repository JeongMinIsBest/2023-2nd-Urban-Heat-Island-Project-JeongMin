package com.example.maindisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 상단의 버튼 2개 추가
        ImageButton leftbutton = findViewById(R.id.QuizButton);
        ImageButton rightbutton = findViewById(R.id.GuideButton);

        // 퀴즈 버튼 활성화
        leftbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, GuideButton.class);
                startActivity(intent);
            }
        });

        // 가이드 버튼 활성화
        rightbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, QuizButton.class);
                startActivity(intent);
            }
        });

    }
}