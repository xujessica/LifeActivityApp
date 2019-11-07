package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar)findViewById(R.id.actionBar);
        setSupportActionBar(toolbar);

        imageButton = (ImageButton)toolbar.findViewById(R.id.favoritesButton);

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
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


}
