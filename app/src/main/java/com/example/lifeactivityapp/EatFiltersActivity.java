package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_filters);

        intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_EAT_CHOICE);
        RadioButton firstOptionEat = (RadioButton) findViewById(R.id.firstOptionEat);
        RadioButton secondOptionEat = (RadioButton) findViewById(R.id.secondOptionEat);
        randomGenerator = new Random();
        newArray = new ArrayList<>();
        breakfastArraySize = Restaurants.breakfastPlaces.length;
        lunchArraySize = Restaurants.lunchPlaces.length;
        dinnerArraySize = Restaurants.dinnerPlaces.length;

        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            firstOptionEat.setText("Chain");
            secondOptionEat.setText("Local");
        }

        if (detailedChoice.equalsIgnoreCase("lunch") ||
                detailedChoice.equalsIgnoreCase("dinner")) {
            firstOptionEat.setText("Chain");
            secondOptionEat.setText("Local");
        }

    }

    public void onClickEatFilter(View v) {
        Intent intent = new Intent(this, FilterDisplayActivity.class);

        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            randomBreakfast(ratingBarInfo(v), breakfastArraySize, radioInfo(v), randomGenerator);
        }
        if (detailedChoice.equalsIgnoreCase("lunch")) {
            randomLunch(ratingBarInfo(v), lunchArraySize, radioInfo(v), randomGenerator);
        }
        if (detailedChoice.equalsIgnoreCase("dinner")) {
            randomDinner(ratingBarInfo(v), dinnerArraySize, radioInfo(v), randomGenerator);
        }

        startActivity(intent);
    }

    public String radioInfo(View v) {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioChoices);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        String serviceType = radioButton.getText().toString();
        return serviceType;
    }

    public int ratingBarInfo(View v) {
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        double ratingStars = ratingBar.getNumStars();
        int newRating;
        if (ratingStars == 1) {
            Toast.makeText(EatFiltersActivity.this,"No results for 1 star", Toast.LENGTH_SHORT).show();
        }

        if (ratingStars/0.5 == 1) {
            newRating= (int)ratingStars + 1;
        }
        else {
            newRating = (int)ratingStars;
        }

        return newRating;
    }

    public void randomBreakfast(double ratingStars, int breakfastArraySize, String serviceType, Random randomGenerator) {
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
            Toast.makeText(EatFiltersActivity.this,"No results for chosen options", Toast.LENGTH_SHORT).show();
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = Restaurants.breakfastPlaces[index];
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        intent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        intent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        intent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);

    }



    public void randomLunch(double ratingStars, int breakfastArraySize, String serviceType, Random randomGenerator) {
        for (int i = 0; i < breakfastArraySize; i++) {
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
            Toast.makeText(EatFiltersActivity.this,"No results for chosen options", Toast.LENGTH_SHORT).show();
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = Restaurants.lunchPlaces[index];
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        intent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        intent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        intent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);

    }



    public void randomDinner(double ratingStars, int breakfastArraySize, String serviceType, Random randomGenerator) {
        for (int i = 0; i < breakfastArraySize; i++) {
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
            Toast.makeText(EatFiltersActivity.this,"No results for chosen options", Toast.LENGTH_SHORT).show();
        }

        int index = randomGenerator.nextInt(newArray.size());
        Restaurants chosenRestaurant = Restaurants.dinnerPlaces[index];
        String restaurantName = chosenRestaurant.getRestaurant();
        String description = chosenRestaurant.getDescription();
        double rating = chosenRestaurant.getRating();

        intent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurantName);
        intent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        intent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);

    }

}
