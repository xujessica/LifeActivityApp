package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {

    public static final String MY_DISPLAY_CHOICE = "displayChoice";
    public static final String MY_RESTAURANT_NAME = "name";
    public static final String MY_DESCRIPTION = "description";
    public static final String MY_RATING_STARS = "ratingStars";
    public static final String MY_ENTERTAINMENT_NAME = "entertainment";
    public static final String MY_FAMOUS_SONG = "song";
    public static final String MY_ENTERTAINMENT_TYPE = "entertainmentType";
    public static final String MY_RANDOM_TYPE = "randomType";
    String displayChoice;
    ConstraintLayout filterDisplayLayout;
    String restaurantName;
    String entertainmentName;
    String entertainmentType;
    String info;
    String song;
    Boolean randomType;
    Button secondButton;
    Intent intent;

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        intent = getIntent();
        displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE); // movie, concerts, or activtieis
        restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME); // Names
        entertainmentName = intent.getStringExtra(MY_ENTERTAINMENT_NAME); // Avengers Movie
        entertainmentType = intent.getStringExtra(MY_ENTERTAINMENT_TYPE); // Avengers Movie
        info = intent.getStringExtra(MY_DESCRIPTION); // Description
        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS); // ratingStars
        song = intent.getStringExtra(MY_FAMOUS_SONG); // Description
        randomType = intent.getBooleanExtra(MY_RANDOM_TYPE, false);


        TextView filterDisplayTitle = (TextView) findViewById(R.id.filterDisplayTitle);
        TextView name = (TextView) findViewById(R.id.name);
        TextView rating = (TextView) findViewById(R.id.rating);
        TextView description = (TextView) findViewById(R.id.description);
        secondButton = (Button) findViewById(R.id.secondButton);
        filterDisplayLayout = (ConstraintLayout) findViewById(R.id.filterDisplayLayout);

        setBackground();
        setButtons();

        if (displayChoice.equalsIgnoreCase("breakfast")) {
            filterDisplayTitle.setText("BREAKFAST");
            filterDisplayTitle.setTextSize(40);

            name.setText(restaurantName);
            for (int i = 0; i < Restaurants.breakfastPlaces.length; i++) {
                if (Restaurants.breakfastPlaces[i].getRestaurant().equalsIgnoreCase(restaurantName)) {
                    rating.setText(String.valueOf(Restaurants.breakfastPlaces[i].getRating()) + " stars");
                    description.setText(Restaurants.breakfastPlaces[i].getDescription());
                }
            }
        }
        if (displayChoice.equalsIgnoreCase("lunch")) {
            filterDisplayTitle.setText("LUNCH");
            filterDisplayTitle.setTextSize(60);

            name.setText(restaurantName);
            for (int i = 0; i < Restaurants.lunchPlaces.length; i++) {
                if (Restaurants.lunchPlaces[i].getRestaurant().equalsIgnoreCase(restaurantName)) {
                    rating.setText(String.valueOf(Restaurants.lunchPlaces[i].getRating()) + " stars");
                    description.setText(Restaurants.lunchPlaces[i].getDescription());
                }
            }
        }
        if (displayChoice.equalsIgnoreCase("dinner")) {
            filterDisplayTitle.setText("DINNER");
            filterDisplayTitle.setTextSize(50);

            name.setText(restaurantName);
            for (int i = 0; i < Restaurants.dinnerPlaces.length; i++) {
                if (Restaurants.dinnerPlaces[i].getRestaurant().equalsIgnoreCase(restaurantName)) {
                    rating.setText(String.valueOf(Restaurants.dinnerPlaces[i].getRating()) + " stars");
                    description.setText(Restaurants.dinnerPlaces[i].getDescription());
                }
            }
        }
        if (displayChoice.equalsIgnoreCase("movies")) {
            filterDisplayTitle.setText("MOVIES");
            filterDisplayTitle.setTextSize(50);

            name.setText(entertainmentName);
            for (int i = 0; i < Movies.Action.length; i++) {
                if (Movies.Action[i].getName().equalsIgnoreCase(entertainmentName)) {
                    rating.setText(String.valueOf(Movies.Action[i].getRating()) + " stars");
                    description.setText(Movies.Action[i].getDescription());
                }
            }
        }
        for (int i = 0; i < Movies.Comedy.length; i++) {
            if (Movies.Comedy[i].getName().equalsIgnoreCase(entertainmentName)) {
                rating.setText(String.valueOf(Movies.Comedy[i].getRating()) + " stars");
                description.setText(Movies.Comedy[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Romance.length; i++) {
            if (Movies.Romance[i].getName().equalsIgnoreCase(entertainmentName)) {
                rating.setText(String.valueOf(Movies.Romance[i].getRating()) + " stars");
                description.setText(Movies.Romance[i].getDescription());
            }
        }

        for (int i = 0; i < Movies.Kids.length; i++) {
            if (Movies.Kids[i].getName().equalsIgnoreCase(entertainmentName)) {
                rating.setText(String.valueOf(Movies.Kids[i].getRating()) + " stars");
                description.setText(Movies.Kids[i].getDescription());
            }
        }
        if (displayChoice.equalsIgnoreCase("concerts")) {
            filterDisplayTitle.setText("CONCERTS");
            filterDisplayTitle.setTextSize(50);

            name.setText(entertainmentName);
            for (int i = 0; i < Concerts.Rap.length; i++) {
                if (Concerts.Rap[i].getName().equalsIgnoreCase(entertainmentName)) {
                    rating.setText(String.valueOf(Concerts.Rap[i].getFamousSong()));
                    description.setText(Concerts.Rap[i].getDescription());
                }
            }

            for (int i = 0; i < Concerts.Pop.length; i++) {
                if (Concerts.Pop[i].getName().equalsIgnoreCase(entertainmentName)) {
                    rating.setText(String.valueOf(Concerts.Pop[i].getFamousSong()));
                    description.setText(Concerts.Pop[i].getDescription());
                }
            }

            for (int i = 0; i < Concerts.Country.length; i++) {
                if (Concerts.Country[i].getName().equalsIgnoreCase(entertainmentName)) {
                    rating.setText(String.valueOf(Concerts.Country[i].getFamousSong()));
                    description.setText(Concerts.Country[i].getDescription());
                }
            }
        }
        if (displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayTitle.setText("ACTIVITIES");
            filterDisplayTitle.setTextSize(40);

            name.setText(entertainmentName);
            for (int i = 0; i < Activities.Spring.length; i++) {
                if (Activities.Spring[i].getName().equalsIgnoreCase(entertainmentName)) {
                    description.setText(Activities.Spring[i].getLocation());
                }
            }

            for (int i = 0; i < Activities.Summer.length; i++) {
                if (Activities.Summer[i].getName().equalsIgnoreCase(entertainmentName)) {
                    description.setText(Activities.Summer[i].getLocation());
                }
            }

            for (int i = 0; i < Activities.Fall.length; i++) {
                if (Activities.Fall[i].getName().equalsIgnoreCase(entertainmentName)) {
                    description.setText(Activities.Fall[i].getLocation());
                }
            }

            for (int i = 0; i < Activities.Winter.length; i++) {
                if (Activities.Winter[i].getName().equalsIgnoreCase(entertainmentName)) {
                    description.setText(Activities.Winter[i].getLocation());
                }
            }
        }


    }

    public void setBackground() {
        if (displayChoice.equalsIgnoreCase("breakfast") ||
                displayChoice.equalsIgnoreCase("lunch") ||
                displayChoice.equalsIgnoreCase("dinner")) {
            filterDisplayLayout.setBackgroundResource(R.drawable.blue_gradient);
        }

        if (displayChoice.equalsIgnoreCase("movies") ||
                displayChoice.equalsIgnoreCase("concerts") ||
                displayChoice.equalsIgnoreCase("activities")) {
            filterDisplayLayout.setBackgroundResource(R.drawable.red_gradient);
        }
    }


    public void secondButtonOnClick(View v) {
        if (randomType != true) {
            if (displayChoice.equalsIgnoreCase("breakfast") ||
                    displayChoice.equalsIgnoreCase("lunch") ||
                    displayChoice.equalsIgnoreCase("dinner")) {
                Intent pastIntent = new Intent(this, EatFiltersActivity.class);
                pastIntent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, displayChoice);
                startActivity(pastIntent);
            }
            if (displayChoice.equalsIgnoreCase("movies") ||
                    displayChoice.equalsIgnoreCase("concerts") ||
                    displayChoice.equalsIgnoreCase("activities")) {
                Intent pastIntent = new Intent(this, EntertainmentFiltersActivity.class);
                pastIntent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, displayChoice);
                startActivity(pastIntent);
            }
        }
        else {
            Intent displayIntent = new Intent (this, DetailedChoicesActivity.class);
            displayIntent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, displayChoice);
            startActivity(displayIntent);
        }
    }


    public void addToFavoritesOnClick(View v) {
        if (entertainmentName == null) {
            MainActivity.favoriteStrings.add(restaurantName);
        }
        if (restaurantName == null) {
            MainActivity.favoriteStrings.add(entertainmentName);
        }
        addObject();

        Context context = getApplicationContext();
        CharSequence text = "Added to Favorites";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL,
                0, 0);
    }

    public void addObject() {

        if (entertainmentName == null) {
            Restaurants[] array;
            if (displayChoice.equalsIgnoreCase("breakfast")) {
                array = Restaurants.breakfastPlaces;
            } else if (displayChoice.equalsIgnoreCase("lunch")) {
                array = Restaurants.lunchPlaces;
            } else {
                array = Restaurants.dinnerPlaces;
            }


            for (int i = 0; i < array.length; i++) {
                if (restaurantName.equalsIgnoreCase(array[i].getRestaurant())) {
                    MainActivity.favoritesArray.add(array[i]);
                }
            }
        }

        if (restaurantName == null) {

            if (displayChoice.equalsIgnoreCase("movies")) {
                Movies[] array;

                if (entertainmentType.equalsIgnoreCase("Action")) {
                    array = Movies.Action;
                }
                else if (entertainmentType.equalsIgnoreCase("Comedy")) {
                    array = Movies.Comedy;
                }
                else if (entertainmentType.equalsIgnoreCase("Romance")) {
                    array = Movies.Romance;
                }
                else {
                    array = Movies.Kids;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

            if (displayChoice.equalsIgnoreCase("concerts")) {
                Concerts[] array;

                if (entertainmentType.equalsIgnoreCase("rap")) {
                    array = Concerts.Rap;
                }
                else if (entertainmentType.equalsIgnoreCase("pop")) {
                    array = Concerts.Pop;
                }
                else {
                    array = Concerts.Country;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

            if (displayChoice.equalsIgnoreCase("activities")) {
                Activities[] array;

                if (entertainmentType.equalsIgnoreCase("Spring")) {
                    array = Activities.Spring;
                }
                else if (entertainmentType.equalsIgnoreCase("Summer")) {
                    array = Activities.Summer;
                }
                else if (entertainmentType.equalsIgnoreCase("Fall")) {
                    array = Activities.Fall;
                }
                else {
                    array = Activities.Winter;
                }

                for (int i = 0; i < array.length; i++) {
                    if (entertainmentName.equalsIgnoreCase(array[i].getName())) {
                        MainActivity.favoritesArray.add(array[i]);
                    }
                }
            }

        }
    }

    public void setButtons() {
        if (randomType == true) {
            secondButton.setText("Return");
        }
        else {
            secondButton.setText("New Filter");
        }
    }


    }
