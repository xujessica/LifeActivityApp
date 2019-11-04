package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FavoritesDisplayActivity extends AppCompatActivity {

    public static final String MY_OBJECT_ID = "objectId";
    public static final String MY_MEAL_CHOICE = "mealChoice";
    String mealChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites_display);


        Intent intent = getIntent();
        String name = intent.getStringExtra(MY_OBJECT_ID);
        mealChoice = intent.getStringExtra(MY_MEAL_CHOICE);
        TextView displayName = (TextView) findViewById(R.id.name);



        displayName.setText(name);

    }

//    public void checkObject(String mealChoice) {
//        if ()
//    }


}
