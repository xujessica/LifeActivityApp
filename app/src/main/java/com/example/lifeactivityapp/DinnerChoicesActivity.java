package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DinnerChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_choices);
    }

    public void onFilterClick(View v){
        Intent intent = new Intent(this, DinnerFilterChoices.class);
        startActivity(intent);
    }

}
