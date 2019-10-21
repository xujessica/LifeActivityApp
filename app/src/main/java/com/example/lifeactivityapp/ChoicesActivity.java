package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ChoicesActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    public static final String MY_CHOICE = "choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        Intent intent = getIntent();
        String choice = intent.getStringExtra(MY_CHOICE);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button thirdButton = (Button) findViewById(R.id.thirdButton);

        if(choice.equals("eat")){
            constraintLayout= new ConstraintLayout(this);
            constraintLayout.setBackgroundResource(R.drawable.blue_gradient);
            setContentView(constraintLayout);
            firstButton.setText("BREAKFAST");
            firstButton.setBackground();
            secondButton.setText("LUNCH");
            thirdButton.setText("DINNER");
        }
    }




}
