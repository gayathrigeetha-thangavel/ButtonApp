package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button btnPage1 = findViewById(R.id.btnPage1);
        Button btnPage2 = findViewById(R.id.btnPage2);
        Button btnPage3 = findViewById(R.id.btnPage3);

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Intent intentPage1 = new Intent(getApplicationContext(),MainActivity2.class);
                intentPage1.putExtra("Text",text);

                startActivity(intentPage1);
            }
        });

        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentPage2 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://developer.android.com/studio"));
                startActivity(intentPage2);
            }
        });

        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentPage3 = new Intent(MainActivity.this,MainActivity3.class);
                intentPage3.putExtra("imageId",R.drawable.spongebob);
                startActivity(intentPage3);
            }
        });
    }
}