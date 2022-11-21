package com.example.da;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private ImageButton StartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = (TextView)  findViewById(R.id.helloText);
        StartButton = (ImageButton) findViewById(R.id.StartButton);
    }

    public void df(View view) {
        StartButton.setImageResource(R.drawable.vkl);
        helloText.setVisibility(View.VISIBLE);
        StartButton.setClickable(false);

    }
}