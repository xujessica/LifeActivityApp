package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class FavoritesDisplayActivity extends AppCompatActivity {

    public static final String MY_OBJECT_NAME = "name";
    public static final String MY_INDEX = "index";

    String name;
    int index;
    TextView rating;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites_display);


        Intent intent = getIntent();
        name = intent.getStringExtra(MY_OBJECT_NAME);
        index = intent.getIntExtra(MY_INDEX, 0);
        TextView displayName = (TextView) findViewById(R.id.nameFav);
        rating = (TextView) findViewById(R.id.ratingFav);
        description = (TextView) findViewById(R.id.descriptionFav);


        displayName.setText(name);
        checkObject();

    }

    public void onFavoritesClick(View v) {
        Intent intent = new Intent(this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void checkObject() {

        for (int i = 0; i < Restaurants.breakfastPlaces.length; i++) {
            if (Restaurants.breakfastPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Restaurants.breakfastPlaces[i].getRating()));
                description.setText(Restaurants.breakfastPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Restaurants.lunchPlaces.length; i++) {
            if (Restaurants.lunchPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Restaurants.lunchPlaces[i].getRating()));
                description.setText(Restaurants.lunchPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Restaurants.dinnerPlaces.length; i++) {
            if (Restaurants.dinnerPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Restaurants.dinnerPlaces[i].getRating()));
                description.setText(Restaurants.dinnerPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Action.length; i++) {
            if (Movies.Action[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Movies.Action[i].getRating()));
                description.setText(Movies.Action[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Comedy.length; i++) {
            if (Movies.Comedy[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Movies.Comedy[i].getRating()));
                description.setText(Movies.Comedy[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Romance.length; i++) {
            if (Movies.Romance[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Movies.Romance[i].getRating()));
                description.setText(Movies.Romance[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Kids.length; i++) {
            if (Movies.Kids[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Movies.Kids[i].getRating()));
                description.setText(Movies.Kids[i].getDescription());
            }
        }

        for (int i = 0; i < Concerts.Rap.length; i++) {
            if (Concerts.Rap[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Concerts.Rap[i].getFamousSong()));
                description.setText(Concerts.Rap[i].getDescription());
            }
        }

        for (int i = 0; i < Concerts.Pop.length; i++) {
            if (Concerts.Pop[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Concerts.Pop[i].getFamousSong()));
                description.setText(Concerts.Pop[i].getDescription());
            }
        }

        for (int i = 0; i < Concerts.Country.length; i++) {
            if (Concerts.Country[i].getName().equalsIgnoreCase(name)) {
                rating.setText(String.valueOf(Concerts.Country[i].getFamousSong()));
                description.setText(Concerts.Country[i].getDescription());
            }
        }

        for (int i = 0; i < Activities.Spring.length; i++) {
            if (Activities.Spring[i].getName().equalsIgnoreCase(name)) {
                description.setText(Activities.Spring[i].getLocation());
            }
        }

        for (int i = 0; i < Activities.Summer.length; i++) {
            if (Activities.Summer[i].getName().equalsIgnoreCase(name)) {
                description.setText(Activities.Summer[i].getLocation());
            }
        }

        for (int i = 0; i < Activities.Summer.length; i++) {
            if (Activities.Summer[i].getName().equalsIgnoreCase(name)) {
                description.setText(Activities.Summer[i].getLocation());
            }
        }

        for (int i = 0; i < Activities.Summer.length; i++) {
            if (Activities.Summer[i].getName().equalsIgnoreCase(name)) {
                description.setText(Activities.Summer[i].getLocation());
            }
        }

    }


        public void removeFavorite (View v){
            MainActivity.favoriteStrings.remove(name);
            for (int i = 0; i < MainActivity.favoriteStrings.size(); i++) {
                if (MainActivity.favoriteStrings.get(i).equalsIgnoreCase(name)) {
                    MainActivity.favoritesArray.remove(i);
                }
            }

            Intent displayIntent = new Intent(this, FavoritesActivity.class);
            startActivity(displayIntent);
        }

    }

