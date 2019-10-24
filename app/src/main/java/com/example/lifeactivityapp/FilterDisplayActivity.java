package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FilterDisplayActivity extends AppCompatActivity {

    public static final String MY_RESTAURANT_NAME = "name";
    public static final String MY_DESCRIPTION = "description";
    public static final String MY_RATING_STARS = "ratingStars";
    ArrayList<Restaurants> newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_display);

        Intent intent = getIntent();
        String restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME);
        String restaurantInfo = intent.getStringExtra(MY_DESCRIPTION);
        String ratingStars = intent.getStringExtra(MY_RATING_STARS);
        TextView name = (TextView) findViewById(R.id.name);
        TextView rating = (TextView) findViewById(R.id.rating);
        TextView description = (TextView) findViewById(R.id.description);

        name.setText(restaurantName);
        description.setText(restaurantInfo);
        rating.setText(ratingStars);

    }



}
