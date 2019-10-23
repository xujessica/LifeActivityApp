package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BreakfastChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_choices);
    }

    public void onBreakfastFilterClick(View v){
        Intent intent = new Intent(this, BreakfastFilterChoices.class);
        startActivity(intent);
    }
}
