package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    public static final String MY_RESTAURANT_NAME = "restaurantName";
    public static final String MY_MEAL_CHOICE = "mealChoice";
    public ArrayList<Object> favoritesArray;
    public ArrayList<String> favoriteStrings;
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

        addObject(restaurantName, mealChoice);
//        if (favoritesArray.size() != 0) {
//            for (int i = 0; i < favoritesArray.size(); i++) {
//                favoriteStrings.add(favoritesArray.get(i).getClass().getName());
//            }
//        }


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, favoriteStrings);
        favoritesChoices.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listFoods,
                                            View itemView, int position, long id) {

                        // Pass the Food name the user clicks on to BreakfastChoicesActivity
                        Intent intent = new Intent(FavoritesActivity.this,
                                FavoritesDisplayActivity.class);
                        intent.putExtra(FavoritesDisplayActivity.MY_OBJECT_ID, (int) id);
                        startActivity(intent);
                    }
                };
        favoritesChoices.setOnItemClickListener(itemClickListener);

    }

    public void addObject(String restaurantName, String mealChoice) {

        Restaurants[] array;
        if (mealChoice.equalsIgnoreCase("breakfast")) {
            array = Restaurants.breakfastPlaces;
        }

        else if (mealChoice.equalsIgnoreCase("lunch")) {
            array = Restaurants.breakfastPlaces;
        }

        else {
            array = Restaurants.breakfastPlaces;
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
