//package com.example.lifeactivityapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import java.util.Random;
//
//public class RandomActivity extends AppCompatActivity
//{
//
//    public static final String MY_DISPLAY_CHOICE = "displayChoice";
//    public static final String MY_RESTAURANT_NAME = "name";
//    public static final String MY_DESCRIPTION = "description";
//    public static final String MY_RATING_STARS = "ratingStars";
//    public static final String MY_ENTERTAINMENT_NAME = "entertainment";
//    public static final String MY_FAMOUS_SONG = "song";
//    public static final String MY_ENTERTAINMENT_TYPE = "entertainmentType";
//    String displayChoice;
//    ConstraintLayout filterDisplayLayout;
//    String restaurantName;
//    String entertainmentName;
//    String entertainmentType;
//    String info;
//    String song;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_random);
//
//        Intent intent = getIntent();
//        displayChoice = intent.getStringExtra(MY_DISPLAY_CHOICE); // movie, concerts, or activtieis
//        restaurantName = intent.getStringExtra(MY_RESTAURANT_NAME); // Names
//        entertainmentName = intent.getStringExtra(MY_ENTERTAINMENT_NAME); // Avengers Movie
//        entertainmentType = intent.getStringExtra(MY_ENTERTAINMENT_TYPE); // Avengers Movie
//        info = intent.getStringExtra(MY_DESCRIPTION); // Description
//        double ratingStars = intent.getExtras().getDouble(MY_RATING_STARS); // ratingStars
//        song = intent.getStringExtra(MY_FAMOUS_SONG); // Description
//
//
//        TextView filterDisplayTitle = (TextView) findViewById(R.id.filterDisplayTitle);
//        TextView name = (TextView) findViewById(R.id.name);
//        TextView rating = (TextView) findViewById(R.id.rating);
//        TextView description = (TextView) findViewById(R.id.description);
//
//    }
//
//    public void onFavoritesClick (View v) {
//        Intent intent = new Intent (this, FavoritesActivity.class);
//        startActivity(intent);
//    }
//
//    public void onHomeClick (View v) {
//        Intent intent = new Intent (this, MainActivity.class);
//        startActivity(intent);
//    }
//
//
//
//
//}
//
