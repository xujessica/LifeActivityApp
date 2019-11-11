package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static com.example.lifeactivityapp.Activities.getFall;
import static com.example.lifeactivityapp.Activities.getSpring;
import static com.example.lifeactivityapp.Activities.getSummer;
import static com.example.lifeactivityapp.Activities.getWinter;
import static com.example.lifeactivityapp.Concerts.getCountry;
import static com.example.lifeactivityapp.Concerts.getPop;
import static com.example.lifeactivityapp.Concerts.getRap;
import static com.example.lifeactivityapp.Movies.getAction;
import static com.example.lifeactivityapp.Movies.getComedy;
import static com.example.lifeactivityapp.Movies.getKids;
import static com.example.lifeactivityapp.Movies.getRomance;
import static com.example.lifeactivityapp.Restaurants.getBreakfastPlaces;
import static com.example.lifeactivityapp.Restaurants.getDinnerPlaces;
import static com.example.lifeactivityapp.Restaurants.getLunchPlaces;

public class DetailedChoicesActivity extends AppCompatActivity {

    public static final String MY_DETAILED_CHOICE = "detailedChoice";
    Intent intent;
    String detailedChoice;
    ConstraintLayout layoutDC;

    Random random;
    Boolean randomType = false;
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    String type ="";
    String restaurant = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_choices);

        intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_DETAILED_CHOICE);
        TextView titleDC = (TextView) findViewById(R.id.titleDC);
        Button firstButtonDC = (Button) findViewById(R.id.firstButtonDC);
        Button secondButtonDC = (Button) findViewById(R.id.secondButtonDC);
        layoutDC = (ConstraintLayout) findViewById(R.id.layoutDC);
        random = new Random();

        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            titleDC.setText("BREAKFAST");
            titleDC.setTextSize(40);
        }
        else if (detailedChoice.equalsIgnoreCase("lunch")) {
            titleDC.setText("LUNCH");
            titleDC.setTextSize(60);
        }
        else if (detailedChoice.equalsIgnoreCase("dinner")) {
            titleDC.setText("DINNER");
            titleDC.setTextSize(50);
        }
        else if (detailedChoice.equalsIgnoreCase("movies")) {
            titleDC.setText("MOVIES");
            titleDC.setTextSize(50);
        }
        else if (detailedChoice.equalsIgnoreCase("concerts")) {
            titleDC.setText("CONCERTS");
            titleDC.setTextSize(50);
        }
        else// if (detailedChoice.equalsIgnoreCase("activities"))
        {
            titleDC.setText("ACTIVITIES");
            titleDC.setTextSize(40);
        }

        setBackground();

        firstButtonDC.setText("FILTERS");
        firstButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

        secondButtonDC.setText("RANDOM");
        secondButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    public void onFirstButtonClickDC(View v) {
        if (detailedChoice.equalsIgnoreCase("breakfast") ||
                detailedChoice.equalsIgnoreCase("lunch") ||
                detailedChoice.equalsIgnoreCase("dinner")) {

            Intent intent = new Intent(this, EatFiltersActivity.class);
            intent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, detailedChoice);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, EntertainmentFiltersActivity.class);
            intent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, detailedChoice);
            startActivity(intent);
        }
    }


    public void setBackground() {
        if (detailedChoice.equalsIgnoreCase("breakfast") ||
                detailedChoice.equalsIgnoreCase("lunch") ||
                detailedChoice.equalsIgnoreCase("dinner")) {
            layoutDC.setBackgroundResource(R.drawable.blue_gradient);
        }

        if (detailedChoice.equalsIgnoreCase("movies") ||
                detailedChoice.equalsIgnoreCase("concerts") ||
                detailedChoice.equalsIgnoreCase("activities")) {
            layoutDC.setBackgroundResource(R.drawable.red_gradient);
        }
    }

    public void randomOnClick(View v)
    {
        Intent displayIntent = new Intent(this, DisplayActivity.class);
        randomType = true;

        if(detailedChoice.equalsIgnoreCase("breakfast"))
        {
            int breakfastRand = random.nextInt(getBreakfastPlaces().length);
            restaurant = getBreakfastPlaces()[breakfastRand].getRestaurant();
            description = getBreakfastPlaces()[breakfastRand].getDescription();
            type = getBreakfastPlaces()[breakfastRand].getType();
            rating = getBreakfastPlaces()[breakfastRand].getRating();

            displayIntent.putExtra(DisplayActivity.MY_RESTAURANT_NAME, restaurant);
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);
            displayIntent.putExtra(DisplayActivity.MY_RANDOM_TYPE, randomType);

            startActivity(displayIntent);
        }
        else if(detailedChoice.equalsIgnoreCase("lunch"))
        {
            int lunchRand = random.nextInt(getLunchPlaces().length);
            restaurant = getLunchPlaces()[lunchRand].getRestaurant();
            description = getLunchPlaces()[lunchRand].getDescription();
            type = getLunchPlaces()[lunchRand].getType();
            rating = getLunchPlaces()[lunchRand].getRating();

            displayIntent.putExtra(DisplayActivity.MY_RESTAURANT_NAME, restaurant);
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);

            startActivity(displayIntent);
        }
        else if(detailedChoice.equalsIgnoreCase("dinner"))
        {
            int dinnerRand = random.nextInt(getDinnerPlaces().length);
            restaurant = getDinnerPlaces()[dinnerRand].getRestaurant();
            description = getDinnerPlaces()[dinnerRand].getDescription();
            type = getDinnerPlaces()[dinnerRand].getType();
            rating = getDinnerPlaces()[dinnerRand].getRating();

            displayIntent.putExtra(DisplayActivity.MY_RESTAURANT_NAME, restaurant);
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice);

            startActivity(displayIntent);
        }
        else if(detailedChoice.equalsIgnoreCase("movies"))
        {
            int movieRand = random.nextInt(4);

            if(movieRand == 0)
            {
                int randomNum = random.nextInt(getAction().length);
                name = getAction()[randomNum].toString();
                description = getAction()[randomNum].getDescription();
                rating = getAction()[randomNum].getRating();
            }
            else if(movieRand == 1)
            {
                int randomNum = random.nextInt(getComedy().length);
                name = getComedy()[randomNum].toString();
                description = getComedy()[randomNum].getDescription();
                rating = getComedy()[randomNum].getRating();
            }
            else if(movieRand == 2)
            {
                int randomNum = random.nextInt(getRomance().length);
                name = getRomance()[randomNum].toString();
                description = getRomance()[randomNum].getDescription();
                rating = getRomance()[randomNum].getRating();
            }
            else if(movieRand == 3)
            {
                int randomNum = random.nextInt(getKids().length);
                name = getKids()[randomNum].toString();
                description = getKids()[randomNum].getDescription();
                rating = getKids()[randomNum].getRating();
            }

            displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_FAMOUS_SONG, rating);

            startActivity(displayIntent);
        }
        else if(detailedChoice.equalsIgnoreCase("concerts"))
        {
            int concertRand = random.nextInt(3);

            if(concertRand == 0)
            {
                int randomNum = random.nextInt(getRap().length);
                name = getRap()[randomNum].toString();
                description = getRap()[randomNum].getDescription();
                famousSong = getRap()[randomNum].getFamousSong();
            }
            else if(concertRand == 1)
            {
                int randomNum = random.nextInt(getPop().length);
                name = getPop()[randomNum].toString();
                description = getPop()[randomNum].getDescription();
                famousSong = getRap()[randomNum].getFamousSong();
            }
            else if(concertRand == 2)
            {
                int randomNum = random.nextInt(getCountry().length);
                name = getCountry()[randomNum].toString();
                description = getCountry()[randomNum].getDescription();
                famousSong = getCountry()[randomNum].getFamousSong();
            }

            displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_FAMOUS_SONG, rating);

            startActivity(displayIntent);
        }
        else if(detailedChoice.equalsIgnoreCase("activities"))
        {
            int activityRand = random.nextInt(4);
            detailedChoice = "activities";

            if(activityRand == 0)
            {
                int randomNum = random.nextInt(getSpring().length);
                name = getSpring()[randomNum].toString();
                description = getSpring()[randomNum].getLocation();
            }
            else if(activityRand == 1)
            {
                int randomNum = random.nextInt(getSummer().length);
                name = getSummer()[randomNum].toString();
                description = getSummer()[randomNum].getLocation();
            }
            else if(activityRand == 2)
            {
                int randomNum = random.nextInt(getFall().length);
                name = getFall()[randomNum].toString();
                description = getFall()[randomNum].getLocation();
            }
            else if(activityRand == 3)
            {
                int randomNum = random.nextInt(getWinter().length);
                name = getWinter()[randomNum].toString();
                description = getWinter()[randomNum].getLocation();
            }

            displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
            displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
            displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(DisplayActivity.MY_FAMOUS_SONG, rating);

            startActivity(displayIntent);
        }


    }
}
