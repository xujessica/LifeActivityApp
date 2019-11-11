package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class EatFiltersActivity extends AppCompatActivity {

    public static final String MY_EAT_CHOICE = "eatChoice";
    ArrayList<Restaurants> newArray;
    String mealChoice;
    Intent intent;
    RatingBar ratingBar;
    double ratingStars;
    Boolean checked = false, checked1 = false;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_filters);

        intent = getIntent();
        mealChoice = intent.getStringExtra(MY_EAT_CHOICE);
        TextView eatFilterTitle = findViewById(R.id.eatFilterTitle);
        RadioButton firstOptionEat = findViewById(R.id.firstOptionEat);
        RadioButton secondOptionEat = findViewById(R.id.secondOptionEat);
        radioGroup = (RadioGroup)findViewById(R.id.radioChoices);
        newArray = new ArrayList<>();

        // using a rating bar: https://abhiandroid.com/ui/ratingbar
        ratingBar = findViewById(R.id.ratingBar);

        if (mealChoice.equalsIgnoreCase("breakfast")) {
            eatFilterTitle.setText("BREAKFAST");
            eatFilterTitle.setTextSize(40);
            firstOptionEat.setText("Chain");
            secondOptionEat.setText("Local");
        }

        if (mealChoice.equalsIgnoreCase("lunch")) {
            eatFilterTitle.setText("LUNCH");
            eatFilterTitle.setTextSize(60);
            firstOptionEat.setText("fast food");
            secondOptionEat.setText("sit down");
        }

        if (mealChoice.equalsIgnoreCase("dinner")) {
            eatFilterTitle.setText("DINNER");
            eatFilterTitle.setTextSize(50);
            firstOptionEat.setText("fast food");
            secondOptionEat.setText("sit down");
        }

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    // Creating a Separate Method for Display Toast
    public void displayNoResultsToast(){
        Context context = getApplicationContext();
        CharSequence text = "No results for chosen rating";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                0, 0);
    }

    public void displayChooseToast(){
        Context context = getApplicationContext();
        CharSequence text = "Choose All Options!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);

    }


    public void onClickEatFilter(View v) {
        Intent displayIntent = new Intent(this, DisplayActivity.class);
        ratingStars = ratingBar.getRating();
        int rating = (int)ratingStars;
        int radioButtonID = radioGroup.getCheckedRadioButtonId();

        if (radioButtonID >= 0) {
            checked = true;
        }
        if (ratingStars > 1 ) {
            checked1 = true;
        }

        try {
            if (rating == 1) {
                throw new NullPointerException();
            }
            if (checked && checked1) {
                if (mealChoice.equalsIgnoreCase("breakfast")) {
                    convertRatingsArray(Restaurants.breakfastPlaces);
                    random(radioInfo(v, radioButtonID), displayIntent, Restaurants.breakfastPlaces);
                }
                if (mealChoice.equalsIgnoreCase("lunch")) {
                    convertRatingsArray(Restaurants.lunchPlaces);
                    random(radioInfo(v, radioButtonID), displayIntent, Restaurants.lunchPlaces);
                }
                if (mealChoice.equalsIgnoreCase("dinner")) {
                    convertRatingsArray(Restaurants.dinnerPlaces);
                    random(radioInfo(v, radioButtonID), displayIntent, Restaurants.dinnerPlaces);
                }

                startActivity(displayIntent);
            }
            else {
                displayChooseToast();
            }
        }
        catch (NullPointerException e) {
            displayNoResultsToast();
        }

    }


    public String radioInfo(View v, int radioButtonID) {
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        String serviceType = radioButton.getText().toString();
        return serviceType;
    }

    public void convertRatingsArray(Restaurants[] meal ) {
        for (int i = 0; i < meal.length; i++) {
            if (meal[i].getRating()%1 == 0.5) {
                double tempRating = meal[i].getRating() + 0.5;
                meal[i].setRating(tempRating);
            }
        }
    }


    public void random(String serviceType, Intent displayIntent, Restaurants[] mealArray) {
        try {
            for (int i = 0; i < mealArray.length; i++) {
                if (mealChoice.equalsIgnoreCase("breakfast")) {
                    if (serviceType.equalsIgnoreCase("chain")) {
                        if (mealArray[i].getType().equalsIgnoreCase("chain")) {
                            if (mealArray[i].getRating() == ratingStars) {
                                newArray.add(mealArray[i]);
                            }
                        }
                    }
                    if (serviceType.equalsIgnoreCase("local")) {
                        if (mealArray[i].getType().equalsIgnoreCase("local")) {
                            if (mealArray[i].getRating() == ratingStars) {
                                newArray.add(mealArray[i]);
                            }
                        }
                    }
                    if (serviceType.equalsIgnoreCase("no preference")) {
                        if (mealArray[i].getRating() == ratingStars) {
                            newArray.add(mealArray[i]);
                        }
                    }
                }
                if (mealChoice.equalsIgnoreCase("lunch") ||
                        mealChoice.equalsIgnoreCase("dinner")) {
                    if (serviceType.equalsIgnoreCase("fast food")) {
                        if (mealArray[i].getType().equalsIgnoreCase("fast food")) {
                            if (mealArray[i].getRating() == ratingStars) {
                                newArray.add(mealArray[i]);
                            }
                        }
                    }
                    if (serviceType.equalsIgnoreCase("sit down")) {
                        if (mealArray[i].getType().equalsIgnoreCase("sit down")) {
                            if (mealArray[i].getRating() == ratingStars) {
                                newArray.add(mealArray[i]);
                            }
                        }
                    }
                    if (serviceType.equalsIgnoreCase("no preference")) {
                        if (mealArray[i].getRating() == ratingStars) {
                            newArray.add(mealArray[i]);
                        }
                    }
                }

            }
            if (newArray.size() == 0) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            displayNoResultsToast();
        }

        int index = new Random().nextInt(newArray.size());
        Restaurants chosenRestaurant = newArray.get(index);
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        displayIntent.putExtra(DisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
        displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
        displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, mealChoice);

    }

}

