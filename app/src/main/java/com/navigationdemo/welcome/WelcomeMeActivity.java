package com.navigationdemo.welcome;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.navigationdemo.R;

public class WelcomeMeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = getIntent().getStringExtra("myname");
        TextView showWelcome = findViewById(R.id.showWelcome);
        showWelcome.setText("Welcome " + name);
    }
}
