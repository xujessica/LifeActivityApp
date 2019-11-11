package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

public class RandomActivity extends AppCompatActivity
{
    Random random;
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    String type ="";
    String restaurant = "";
    String mealChoice = "";
    String detailedChoice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void mainRandom(View v)
    {
        Intent displayIntent = new Intent(this, FilterDisplayActivity.class);
        int eatOrEntertain = random.nextInt(1);
        if (eatOrEntertain == 0)
        {
            int eatRand = random.nextInt(2);
            //breakfast
            if(eatRand == 0)
            {
                int breakfastRand = random.nextInt(getBreakfastPlaces().length);
                mealChoice = "breakfast";
                restaurant = getBreakfastPlaces()[breakfastRand].getRestaurant();
                description = getBreakfastPlaces()[breakfastRand].getDescription();
                type = getBreakfastPlaces()[breakfastRand].getType();
                rating = getBreakfastPlaces()[breakfastRand].getRating();
            }
            //lunch
            else if(eatRand == 1)
            {
                int lunchRand = random.nextInt(getLunchPlaces().length);
                mealChoice = "lunch";
                restaurant = getLunchPlaces()[lunchRand].getRestaurant();
                description = getLunchPlaces()[lunchRand].getDescription();
                type = getLunchPlaces()[lunchRand].getType();
                rating = getLunchPlaces()[lunchRand].getRating();
            }
            //dinner
            else if(eatRand == 2)
            {
                int dinnerRand = random.nextInt(getDinnerPlaces().length);
                mealChoice = "dinner";
                restaurant = getDinnerPlaces()[dinnerRand].getRestaurant();
                description = getDinnerPlaces()[dinnerRand].getDescription();
                type = getDinnerPlaces()[dinnerRand].getType();
                rating = getDinnerPlaces()[dinnerRand].getRating();
            }

            displayIntent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurant);
            displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, mealChoice);

            startActivity(displayIntent);
        }
        else if (eatOrEntertain == 1)
        {
            int entertainRand = random.nextInt(2);
            //Movies
            if(entertainRand == 0)
            {
                int movieRand = random.nextInt(3);
                detailedChoice = "movies";

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
            }
            //Concerts
            else if(entertainRand == 1)
            {
                int concertRand = random.nextInt(2);
                detailedChoice = "concerts";

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


            }
            //Activities
            else if(entertainRand == 2)
            {
                int activityRand = random.nextInt(3);
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
            }
            displayIntent.putExtra(FilterDisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
            displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
            displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(FilterDisplayActivity.MY_FAMOUS_SONG, rating);

            startActivity(displayIntent);
        }
    }
}
