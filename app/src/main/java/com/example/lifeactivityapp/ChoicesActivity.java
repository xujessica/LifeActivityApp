package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChoicesActivity extends AppCompatActivity {


    public static final String MY_CHOICE = "choice";
    Intent intent;
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        intent = getIntent();
        choice = intent.getStringExtra(MY_CHOICE);
        TextView title = (TextView) findViewById(R.id.choiceTitle);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button thirdButton = (Button) findViewById(R.id.thirdButton);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        if(choice.equalsIgnoreCase("eat")){
            layout.setBackgroundResource(R.drawable.blue_gradient);

            title.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.eatTitleFontSize));
            title.setText("EAT ");

            firstButton.setText("BREAKFAST");
            firstButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);
            firstButton.setVisibility(View.VISIBLE);

            secondButton.setText("LUNCH");
            secondButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

            thirdButton.setText("DINNER");
            thirdButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);

            }

        if (choice.equalsIgnoreCase("entertainment")) {
            layout.setBackgroundResource(R.drawable.red_gradient);

            title.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.entertainmentTitleFontSize));
            title.setText("ENTERTAINMENT ");

            firstButton.setText("MOVIES");
            firstButton.setBackgroundResource(R.drawable.transparent_bg_bordered_button);
            firstButton.setVisibility(View.VISIBLE);

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

