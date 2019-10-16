package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEatClick(View v) {
        Intent intent = new Intent(this, EatChoicesActivity.class);
        startActivity(intent);
    }

    public void onEntertainmentClick(View v) {
        Intent intent = new Intent(this, EntertainmentChoicesActivity.class);
        startActivity(intent);
    }

}
