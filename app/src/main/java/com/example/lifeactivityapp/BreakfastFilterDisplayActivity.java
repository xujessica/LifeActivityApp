package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        Intent intent = getIntent();
        String serviceType = intent.getStringExtra(MY_SERVICE_TYPE);
        String pricePreference = intent.getStringExtra(MY_PRICE_PREFERENCE);
        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView description = (TextView) findViewById(R.id.description);
        Random randomGenerator = new Random();
        ArrayList<Restaurants> newArray = new ArrayList<>();
        int arraySize = Restaurants.breakfastPlaces.length;

        boolean low = pricePreference.equalsIgnoreCase("low price");
        boolean high = pricePreference.equalsIgnoreCase("high price");
        boolean noPrefPrice = pricePreference.equalsIgnoreCase("no preference");

        // checks each object in breakfastPlaces array if they match option to add to new array
        for (int i = 0; i < arraySize; i++) {
            if (low) {
                lowPriceCheck(newArray, i, serviceType);
            }
            if (high) {
                highPriceCheck(newArray, i, serviceType);
            }
            if (noPrefPrice) {
                noPrefPriceCheck(newArray, i, serviceType);
            }

            int index = randomGenerator.nextInt(newArray.size());
            Restaurants chosenRestaurant = Restaurants.breakfastPlaces[index];
            restaurant.setText(chosenRestaurant.getRestaurant());
            description.setText(chosenRestaurant.getDescription());

        }

    }


    public void lowPriceCheck(ArrayList newArray, int i, String serviceType) {
        if (serviceType.equalsIgnoreCase("chain")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 0 &&
                    Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("chain")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
        if (serviceType.equalsIgnoreCase("local")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 0 &&
                    Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("local")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
        if (serviceType.equalsIgnoreCase("no preference")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 0) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
    }

    public void highPriceCheck(ArrayList newArray, int i, String serviceType) {
        if (serviceType.equalsIgnoreCase("chain")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 1 &&
                    Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("chain")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
        if (serviceType.equalsIgnoreCase("local")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 1 &&
                    Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("local")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
        if (serviceType.equalsIgnoreCase("no preference")) {
            if (Restaurants.breakfastPlaces[i].getPrice() == 1) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
    }

    public void noPrefPriceCheck(ArrayList newArray, int i, String serviceType){
            if (serviceType.equalsIgnoreCase("chain")) {
                if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("chain")) {
                    newArray.add(Restaurants.breakfastPlaces[i]);
                }
            }
            if (serviceType.equalsIgnoreCase("local")) {
                if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("local")) {
                    newArray.add(Restaurants.breakfastPlaces[i]);
                }
            }
            if (serviceType.equalsIgnoreCase("no preference")) {
                newArray.add(Restaurants.breakfastPlaces[i]);
            }
        }
    }

