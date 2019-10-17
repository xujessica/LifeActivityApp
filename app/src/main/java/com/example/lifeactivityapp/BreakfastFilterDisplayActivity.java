package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BreakfastFilterDisplayActivity extends AppCompatActivity {

    public static final String MY_SERVICE_TYPE = "serviceType";
    public static final String MY_PRICE_PREFERENCE = "pricePreference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_filter_display);

        Restaurants myRestaurants = Restaurants.breakfastPlaces[0];

        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        TextView description = (TextView) findViewById(R.id.description);

        restaurant.setText(myRestaurants.getRestaurant());
        description.setText(myRestaurants.getDescription());

    }
}
