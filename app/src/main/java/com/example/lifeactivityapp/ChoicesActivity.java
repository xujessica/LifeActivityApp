package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoicesActivity extends AppCompatActivity {

    Intent intent;
    ConstraintLayout constraintLayout;
    public static final String MY_CHOICE = "choice";
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        intent = getIntent();
        choice = intent.getStringExtra(MY_CHOICE);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button thirdButton = (Button) findViewById(R.id.thirdButton);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        if(choice.equalsIgnoreCase("eat")){
            layout.setBackgroundResource(R.drawable.blue_gradient);
            firstButton.setText("BREAKFAST");
            firstButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);
            firstButton.setVisibility(View.VISIBLE);

            secondButton.setText("LUNCH");
            secondButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);


            thirdButton.setText("DINNER");
            thirdButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);
        }

        if (choice.equalsIgnoreCase("entertainment")) {
            constraintLayout= new ConstraintLayout(this);
            constraintLayout.setBackgroundResource(R.drawable.red_gradient);
            setContentView(constraintLayout);
            firstButton.setText("MOVIES");
            firstButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

            secondButton.setText("CONCERTS");
            secondButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);


            thirdButton.setText("ACTIVITIES");
            thirdButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);
        }
    }

    public void onFirstButtonClick(View v) {
        if (choice.equalsIgnoreCase("eat")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "breakfast");
            startActivity(intent);
        }
        if(choice.equalsIgnoreCase("entertainment")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "movies");
            startActivity(intent);
        }
    }

    public void onSecondButtonClick(View v) {
        if (choice.equalsIgnoreCase("eat")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "lunch");
            startActivity(intent);
        }
        if(choice.equalsIgnoreCase("entertainment")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "concerts");
            startActivity(intent);
        }
    }

    public void onThirdButtonClick(View v) {
        if (choice.equalsIgnoreCase("eat")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "dinner");
            startActivity(intent);
        }
        if(choice.equalsIgnoreCase("entertainment")) {
            Intent intent = new Intent(this, DetailedChoicesActivity.class);
            intent.putExtra(DetailedChoicesActivity.MY_DETAILED_CHOICE, "activities");
            startActivity(intent);
        }
    }


}
