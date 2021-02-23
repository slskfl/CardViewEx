package com.example.cardviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ItemLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout1);
        layout.setImage(R.drawable.mov01);
        layout.setTvTitle("써니");
        layout.setTvContent("7공주 프로젝트");
    }
}