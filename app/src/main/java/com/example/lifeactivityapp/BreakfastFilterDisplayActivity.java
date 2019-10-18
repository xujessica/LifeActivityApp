package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class BreakfastFilterDisplayActivity extends AppCompatActivity {

    public static final String MY_SERVICE_TYPE = "serviceType";
    public static final String MY_PRICE_PREFERENCE = "pricePreference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_filter_display);


        //test
//

//        { Restaurants breakfast = Restaurants.breakfastPlaces[0];
//
//        restaurant.setText(myRestaurants.getRestaurant());
//        description.setText(myRestaurants.getDescription()); }

        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView description = (TextView) findViewById(R.id.description);
        Random randomGenerator = new Random();
        ArrayList<Restaurants> newArray = new ArrayList<>();
        int arraySize = Restaurants.breakfastPlaces.length;

        // checks each object in breakfastPlaces array if they match option to add to new array

        for (int i = 0; i <= arraySize; i++) {
            if (MY_PRICE_PREFERENCE.equalsIgnoreCase("low")) {
                if (Restaurants.breakfastPlaces[i].getPrice() == 0) {
                    checkType(newArray, arraySize);
                }
            }
            if (MY_PRICE_PREFERENCE.equalsIgnoreCase("high")) {
                if (Restaurants.breakfastPlaces[i].getPrice() == 1) {
                    checkType(newArray, arraySize);
                }
            }
            if (MY_PRICE_PREFERENCE.equalsIgnoreCase("no preference")) {
                checkType(newArray, arraySize);
            }
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = Restaurants.breakfastPlaces[index];
        restaurant.setText(chosenRestaurant.getRestaurant());
        description.setText(chosenRestaurant.getDescription());

    }

    public void checkType(ArrayList newArray, int arraySize) {
        for (int i = 0; i <= arraySize; i++) {
            if (MY_SERVICE_TYPE.equalsIgnoreCase("chain")) {
                if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("chain")) {
                    newArray.add(Restaurants.breakfastPlaces[i]);
                }
            }
            if (MY_SERVICE_TYPE.equalsIgnoreCase("local")) {
                if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("local")) {
                    newArray.add(Restaurants.breakfastPlaces[i]);
                }
            }
            if (MY_SERVICE_TYPE.equalsIgnoreCase("no preference")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
    }

}
