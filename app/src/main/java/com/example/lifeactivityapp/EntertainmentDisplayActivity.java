package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.lifeactivityapp.Activities.getFall;
import static com.example.lifeactivityapp.Activities.getSpring;
import static com.example.lifeactivityapp.Activities.getSummer;
import static com.example.lifeactivityapp.Activities.getWinter;
import static com.example.lifeactivityapp.Concerts.getCountry;
import static com.example.lifeactivityapp.Concerts.getPop;
import static com.example.lifeactivityapp.Concerts.getRap;
import static com.example.lifeactivityapp.Movies.getAction;
import static com.example.lifeactivityapp.Movies.getComedy;
import static com.example.lifeactivityapp.Movies.getKids;
import static com.example.lifeactivityapp.Movies.getRomance;

public class EntertainmentDisplayActivity extends AppCompatActivity {

    public static final String CATEGORY = "category";
    public static final String RADIO_GROUP = "radio_group";
    public static final String BUTTON = "button";
    Intent intent;
    String category, numberButton;
    StringBuilder stringBuilder;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_display);

        tv = findViewById(R.id.textView);

        ConstraintLayout layoutED = (ConstraintLayout) findViewById(R.id.layoutED);
        layoutED.setBackgroundResource(R.drawable.red_gradient);

        stringBuilder = new StringBuilder();

        intent = getIntent();
        category = intent.getStringExtra(CATEGORY);
        numberButton = intent.getStringExtra(BUTTON);

        if(category.equals("movies")){
            moviesDisplay();
        }
        else if(category.equals("concerts")){
            concertsDisplay();
        }
        else{
            activitiesDisplay();
        }

    }

    public void moviesDisplay(){
        if(numberButton.equalsIgnoreCase("first")) {
            stringBuilder.append("These are the list of action movies: \n");
            for(int i = 0; i < getAction().length; i++) {
                stringBuilder.append(getAction()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("second")){
            stringBuilder.append("These are the list of comedy movies: \n");
            for(int i = 0; i < getComedy().length; i++) {
                stringBuilder.append(getComedy()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("third")){
            stringBuilder.append("These are the list of romance movies: \n");
            for(int i = 0; i < getRomance().length; i++) {
                stringBuilder.append(getRomance()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else//(numberButton.equalsIgnoreCase("fourth"))
        {
            stringBuilder.append("These are the list of kid movies: \n");
            for(int i = 0; i < getKids().length; i++) {
                stringBuilder.append(getKids()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
    }

    public void concertsDisplay(){
        if(numberButton.equalsIgnoreCase("first")) {
            stringBuilder.append("These are the list of rap concerts: \n");
            for(int i = 0; i < getRap().length; i++) {
                stringBuilder.append(getRap()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("second")){
            stringBuilder.append("These are the list of pop concerts: \n");
            for(int i = 0; i < getPop().length; i++) {
                stringBuilder.append(getPop()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("third")){
            stringBuilder.append("These are the list of country concerts: \n");
            for(int i = 0; i < getCountry().length; i++) {
                stringBuilder.append(getCountry()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
    }

    public void activitiesDisplay(){
        if(numberButton.equalsIgnoreCase("first")) {
            stringBuilder.append("These are the list of spring activities: \n");
            for(int i = 0; i < getSpring().length; i++) {
                stringBuilder.append(getSpring()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("second")){
            stringBuilder.append("These are the list of summer activities: \n");
            for(int i = 0; i < getSummer().length; i++) {
                stringBuilder.append(getSummer()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else if(numberButton.equalsIgnoreCase("third")){
            stringBuilder.append("These are the list of fall activities: \n");
            for(int i = 0; i < getFall().length; i++) {
                stringBuilder.append(getFall()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
        else//(numberButton.equalsIgnoreCase("fourth"))
        {
            stringBuilder.append("These are the list of winter activities: \n");
            for(int i = 0; i < getWinter().length; i++) {
                stringBuilder.append(getWinter()[i].toString() + "\n");
            }
            tv.setText(stringBuilder.toString());
        }
    }

}
