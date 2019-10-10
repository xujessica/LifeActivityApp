package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EatChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_choices);
    }

    public void onBreakfastClick(View v) {
        Intent intent = new Intent(this, BreakfastChoicesActivity.class);
        startActivity(intent);
    }

    public void onLunchClick(View v) {
        Intent intent = new Intent(this, LunchChoicesActivity.class);
        startActivity(intent);
    }

    public void onDinnerClick(View v) {
        Intent intent = new Intent(this, DinnerChoicesActivity.class);
        startActivity(intent);
    }

}
