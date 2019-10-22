package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailedChoicesActivity extends AppCompatActivity {

    public static final String MY_DETAILED_CHOICE = "detailedChoice";
    Intent intent = getIntent();
    String detailedChoice = intent.getStringExtra(MY_DETAILED_CHOICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_choices);

        Button firstButtonDC = (Button) findViewById(R.id.firstButtonDC);
        Button secondButtonDC = (Button) findViewById(R.id.secondButtonDC);

    }

    public void onFirstButtonClickDC(View v) {
        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            Intent intent = new Intent(this, EatFiltersActivity.class);
            intent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, "breakfast");
            startActivity(intent);
        }

        if (detailedChoice.equalsIgnoreCase("lunch")) {
            Intent intent = new Intent(this, EatFiltersActivity.class);
            intent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, "lunch");
            startActivity(intent);
        }

        if (detailedChoice.equalsIgnoreCase("dinner")) {
            Intent intent = new Intent(this, EatFiltersActivity.class);
            intent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, "dinner");
            startActivity(intent);
        }

        if (detailedChoice.equalsIgnoreCase("movies")) {
            Intent intent = new Intent(this, EntertainmentFiltersActivity.class);
            intent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, "movies");
            startActivity(intent);
        }

        if (detailedChoice.equalsIgnoreCase("concerts")) {
            Intent intent = new Intent(this, EntertainmentFiltersActivity.class);
            intent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, "concerts");
            startActivity(intent);
        }

        if (detailedChoice.equalsIgnoreCase("activities")) {
            Intent intent = new Intent(this, EntertainmentFiltersActivity.class);
            intent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, "activities");
            startActivity(intent);
        }
    }

}
