package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class FavoritesDisplayActivity extends AppCompatActivity {

    public static final String MY_OBJECT_NAME = "object";
    public static final String MY_MEAL_CHOICE = "mealChoice";
    String mealChoice;
    String name;
    TextView rating;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites_display);


        Intent intent = getIntent();
        name = intent.getStringExtra(MY_OBJECT_NAME);
        mealChoice = intent.getStringExtra(MY_MEAL_CHOICE);
        TextView displayName = (TextView) findViewById(R.id.nameFav);
        rating = (TextView) findViewById(R.id.ratingFav);
        description = (TextView) findViewById(R.id.descriptionFav);

        displayName.setText(name);
        checkObject(mealChoice);

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void checkObject(String mealChoice) {
        Restaurants[] temp;

        if (mealChoice.equalsIgnoreCase("breakfast")) {
            temp = Restaurants.breakfastPlaces;
        }

        else if (mealChoice.equalsIgnoreCase("lunch")) {
            temp = Restaurants.lunchPlaces;
        }

        else {
            temp = Restaurants.dinnerPlaces;
        }


        for (int i = 0; i < temp.length; i++) {
            if (name.equalsIgnoreCase(temp[i].getRestaurant())) {
                rating.setText(temp[i].getRating().toString());
                description.setText(temp[i].getDescription());
            }
        }
    }


    public void removeFavorite(View v) {

    }

}
