package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FavoritesDisplayActivity extends AppCompatActivity {

    public static final String MY_OBJECT_ID = "objectId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites_display);
    }
}
