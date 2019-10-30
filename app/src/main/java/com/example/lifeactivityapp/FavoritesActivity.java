package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    public static ArrayList<Object> favorites;
    ListView favoritesChoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favorites = new ArrayList<>();
        favoritesChoices = (ListView) findViewById(R.id.favoritesChoices);
        ArrayAdapter<Object> arrayAdapter = new ArrayAdapter<Object>
                (this, android.R.layout.simple_list_item_1, favorites);
        favoritesChoices.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listFoods,
                                            View itemView, int position, long id) {

                        // Pass the Food name the user clicks on to BreakfastChoicesActivity
                        Intent intent = new Intent(FavoritesActivity.this,
                                FavoritesDisplayActivity.class);
                        intent.putExtra(FavoritesDisplayActivity.MY_OBJECT_ID, (int) id);
                        startActivity(intent);
                    }
                };
        favoritesChoices.setOnItemClickListener(itemClickListener);

    }

    public static void addToFavorites(Object object) {
        favorites.add(object);
    }


}
