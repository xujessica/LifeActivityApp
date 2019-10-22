package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EntertainmentFiltersActivity extends AppCompatActivity {

    public static final String MY_ENTERTAINMENT_CHOICES = "entertainmentChoices";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_filters);
    }
}
