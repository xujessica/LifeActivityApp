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
    public static final String MY_ENTERTAINMENT_NAME = "entertainment";
    public static final String FAMOUS_SONG = "song";
    public static final String IDK = "idk";
    public static Restaurants object;
    String displayChoice;
    ConstraintLayout filterDisplayLayout;
    String restaurantName;
    String entertainmentChoice;
    String info;
    String song, idk;

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_display);

        Intent intent = getIntent();
        displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE); // movie, conerts, or activtieis
        restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME); // Names

        entertainmentChoice = intent.getStringExtra(MY_ENTERTAINMENT_NAME); // Avengers Movie

        info = intent.getStringExtra(MY_DESCRIPTION); // Description
        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS); // ratingStars
        song = intent.getStringExtra(FAMOUS_SONG); // Description
        idk = intent.getStringExtra(IDK); // Description


        TextView filterDisplayTitle = (TextView) findViewById(R.id.filterDisplayTitle);
        TextView name = (TextView) findViewById(R.id.name);
        TextView rating = (TextView) findViewById(R.id.rating);
        TextView description = (TextView) findViewById(R.id.description);
        filterDisplayLayout = (ConstraintLayout) findViewById(R.id.filterDisplayLayout);

        setBackground();

        if (displayChoice.equalsIgnoreCase("breakfast")) {
            filterDisplayTitle.setText("BREAKFAST");
            filterDisplayTitle.setTextSize(40);

            name.setText(restaurantName);
            description.setText(info);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("lunch")) {
            filterDisplayTitle.setText("LUNCH");
            filterDisplayTitle.setTextSize(60);

            name.setText(restaurantName);
            description.setText(info);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("dinner")) {
            filterDisplayTitle.setText("DINNER");
            filterDisplayTitle.setTextSize(50);

            name.setText(restaurantName);
            description.setText(info);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("movies")) {
            filterDisplayTitle.setText("MOVIES");
            filterDisplayTitle.setTextSize(50);

            name.setText(entertainmentChoice);
            description.setText(info);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("concerts")) {
            filterDisplayTitle.setText("CONCERTS");
            filterDisplayTitle.setTextSize(50);

            name.setText(entertainmentChoice);
            description.setText(info);
            rating.setText(song);
        }
        if (displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayTitle.setText("ACTIVITIES");
            filterDisplayTitle.setTextSize(40);

            name.setText(entertainmentChoice);
            description.setText(info);
            rating.setText(idk);
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
            startActivity(pastIntent);
        }
        if (displayChoice.equalsIgnoreCase("movies") ||
                displayChoice.equalsIgnoreCase("concerts") ||
                displayChoice.equalsIgnoreCase("activities")) {
            Intent pastIntent = new Intent(this, EntertainmentFiltersActivity.class);
            pastIntent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, displayChoice);
            startActivity(pastIntent);
        }
    }


    // keep fonts consistent and make text more visible

    public void addToFavoritesOnClick(View v) {
        Intent favIntent = new Intent(this,FavoritesActivity.class);
        favIntent.putExtra(FavoritesActivity.MY_RESTAURANT_NAME, restaurantName);
        favIntent.putExtra(FavoritesActivity.MY_MEAL_CHOICE, displayChoice);
        startActivity(favIntent);
    }


}
