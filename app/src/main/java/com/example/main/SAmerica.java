package com.example.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class SAmerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samerica);
        LayoutInflater ltInflater = getLayoutInflater();
        View view = ltInflater.inflate(R.layout.content_samerica, null, false);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.samerica);
    }

}
