package com.example.main;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class Asia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);
        LayoutInflater ltInflater = getLayoutInflater();
        View view = ltInflater.inflate(R.layout.content_asia, null, false);
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.asia);

    }

}
