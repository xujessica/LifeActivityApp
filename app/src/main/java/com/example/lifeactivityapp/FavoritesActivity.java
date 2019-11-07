package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    private int mData;
    public static final String MY_RESTAURANT_NAME = "restaurantName";
    public static final String MY_MEAL_CHOICE = "mealChoice";
    public ArrayList<Object> favoritesArray;
    public static ArrayList<String> favoriteStrings;
    ListView favoritesChoices;
    String mealChoice;
    String restaurantName;
    String displayName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Intent intent = getIntent();
        mealChoice = intent.getStringExtra(MY_MEAL_CHOICE);
        restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME);
        favoritesChoices = (ListView) findViewById(R.id.favoritesChoices);
        favoritesArray = new ArrayList<>();
        favoriteStrings = new ArrayList<>();



        try {
            addObject(restaurantName, mealChoice);

            if (favoriteStrings.size() == 0) {
                throw new NullPointerException();
            }

            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, favoriteStrings);
            favoritesChoices.setAdapter(arrayAdapter);

            AdapterView.OnItemClickListener itemClickListener =
                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> favoritesChoices,
                                                View itemView, int position, long id) {

                            String name = favoriteStrings.get(position).toString();

                            Intent intent = new Intent(FavoritesActivity.this,
                                    FavoritesDisplayActivity.class);
                            intent.putExtra(FavoritesDisplayActivity.MY_OBJECT_NAME, name);
                            intent.putExtra(FavoritesDisplayActivity.MY_MEAL_CHOICE, mealChoice);
                            startActivity(intent);
                        }
                    };
            favoritesChoices.setOnItemClickListener(itemClickListener);
        }

        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No Favorites added yet";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void addObject(String restaurantName, String mealChoice) {

        Restaurants[] array;
        if (mealChoice.equalsIgnoreCase("breakfast")) {
            array = Restaurants.breakfastPlaces;
        }

        else if (mealChoice.equalsIgnoreCase("lunch")) {
            array = Restaurants.lunchPlaces;
        }

        else {
            array = Restaurants.dinnerPlaces;
        }


        for (int i = 0; i < array.length; i++) {
            if (restaurantName.equalsIgnoreCase(array[i].getRestaurant())) {
                favoritesArray.add(array[i]);
                displayName = array[i].getRestaurant();
                favoriteStrings.add(displayName);
            }
        }
    }


}

