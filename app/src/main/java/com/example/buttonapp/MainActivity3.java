package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView;
    int imageValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            imageValue = bundle.getInt("imageId");
        }
        imageView.setImageResource(imageValue);
    }
}