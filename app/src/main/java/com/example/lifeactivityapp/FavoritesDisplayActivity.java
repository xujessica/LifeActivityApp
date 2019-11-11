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

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    public void checkObject() {

        MainActivity.favoritesArray.get(index).getClass();

        for (int i = 0; i < Restaurants.breakfastPlaces.length; i++) {
            if (Restaurants.breakfastPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(Restaurants.breakfastPlaces[i].getRating().toString());
                description.setText(Restaurants.breakfastPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Restaurants.lunchPlaces.length; i++) {
            if (Restaurants.lunchPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(Restaurants.lunchPlaces[i].getRating().toString());
                description.setText(Restaurants.lunchPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Restaurants.dinnerPlaces.length; i++) {
            if (Restaurants.dinnerPlaces[i].getRestaurant().equalsIgnoreCase(name)) {
                rating.setText(Restaurants.dinnerPlaces[i].getRating().toString());
                description.setText(Restaurants.dinnerPlaces[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Action.length; i++) {

        }

    }


    public void removeFavorite(View v) {
        MainActivity.favoriteStrings.remove(name);
        for (int i = 0; i < MainActivity.favoriteStrings.size(); i++) {
            if (MainActivity.favoriteStrings.get(i).equalsIgnoreCase(name)) {
                MainActivity.favoritesArray.remove(i);
            }
        }

        Context context = getApplicationContext();
        CharSequence text = "Removed from Favorites";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                0, 0);

    }

}
