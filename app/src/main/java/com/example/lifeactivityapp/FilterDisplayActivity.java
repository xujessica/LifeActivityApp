package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FilterDisplayActivity extends AppCompatActivity {

    public static final String MY_DISPLAY_CHOICE = "displayChoice";
    public static final String MY_RESTAURANT_NAME = "name";
    public static final String MY_DESCRIPTION = "description";
    public static final String MY_RATING_STARS = "ratingStars";
    public static Restaurants object;
    String displayChoice;
    ConstraintLayout filterDisplayLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_display);

        Intent intent = getIntent();
        displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE);
        String restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME);
        String restaurantInfo = intent.getStringExtra(MY_DESCRIPTION);
        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS);
        TextView filterDisplayTitle = (TextView) findViewById(R.id.filterDisplayTitle);
        TextView name = (TextView) findViewById(R.id.name);
        TextView rating = (TextView) findViewById(R.id.rating);
        TextView description = (TextView) findViewById(R.id.description);

        findObject(Restaurants.breakfastPlaces, restaurantName);
        findObject(Restaurants.lunchPlaces, restaurantName);
        findObject(Restaurants.dinnerPlaces, restaurantName);

        setBackground();
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

    public void findObject(Restaurants[] array, String restaurantName) {
        for (int i = 0; i < array.length; i++) {
            if (restaurantName.equalsIgnoreCase(array[i].getRestaurant())) {
                object = array[i];
            }
        }
    }

    public void setBackground() {
        if (displayChoice.equalsIgnoreCase("breakfast") ||
                displayChoice.equalsIgnoreCase("lunch") ||
                displayChoice.equalsIgnoreCase("dinner")) {
            filterDisplayLayout.setBackgroundResource(R.drawable.blue_gradient);
        }

        if (displayChoice.equalsIgnoreCase("movies") ||
                displayChoice.equalsIgnoreCase("concerts") ||
                displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayLayout.setBackgroundResource(R.drawable.red_gradient);
        }
    }

    // suraj, from your entertainmentFiltersActivity you need to pass in the "displayChoice" so whether
    // it's a movie, concert, or activity

    public void newFilterOnClick(View v) {
        if (displayChoice.equalsIgnoreCase("breakfast") ||
                displayChoice.equalsIgnoreCase("lunch") ||
                        displayChoice.equalsIgnoreCase("dinner")) {
            Intent pastIntent = new Intent(this, EatFiltersActivity.class);
            pastIntent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, displayChoice);
        }
    }

    // keep fonts consistent and make text more visible

    public static void addToFavoritesOnClick(View v) {
        FavoritesActivity.addToFavorites(object);
    }


}
