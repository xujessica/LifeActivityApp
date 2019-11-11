package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    ListView favoritesChoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        favoritesChoices = (ListView) findViewById(R.id.favoritesChoices);



        try {

            if (MainActivity.favoriteStrings.isEmpty()) {
                throw new NullPointerException();
            }

            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, MainActivity.favoriteStrings);

            favoritesChoices.setAdapter(arrayAdapter);

            AdapterView.OnItemClickListener itemClickListener =
                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> favoritesChoices,
                                                View itemView, int position, long id) {

                            String name = MainActivity.favoriteStrings.get(position).toString();
                            int index = (int)id;

                            Intent intent = new Intent(FavoritesActivity.this,
                                    FavoritesDisplayActivity.class);
                            intent.putExtra(FavoritesDisplayActivity.MY_OBJECT_NAME, name);
                            intent.putExtra(FavoritesDisplayActivity.MY_INDEX, index);
                            startActivity(intent);
                        }
                    };
            favoritesChoices.setOnItemClickListener(itemClickListener);
        }

        catch (NullPointerException e) {
            Context context = getApplicationContext();
            CharSequence text = "No Favorites added yet";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL,
                    0, 0);
        }

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


}

