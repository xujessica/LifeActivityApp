package com.example.lifeactivityapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar =findViewById(R.id.actionBar);
        setSupportActionBar(toolbar);

        imageButton = (ImageButton)toolbar.findViewById(R.id.favoritesButton);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent (this, FavoritesActivity.class);
//                startActivity(intent);
//            }
//        });

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    public void onComposeAction(MenuItem menuItem) {
//        Intent intent = new Intent (this, FavoritesActivity.class);
//        startActivity(intent);
//    }
//
//
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        MenuInflater inflater = getMenuInflater();
////        inflater.inflate(R.menu.menu, menu);
////        return true;
////    }
//////
////////    @Override
////////    public boolean onCreateOptionsMenu(Menu menu) {
////////        MenuInflater inflater = getMenuInflater();
////////        return super.onCreateOptionsMenu(menu);
////////    }
//////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        return super.onOptionsItemSelected(item);
////    }

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
