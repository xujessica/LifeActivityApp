package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailedChoicesActivity extends AppCompatActivity {

    public static final String MY_DETAILED_CHOICE = "detailedChoice";
    Intent intent;
    String detailedChoice;
    ConstraintLayout layoutDC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_choices);

        intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_DETAILED_CHOICE);
        TextView titleDC = (TextView) findViewById(R.id.titleDC);
        Button firstButtonDC = (Button) findViewById(R.id.firstButtonDC);
        Button secondButtonDC = (Button) findViewById(R.id.secondButtonDC);
        layoutDC = (ConstraintLayout) findViewById(R.id.layoutDC);

        if (detailedChoice.equalsIgnoreCase("breakfast")) {
            titleDC.setText("BREAKFAST");
            titleDC.setTextSize(40);
        }
        else if (detailedChoice.equalsIgnoreCase("lunch")) {
            titleDC.setText("LUNCH");
            titleDC.setTextSize(60);
        }
        else if (detailedChoice.equalsIgnoreCase("dinner")) {
            titleDC.setText("DINNER");
            titleDC.setTextSize(50);
        }
        else if (detailedChoice.equalsIgnoreCase("movies")) {
            titleDC.setText("MOVIES");
            titleDC.setTextSize(50);
        }
        else if (detailedChoice.equalsIgnoreCase("concerts")) {
            titleDC.setText("CONCERTS");
            titleDC.setTextSize(50);
        }
        else// if (detailedChoice.equalsIgnoreCase("activities"))
        {
            titleDC.setText("ACTIVITIES");
            titleDC.setTextSize(40);
        }

        setBackground();

        firstButtonDC.setText("FILTERS");
        firstButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

        secondButtonDC.setText("RANDOM");
        secondButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    public void onFirstButtonClickDC(View v) {
        if (detailedChoice.equalsIgnoreCase("breakfast") ||
                detailedChoice.equalsIgnoreCase("lunch") ||
                detailedChoice.equalsIgnoreCase("dinner")) {

            Intent intent = new Intent(this, EatFiltersActivity.class);
            intent.putExtra(EatFiltersActivity.MY_EAT_CHOICE, detailedChoice);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, EntertainmentFiltersActivity.class);
            intent.putExtra(EntertainmentFiltersActivity.MY_ENTERTAINMENT_CHOICES, detailedChoice);
            startActivity(intent);
        }
    }


    public void setBackground() {
        if (detailedChoice.equalsIgnoreCase("breakfast") ||
                detailedChoice.equalsIgnoreCase("lunch") ||
                detailedChoice.equalsIgnoreCase("dinner")) {
            layoutDC.setBackgroundResource(R.drawable.blue_gradient);
        }

        if (detailedChoice.equalsIgnoreCase("movies") ||
                detailedChoice.equalsIgnoreCase("concerts") ||
                detailedChoice.equalsIgnoreCase("activities")) {
            layoutDC.setBackgroundResource(R.drawable.red_gradient);
        }
    }

}
