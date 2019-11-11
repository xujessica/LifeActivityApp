package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> favoriteStrings = new ArrayList<>();
    public static ArrayList<Object> favoritesArray = new ArrayList<>();
    ImageButton imageButton;
    Random random = new Random();
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    String type ="";
    String restaurant = "";
    String mealChoice = "";
    String detailedChoice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // making custom action bar: https://www.youtube.com/watch?v=j-3L3CgYXkU
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.actionBar);
        setSupportActionBar(toolbar);

        imageButton = (ImageButton)toolbar.findViewById(R.id.favoritesButton);

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void onEatClick(View v) {
        Intent intent = new Intent(this, ChoicesActivity.class);
        intent.putExtra(ChoicesActivity.MY_CHOICE, "eat");
        startActivity(intent);
    }

    public void onEntertainmentClick(View v) {
        Intent intent = new Intent(this, ChoicesActivity.class);
        intent.putExtra(ChoicesActivity.MY_CHOICE, "entertainment");
        startActivity(intent);
    }

    public void mainRandom(View v)
    {
        Restaurants[] breakfast = Restaurants.breakfastPlaces;
        Restaurants[] lunch = Restaurants.lunchPlaces;
        Restaurants[] dinner = Restaurants.dinnerPlaces;
        Movies[] action = Movies.Action;
        Movies[] comedy = Movies.Comedy;
        Movies[] romance = Movies.Romance;
        Movies[] kids = Movies.Kids;
        Concerts[] rap = Concerts.Rap;
        Concerts[] pop = Concerts.Pop;
        Concerts[] country = Concerts.Country;
        Activities[] spring = Activities.Spring;
        Activities[] summer = Activities.Summer;
        Activities[] fall = Activities.Fall;
        Activities[] winter = Activities.Winter;

        Intent displayIntent = new Intent(this, FilterDisplayActivity.class);
        int eatOrEntertain = random.nextInt(3);

        if (eatOrEntertain == 0)
        {
            int eatRand = random.nextInt(3);
            //breakfast
            if(eatRand == 0)
            {
                int breakfastRand = random.nextInt(breakfast.length);
                mealChoice = "breakfast";
                restaurant = breakfast[breakfastRand].getRestaurant();
                description = breakfast[breakfastRand].getDescription();
                type = breakfast[breakfastRand].getType();
                rating = breakfast[breakfastRand].getRating();
            }
            //lunch
            else if(eatRand == 1)
            {
                int lunchRand = random.nextInt(lunch.length);
                mealChoice = "lunch";
                restaurant = lunch[lunchRand].getRestaurant();
                description = lunch[lunchRand].getDescription();
                type = lunch[lunchRand].getType();
                rating = lunch[lunchRand].getRating();
            }
            //dinner
            else if(eatRand == 2)
            {
                int dinnerRand = random.nextInt(dinner.length);
                mealChoice = "dinner";
                restaurant = dinner[dinnerRand].getRestaurant();
                description = dinner[dinnerRand].getDescription();
                type = dinner[dinnerRand].getType();
                rating = dinner[dinnerRand].getRating();
            }

            displayIntent.putExtra(FilterDisplayActivity.MY_RESTAURANT_NAME, restaurant);
            displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
            displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
            displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, mealChoice);

            startActivity(displayIntent);
        }
        else if (eatOrEntertain == 1)
        {
            int entertainRand = random.nextInt(3);
            //Movies
            if(entertainRand == 0)
            {
                int movieRand = random.nextInt(4);
                detailedChoice = "movies";

                if(movieRand == 0)
                {
                    int randomNum = random.nextInt(action.length);
                    name = action[randomNum].toString();
                    description = action[randomNum].getDescription();
                    rating = action[randomNum].getRating();
                }
                else if(movieRand == 1)
                {
                    int randomNum = random.nextInt(comedy.length);
                    name = comedy[randomNum].toString();
                    description = comedy[randomNum].getDescription();
                    rating = comedy[randomNum].getRating();
                }
                else if(movieRand == 2)
                {
                    int randomNum = random.nextInt(romance.length);
                    name = romance[randomNum].toString();
                    description = romance[randomNum].getDescription();
                    rating = romance[randomNum].getRating();
                }
                else if(movieRand == 3)
                {
                    int randomNum = random.nextInt(kids.length);
                    name = kids[randomNum].toString();
                    description = kids[randomNum].getDescription();
                    rating = kids[randomNum].getRating();
                }
            }
            //Concerts
            else if(entertainRand == 1)
            {
                int concertRand = random.nextInt(3);
                detailedChoice = "concerts";

                if(concertRand == 0)
                {
                    int randomNum = random.nextInt(rap.length);
                    name = rap[randomNum].toString();
                    description = rap[randomNum].getDescription();
                    famousSong = rap[randomNum].getFamousSong();
                }
                else if(concertRand == 1)
                {
                    int randomNum = random.nextInt(pop.length);
                    name = pop[randomNum].toString();
                    description = pop[randomNum].getDescription();
                    famousSong = pop[randomNum].getFamousSong();
                }
                else if(concertRand == 2)
                {
                    int randomNum = random.nextInt(country.length);
                    name = country[randomNum].toString();
                    description = country[randomNum].getDescription();
                    famousSong = country[randomNum].getFamousSong();
                }


            }
            //Activities
            else if(entertainRand == 2)
            {
                int activityRand = random.nextInt(3);
                detailedChoice = "activities";

                if(activityRand == 0)
                {
                    int randomNum = random.nextInt(spring.length);
                    name = spring[randomNum].toString();
                    description = spring[randomNum].getLocation();
                }
                else if(activityRand == 1)
                {
                    int randomNum = random.nextInt(summer.length);
                    name = summer[randomNum].toString();
                    description = summer[randomNum].getLocation();
                }
                else if(activityRand == 2)
                {
                    int randomNum = random.nextInt(fall.length);
                    name = fall[randomNum].toString();
                    description = fall[randomNum].getLocation();
                }
                else if(activityRand == 3)
                {
                    int randomNum = random.nextInt(winter.length);
                    name = winter[randomNum].toString();
                    description = winter[randomNum].getLocation();
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
