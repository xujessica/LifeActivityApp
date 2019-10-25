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
    String detailedChoice;
    Intent intent;
    int breakfastArraySize;
    int lunchArraySize;
    int dinnerArraySize;
    Random randomGenerator;
    RatingBar ratingBar;
    double ratingStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_filters);

        intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_EAT_CHOICE);
        TextView eatFilterTitle = (TextView) findViewById(R.id.eatFilterTitle);
        RadioButton firstOptionEat = (RadioButton) findViewById(R.id.firstOptionEat);
        RadioButton secondOptionEat = (RadioButton) findViewById(R.id.secondOptionEat);
        randomGenerator = new Random();
        newArray = new ArrayList<>();
        breakfastArraySize = Restaurants.breakfastPlaces.length;
        lunchArraySize = Restaurants.lunchPlaces.length;
        dinnerArraySize = Restaurants.dinnerPlaces.length;
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            eatFilterTitle.setText("BREAKFAST");
            eatFilterTitle.setTextSize(40);
            firstOptionEat.setText("Chain");
            secondOptionEat.setText("Local");
        }

        if (detailedChoice.equalsIgnoreCase("lunch")) {
            eatFilterTitle.setText("LUNCH");
            eatFilterTitle.setTextSize(60);
            firstOptionEat.setText("fast food");
            secondOptionEat.setText("sit down");
        }

        if (detailedChoice.equalsIgnoreCase("dinner")) {
            eatFilterTitle.setText("DINNER");
            eatFilterTitle.setTextSize(50);
            firstOptionEat.setText("fast food");
            secondOptionEat.setText("sit down");
        }

    }

    public void onClickEatFilter(View v) {
        Intent displayIntent = new Intent(this, FilterDisplayActivity.class);
        ratingStars = ratingBar.getRating();
        try {
            int rating = (int)ratingStars;
            if (rating == 1 || rating == 5) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No results for chosen rating";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }


        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            convertRatingsArray(Restaurants.breakfastPlaces);
            randomBreakfast(breakfastArraySize, radioInfo(v), randomGenerator, displayIntent);
        }
        if (detailedChoice.equalsIgnoreCase("lunch")) {
            convertRatingsArray(Restaurants.lunchPlaces);
            randomLunch(lunchArraySize, radioInfo(v), randomGenerator, displayIntent);
        }
        if (detailedChoice.equalsIgnoreCase("dinner")) {
            convertRatingsArray(Restaurants.dinnerPlaces);
            randomDinner(dinnerArraySize, radioInfo(v), randomGenerator, displayIntent);
        }

        startActivity(displayIntent);
    }


    public String radioInfo(View v) {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioChoices);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
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


    public void randomBreakfast(int breakfastArraySize, String serviceType, Random randomGenerator, Intent displayIntent) {
        try {
            for (int i = 0; i < breakfastArraySize; i++) {
                if (serviceType.equalsIgnoreCase("chain")) {
                    if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("chain")) {
                        if (Restaurants.breakfastPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.breakfastPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("local")) {
                    if (Restaurants.breakfastPlaces[i].getType().equalsIgnoreCase("local")) {
                        if (Restaurants.breakfastPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.breakfastPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("no preference")) {
                    if (Restaurants.breakfastPlaces[i].getRating() == ratingStars) {
                        newArray.add(Restaurants.breakfastPlaces[i]);
                    }
                }

            }
            if (newArray.size() == 0) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No results for chosen options";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = newArray.get(index);
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        displayIntent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
        displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);

    }



    public void randomLunch(int lunchArraySize, String serviceType, Random randomGenerator, Intent displayIntent) {
        try {
            for (int i = 0; i < lunchArraySize; i++) {
                if (serviceType.equalsIgnoreCase("fast food")) {
                    if (Restaurants.lunchPlaces[i].getType().equalsIgnoreCase("fast food")) {
                        if (Restaurants.lunchPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.lunchPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("sit down")) {
                    if (Restaurants.lunchPlaces[i].getType().equalsIgnoreCase("sit down")) {
                        if (Restaurants.lunchPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.lunchPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("no preference")) {
                    if (Restaurants.lunchPlaces[i].getRating() == ratingStars) {
                        newArray.add(Restaurants.lunchPlaces[i]);
                    }
                }

            }
            if (newArray.size() == 0) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No results for chosen options";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = newArray.get(index);
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        displayIntent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
        displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);

    }



    public void randomDinner(int dinnerArraySize, String serviceType, Random randomGenerator, Intent displayIntent) {
        try {
            for (int i = 0; i < dinnerArraySize; i++) {
                if (serviceType.equalsIgnoreCase("fast food")) {
                    if (Restaurants.dinnerPlaces[i].getType().equalsIgnoreCase("fast food")) {
                        if (Restaurants.dinnerPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.dinnerPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("sit down")) {
                    if (Restaurants.dinnerPlaces[i].getType().equalsIgnoreCase("sit down")) {
                        if (Restaurants.dinnerPlaces[i].getRating() == ratingStars) {
                            newArray.add(Restaurants.dinnerPlaces[i]);
                        }
                    }
                }
                if (serviceType.equalsIgnoreCase("no preference")) {
                    if (Restaurants.dinnerPlaces[i].getRating() == ratingStars) {
                        newArray.add(Restaurants.dinnerPlaces[i]);
                    }
                }

            }
            if (newArray.size() == 0) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No results for chosen options";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }


        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = newArray.get(index);
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        displayIntent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
        displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);

    }

    // work on getting original rating of object

}
