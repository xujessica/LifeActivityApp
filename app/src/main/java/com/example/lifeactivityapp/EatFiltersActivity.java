package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class EatFiltersActivity extends AppCompatActivity {

    public static final String MY_EAT_CHOICE = "eatChoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_filters);

        Intent intent = getIntent();
        String detailedChoice = intent.getStringExtra(MY_EAT_CHOICE);

    }

}
