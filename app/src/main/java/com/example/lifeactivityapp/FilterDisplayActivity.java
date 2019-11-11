package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class FilterDisplayActivity extends AppCompatActivity {

    public static final String MY_DISPLAY_CHOICE = "displayChoice";
    public static final String MY_RESTAURANT_NAME = "name";
    public static final String MY_DESCRIPTION = "description";
    public static final String MY_RATING_STARS = "ratingStars";
    public static final String MY_ENTERTAINMENT_NAME = "entertainment";
    public static final String MY_FAMOUS_SONG = "song";
    public static final String MY_ENTERTAINMENT_TYPE = "entertainmentType";
    String displayChoice;
    ConstraintLayout filterDisplayLayout;
    String restaurantName;
    String entertainmentName;
    String entertainmentType;
    String info;
    String song;

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
        displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE); // movie, concerts, or activtieis
        restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME); // Names
        entertainmentName = intent.getStringExtra(MY_ENTERTAINMENT_NAME); // Avengers Movie
        entertainmentType = intent.getStringExtra(MY_ENTERTAINMENT_TYPE); // Avengers Movie
        info = intent.getStringExtra(MY_DESCRIPTION); // Description
        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS); // ratingStars
        song = intent.getStringExtra(MY_FAMOUS_SONG); // Description


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

            name.setText(entertainmentName);
            description.setText(info);
            rating.setText(ratingStars + " stars");
        }
        if (displayChoice.equalsIgnoreCase("concerts")) {
            filterDisplayTitle.setText("CONCERTS");
            filterDisplayTitle.setTextSize(50);

            name.setText(entertainmentName);
            description.setText(info);
            rating.setText(song);
        }
        if (displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayTitle.setText("ACTIVITIES");
            filterDisplayTitle.setTextSize(40);

            name.setText(entertainmentName);
            description.setText(info);
            rating.setVisibility(View.INVISIBLE);;
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


    public void addToFavoritesOnClick(View v) {

        if (entertainmentName == null) {
            MainActivity.favoriteStrings.add(restaurantName);
        }
        if (restaurantName == null) {
            MainActivity.favoriteStrings.add(entertainmentName);
        }
        addObject();

        Context context = getApplicationContext();
        CharSequence text = "Added to Favorites";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                0, 0);
    }

    public void addObject() {

        if (entertainmentName == null) {
            Restaurants[] array;
            if (displayChoice.equalsIgnoreCase("breakfast")) {
                array = Restaurants.breakfastPlaces;
            } else if (displayChoice.equalsIgnoreCase("lunch")) {
                array = Restaurants.lunchPlaces;
            } else {
                array = Restaurants.dinnerPlaces;
            }


            for (int i = 0; i < array.length; i++) {
                if (restaurantName.equalsIgnoreCase(array[i].getRestaurant())) {
                    MainActivity.favoritesArray.add(array[i]);
                }
            }
        }

        if (restaurantName == null) {

            if (displayChoice.equalsIgnoreCase("movies")) {
                Movies[] array;

                if (entertainmentType.equalsIgnoreCase("Action")) {
                    array = Movies.Action;
                }
                else if (entertainmentType.equalsIgnoreCase("Comedy")) {
                    array = Movies.Comedy;
                }
                else if (entertainmentType.equalsIgnoreCase("Romance")) {
                    array = Movies.Romance;
                }
                else {
                    array = Movies.Kids;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

            if (displayChoice.equalsIgnoreCase("concerts")) {
                Concerts[] array;

                if (entertainmentType.equalsIgnoreCase("rap")) {
                    array = Concerts.Rap;
                }
                else if (entertainmentType.equalsIgnoreCase("pop")) {
                    array = Concerts.Pop;
                }
                else {
                    array = Concerts.Country;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

            if (displayChoice.equalsIgnoreCase("activities")) {
                Activities[] array;

                if (entertainmentType.equalsIgnoreCase("Spring")) {
                    array = Activities.Spring;
                }
                else if (entertainmentType.equalsIgnoreCase("Summer")) {
                    array = Activities.Summer;
                }
                else if (entertainmentType.equalsIgnoreCase("Fall")) {
                    array = Activities.Fall;
                }
                else {
                    array = Activities.Winter;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

        }
    }


    }
