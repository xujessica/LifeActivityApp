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
        if (detailedChoice.equalsIgnoreCase("lunch")) {
            titleDC.setText("LUNCH");
            titleDC.setTextSize(60);
        }
        if (detailedChoice.equalsIgnoreCase("dinner")) {
            titleDC.setText("DINNER");
            titleDC.setTextSize(50);
        }
        if (detailedChoice.equalsIgnoreCase("movies")) {
            titleDC.setText("MOVIES");
            titleDC.setTextSize(50);
        }
        if (detailedChoice.equalsIgnoreCase("concerts")) {
            titleDC.setText("CONCERTS");
            titleDC.setTextSize(50);
        }
        if (detailedChoice.equalsIgnoreCase("activities")) {
            titleDC.setText("ACTIVITIES");
            titleDC.setTextSize(40);
        }

        setBackground();

        firstButtonDC.setText("FILTERS");
        firstButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

        secondButtonDC.setText("RANDOM");
        secondButtonDC.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

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
