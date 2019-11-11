package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Filter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

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

public class EntertainmentFiltersActivity extends AppCompatActivity {

    public static final String MY_ENTERTAINMENT_CHOICES = "entertainmentChoices";
    String str, detailedChoice;
    Intent displayIntents;
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    Random random;
    String idk = ""; // variable because one class doesn't have three
    String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_filters);

        ConstraintLayout layoutEF = (ConstraintLayout) findViewById(R.id.layoutEF);
        layoutEF.setBackgroundResource(R.drawable.red_gradient);

        displayIntents = getIntent();
        detailedChoice = displayIntents.getStringExtra(MY_ENTERTAINMENT_CHOICES);

        random = new Random();

        defineOptions();
    }

    public void onFavoritesClick (View v) {
        Intent intent = new Intent (this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void onHomeClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


    public void defineOptions(){

        RadioButton b1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton b2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton b3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton b4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton b5 = (RadioButton) findViewById(R.id.radioButton5);

        RadioButton b6 = (RadioButton) findViewById(R.id.radioButton6);
        RadioButton b7 = (RadioButton) findViewById(R.id.radioButton7);
        RadioButton b8 = (RadioButton) findViewById(R.id.radioButton8);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup2);

        if(detailedChoice.equalsIgnoreCase("movies")){
            b1.setText("Action");
            b2.setText("Comedy");
            b3.setText("Romance");
            b4.setText("Kids");
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
        if(detailedChoice.equalsIgnoreCase("concerts")){
            b1.setText("Rap");
            b2.setText("Pop");
            b3.setText("Country");
            b4.setVisibility(View.INVISIBLE);
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
        if(detailedChoice.equalsIgnoreCase("activities")){
            b1.setText("Spring");
            b2.setText("Summer");
            b3.setText("Fall");
            b4.setText("Winter");
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
    }

   public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.radioButton:
                if(checked)
                    str = "first";
                break;
            case R.id.radioButton2:
                if(checked)
                    str = "second";
                break;
            case R.id.radioButton3:
                if(checked)
                    str = "third";
                break;
            case R.id.radioButton4:
                if(checked)
                    str = "fourth";
                break;
            case R.id.radioButton5:
                if(checked)
                    str = "fifth";
                break;
        }
    }

    public void onClickApply(View view){

        selectOneMovie();
        selectOneConcert();
        selectOneActivity();

        Intent displayIntent = new Intent(this, FilterDisplayActivity.class);


        displayIntent.putExtra(FilterDisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
        displayIntent.putExtra(FilterDisplayActivity.MY_DESCRIPTION, description);
        displayIntent.putExtra(FilterDisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
        displayIntent.putExtra(FilterDisplayActivity.MY_RATING_STARS, rating);
        displayIntent.putExtra(FilterDisplayActivity.MY_FAMOUS_SONG, rating);
        displayIntent.putExtra(FilterDisplayActivity.MY_ENTERTAINMENT_TYPE, type);

        startActivity(displayIntent);

    }


    public void selectOneMovie(){
        int amLength = getAction().length;
        int cmLength = getComedy().length;
        int rmLength = getRomance().length;
        int kmLength = getKids().length;


        if(detailedChoice.equalsIgnoreCase("movies")){
            if(str.equalsIgnoreCase("first")){
                int randomNum = random.nextInt(amLength);
                name = getAction()[randomNum].toString();
                description = getAction()[randomNum].getDescription();
                rating = getAction()[randomNum].getRating();
                type = "Action";
            }
            if(str.equalsIgnoreCase("second")){
                int randomNum = random.nextInt(cmLength);
                name = getComedy()[randomNum].toString();
                description = getComedy()[randomNum].getDescription();
                rating = getComedy()[randomNum].getRating();
                type = "Comedy";
            }
            if(str.equalsIgnoreCase("third")){
                int randomNum = random.nextInt(rmLength);
                name = getRomance()[randomNum].toString();
                description = getRomance()[randomNum].getDescription();
                rating = getRomance()[randomNum].getRating();
                type = "Romance";
            }
            if(str.equalsIgnoreCase("fourth")){
                int randomNum = random.nextInt(kmLength);
                name = getKids()[randomNum].toString();
                description = getKids()[randomNum].getDescription();
                rating = getKids()[randomNum].getRating();
                type = "Kids";
            }
        }




    }

    public void selectOneConcert(){

        int rcLength = getRap().length;
        int pcLength = getPop().length;
        int ccLength = getCountry().length;
        // Concerts
        if(detailedChoice.equalsIgnoreCase("concerts")){
            if(str.equalsIgnoreCase("first")){
                int randomNum = random.nextInt(rcLength);
                name = getRap()[randomNum].toString();
                description = getRap()[randomNum].getDescription();
                famousSong = getRap()[randomNum].getFamousSong();
                type = "Rap";
            }
            if(str.equalsIgnoreCase("second")){
                int randomNum = random.nextInt(pcLength);
                name = getPop()[randomNum].toString();
                description = getPop()[randomNum].getDescription();
                famousSong = getRap()[randomNum].getFamousSong();
                type = "Pop";
            }
            if(str.equalsIgnoreCase("third")){
                int randomNum = random.nextInt(ccLength);
                name = getCountry()[randomNum].toString();
                description = getCountry()[randomNum].getDescription();
                famousSong = getCountry()[randomNum].getFamousSong();
                type = "Country";
            }
        }
    }

    public void selectOneActivity(){
        int spLength = getSpring().length;
        int sALength = getSummer().length;
        int fALength = getFall().length;
        int wALength = getWinter().length;


        // Activities
        if(detailedChoice.equalsIgnoreCase("activities")){
            if(str.equalsIgnoreCase("first")){
                int randomNum = random.nextInt(spLength);
                name = getSpring()[randomNum].toString();
                description = getSpring()[randomNum].getLocation();
                type = "Spring";
            }
            if(str.equalsIgnoreCase("second")){
                int randomNum = random.nextInt(sALength);
                name = getSummer()[randomNum].toString();
                description = getSummer()[randomNum].getLocation();
                type = "Summer";
            }
            if(str.equalsIgnoreCase("third")){
                int randomNum = random.nextInt(fALength);
                name = getFall()[randomNum].toString();
                description = getFall()[randomNum].getLocation();
                type = "Fall";
            }
            if(str.equalsIgnoreCase("fourth")){
                int randomNum = random.nextInt(wALength);
                name = getWinter()[randomNum].toString();
                description = getWinter()[randomNum].getLocation();
                type = "Winter";
            }
        }
    }



}
