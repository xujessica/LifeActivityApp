package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FilterDisplayActivity extends AppCompatActivity {

    public static final String MY_DISPLAY_CHOICE = "displayChoice";
    public static final String MY_RESTAURANT_NAME = "name";
    public static final String MY_DESCRIPTION = "description";
    public static final String MY_RATING_STARS = "ratingStars";
    ArrayList<Restaurants> newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_display);

        Intent intent = getIntent();
        String displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE);
        String restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME);
        String restaurantInfo = intent.getStringExtra(MY_DESCRIPTION);
        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS);
        TextView filterDisplayTitle = (TextView) findViewById(R.id.filterDisplayTitle);
        TextView name = (TextView) findViewById(R.id.name);
        TextView rating = (TextView) findViewById(R.id.rating);
        TextView description = (TextView) findViewById(R.id.description);

        if (displayChoice.equalsIgnoreCase("breakfast")) {
            filterDisplayTitle.setText("BREAKFAST");
            filterDisplayTitle.setTextSize(40);

            name.setText(restaurantName);
            description.setText(restaurantInfo);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("lunch")) {
            filterDisplayTitle.setText("LUNCH");
            filterDisplayTitle.setTextSize(60);

            name.setText(restaurantName);
            description.setText(restaurantInfo);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("dinner")) {
            filterDisplayTitle.setText("DINNER");
            filterDisplayTitle.setTextSize(50);

            name.setText(restaurantName);
            description.setText(restaurantInfo);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("movies")) {
            filterDisplayTitle.setText("MOVIES");
            filterDisplayTitle.setTextSize(50);
        }
        if (displayChoice.equalsIgnoreCase("concerts")) {
            filterDisplayTitle.setText("CONCERTS");
            filterDisplayTitle.setTextSize(50);
        }
        if (displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayTitle.setText("ACTIVITIES");
            filterDisplayTitle.setTextSize(40);
        }


    }

    // suraj, from your entertainmentFiltersActivity you need to pass in the "displayChoice" so whether
    // it's a movie, concert, or activity

}
