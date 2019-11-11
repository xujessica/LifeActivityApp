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

    public void mainRandom(View v) {
        Intent intent = new Intent(this, RandomActivity.class);
        startActivity(intent);
    }
}
