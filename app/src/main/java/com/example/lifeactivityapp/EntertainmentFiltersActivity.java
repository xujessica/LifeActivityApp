package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


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
    String str, str2, detailedChoice;
    Intent displayIntents;
    Random randomGenerator;
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    Random random;
    String type;
    boolean checked, checked1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_filters);

        ConstraintLayout layoutEF = findViewById(R.id.layoutEF);
        layoutEF.setBackgroundResource(R.drawable.red_gradient);

        randomGenerator = new Random();

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

        RadioButton b1 = findViewById(R.id.radioButton);
        RadioButton b2 = findViewById(R.id.radioButton2);
        RadioButton b3 = findViewById(R.id.radioButton3);
        RadioButton b4 = findViewById(R.id.radioButton4);
        RadioButton b5 = findViewById(R.id.radioButton5);

        RadioButton b6 = findViewById(R.id.radioButton6);
        RadioButton b7 = findViewById(R.id.radioButton7);
        RadioButton b8 = findViewById(R.id.radioButton8);
        RadioGroup rg = findViewById(R.id.radioGroup2);


        if(detailedChoice.equalsIgnoreCase("movies")){
            b1.setText("Action");
            b2.setText("Comedy");
            b3.setText("Romance");
            b4.setText("Kids");
            b5.setVisibility(View.INVISIBLE);
            b6.setText("Rating: < 6.9");
            b7.setText("Rating: 7.0 - 7.9");
            b8.setText("Rating: 8.0 - 8.9");
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
            b6.setText("Indoor");
            b7.setText("Outdoor");
            b8.setVisibility(View.GONE);
        }
    }

   public void onRadioButtonClicked(View view) {
       checked = ((RadioButton) view).isChecked();

       switch (view.getId()) {
           case R.id.radioButton:
               if (checked)
                   str = "first";
               break;
           case R.id.radioButton2:
               if (checked)
                   str = "second";
               break;
           case R.id.radioButton3:
               if (checked)
                   str = "third";
               break;
           case R.id.radioButton4:
               if (checked)
                   str = "fourth";
               break;
       }
   }

   public void onSecondRadioButtonClicked(View view) {
       checked1 = ((RadioButton) view).isChecked();

       switch(view.getId()){
           case R.id.radioButton6:
               if(checked1)
                   str2 = "fifth";
               break;
           case R.id.radioButton7:
               if(checked1)
                   str2 = "sixth";
               break;
           case R.id.radioButton8:
               if(checked1)
                   str2 = "seventh";
               break;
       }

   }

   public void displayToast(){
       Context context = getApplicationContext();
       CharSequence text = "Choose All Options!";
       int duration = Toast.LENGTH_SHORT;

       Toast toast = Toast.makeText(context, text, duration);

       toast.show();
       toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);

   }



    public void onClickApply(View view){

        if(detailedChoice.equalsIgnoreCase("movies") || detailedChoice.equalsIgnoreCase("activities")){
            if(checked && checked1){
                selectOneActivity();
                selectOneMovie();

                Intent displayIntent = new Intent(this, DisplayActivity.class);


                displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
                displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
                displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
                displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
                displayIntent.putExtra(DisplayActivity.MY_FAMOUS_SONG, famousSong);
                displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_TYPE, type);

                startActivity(displayIntent);

            }
            else
                displayToast();
        }
        else
            if(checked){
                selectOneConcert();

                Intent displayIntent = new Intent(this, DisplayActivity.class);


                displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_NAME, name); // Avengers
                displayIntent.putExtra(DisplayActivity.MY_DESCRIPTION, description);
                displayIntent.putExtra(DisplayActivity.MY_DISPLAY_CHOICE, detailedChoice); // movies
                displayIntent.putExtra(DisplayActivity.MY_RATING_STARS, rating);
                displayIntent.putExtra(DisplayActivity.MY_FAMOUS_SONG, famousSong);
                displayIntent.putExtra(DisplayActivity.MY_ENTERTAINMENT_TYPE, type);

                startActivity(displayIntent);
            }else
                displayToast();
        }



    public void selectOneMovie(){
        int amLength = getAction().length;
        int cmLength = getComedy().length;
        int rmLength = getRomance().length;
        int kmLength = getKids().length;

        //try {

            if (detailedChoice.equalsIgnoreCase("movies")) {

                // Action
                if (str.equalsIgnoreCase("first")) {
                    type = "Action";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(amLength);
                        int i = 0;
                        while (i < 50) {
                            if (getAction()[randomNum].findIf6_9()) {
                                name = getAction()[randomNum].toString();
                                description = getAction()[randomNum].getDescription();
                                rating = getAction()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(amLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(amLength);
                        int i = 0;
                        while (i < 50) {
                            if (getAction()[randomNum].findIf7_9()) {
                                name = getAction()[randomNum].toString();
                                description = getAction()[randomNum].getDescription();
                                rating = getAction()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(amLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("seventh")) {
                        int randomNum = random.nextInt(amLength);
                        int i = 0;
                        while (i < 50) {
                            if (getAction()[randomNum].findIf8_9()) {
                                name = getAction()[randomNum].toString();
                                description = getAction()[randomNum].getDescription();
                                rating = getAction()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(amLength);
                            }
                            i++;
                        }
                    }
                }

                // Comedy

                if (str.equalsIgnoreCase("second")) {
                    type = "Comedy";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(cmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getComedy()[randomNum].findIf6_9()) {
                                name = getComedy()[randomNum].toString();
                                description = getComedy()[randomNum].getDescription();
                                rating = getComedy()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(cmLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(cmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getComedy()[randomNum].findIf7_9()) {
                                name = getComedy()[randomNum].toString();
                                description = getComedy()[randomNum].getDescription();
                                rating = getComedy()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(cmLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("seventh")) {
                        int randomNum = random.nextInt(cmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getComedy()[randomNum].findIf8_9()) {
                                name = getComedy()[randomNum].toString();
                                description = getComedy()[randomNum].getDescription();
                                rating = getComedy()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(cmLength);
                            }
                            i++;
                        }
                    }
                }

                // Romance

                if (str.equalsIgnoreCase("third")) {
                    type = "Romance";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(rmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getRomance()[randomNum].findIf6_9()) {
                                name = getRomance()[randomNum].toString();
                                description = getRomance()[randomNum].getDescription();
                                rating = getRomance()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(rmLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(rmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getRomance()[randomNum].findIf7_9()) {
                                name = getRomance()[randomNum].toString();
                                description = getRomance()[randomNum].getDescription();
                                rating = getRomance()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(rmLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("seventh")) {
                        int randomNum = random.nextInt(rmLength);
                        int i = 0;
                        while (i < 50) {
                            if (getRomance()[randomNum].findIf8_9()) {
                                name = getRomance()[randomNum].toString();
                                description = getRomance()[randomNum].getDescription();
                                rating = getRomance()[randomNum].getRating();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(rmLength);
                            }
                            i++;
                        }
                    }
                }

            }

            // Kids

            if (str.equalsIgnoreCase("fourth")) {
                type = "Kids";
                if (str2.equalsIgnoreCase("fifth")) {
                    int randomNum = random.nextInt(kmLength);
                    int i = 0;
                    while (i < 50) {
                        if (getKids()[randomNum].findIf6_9()) {
                            name = getKids()[randomNum].toString();
                            description = getKids()[randomNum].getDescription();
                            rating = getKids()[randomNum].getRating();
                            i = 100;
                        } else {
                            randomNum = random.nextInt(kmLength);
                        }
                        i++;
                    }
                }
                if (str2.equalsIgnoreCase("sixth")) {
                    int randomNum = random.nextInt(kmLength);
                    int i = 0;
                    while (i < 50) {
                        if (getKids()[randomNum].findIf7_9()) {
                            name = getKids()[randomNum].toString();
                            description = getKids()[randomNum].getDescription();
                            rating = getKids()[randomNum].getRating();
                            i = 100;
                        } else {
                            randomNum = random.nextInt(kmLength);
                        }
                        i++;
                    }
                }
                if (str2.equalsIgnoreCase("seventh")) {
                    int randomNum = random.nextInt(kmLength);
                    int i = 0;
                    while (i < 50) {
                        if (getKids()[randomNum].findIf8_9()) {
                            name = getKids()[randomNum].toString();
                            description = getKids()[randomNum].getDescription();
                            rating = getKids()[randomNum].getRating();
                            i = 100;
                        } else {
                            randomNum = random.nextInt(kmLength);
                        }
                        i++;
                    }
                }
            }

    }







    public void selectOneConcert(){

        int rcLength = getRap().length;
        int pcLength = getPop().length;
        int ccLength = getCountry().length;
        // Concerts
            if (detailedChoice.equalsIgnoreCase("concerts")) {
                if (str.equalsIgnoreCase("first")) {
                    type = "Rap";
                    int randomNum = random.nextInt(rcLength);
                    name = getRap()[randomNum].toString();
                    description = getRap()[randomNum].getDescription();
                    famousSong = getRap()[randomNum].getFamousSong();
                }
                if (str.equalsIgnoreCase("second")) {
                    type = "Pop";
                    int randomNum = random.nextInt(pcLength);
                    name = getPop()[randomNum].toString();
                    description = getPop()[randomNum].getDescription();
                    famousSong = getRap()[randomNum].getFamousSong();
                }
                if (str.equalsIgnoreCase("third")) {
                    type = "Country";
                    int randomNum = random.nextInt(ccLength);
                    name = getCountry()[randomNum].toString();
                    description = getCountry()[randomNum].getDescription();
                    famousSong = getCountry()[randomNum].getFamousSong();
                }
            }


    }


    public void selectOneActivity(){
        int spLength = getSpring().length;
        int sALength = getSummer().length;
        int fALength = getFall().length;
        int wALength = getWinter().length;

        //try {
            // Activities
            if (detailedChoice.equalsIgnoreCase("activities")) {
                type = "Spring";
                if (str.equalsIgnoreCase("first")) {
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(spLength);
                        int i = 0;
                        while (i < 50) {
                            if (getSpring()[randomNum].isIndoors()) {
                                name = getSpring()[randomNum].toString();
                                description = getSpring()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(spLength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(spLength);
                        int i = 0;
                        while (i < 50) {
                            if (!getSpring()[randomNum].isIndoors()) {
                                name = getSpring()[randomNum].toString();
                                description = getSpring()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(spLength);
                            }
                            i++;
                        }
                    }

                }
                if (str.equalsIgnoreCase("second")) {
                    type = "Summer";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(sALength);
                        int i = 0;
                        while (i < 50) {
                            if (getSummer()[randomNum].isIndoors()) {
                                name = getSummer()[randomNum].toString();
                                description = getSummer()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(sALength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(sALength);
                        int i = 0;
                        while (i < 50) {
                            if (!getSummer()[randomNum].isIndoors()) {
                                name = getSummer()[randomNum].toString();
                                description = getSummer()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(sALength);
                            }
                            i++;
                        }
                    }
                }
                if (str.equalsIgnoreCase("third")) {
                    type = "Fall";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(fALength);
                        int i = 0;
                        while (i < 50) {
                            if (getFall()[randomNum].isIndoors()) {
                                name = getFall()[randomNum].toString();
                                description = getFall()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(fALength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(fALength);
                        int i = 0;
                        while (i < 50) {
                            if (!getFall()[randomNum].isIndoors()) {
                                name = getFall()[randomNum].toString();
                                description = getFall()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(fALength);
                            }
                            i++;
                        }
                    }
                }
                if (str.equalsIgnoreCase("fourth")) {
                    type = "Winter";
                    if (str2.equalsIgnoreCase("fifth")) {
                        int randomNum = random.nextInt(wALength);
                        int i = 0;
                        while (i < 50) {
                            if (getWinter()[randomNum].isIndoors()) {
                                name = getWinter()[randomNum].toString();
                                description = getWinter()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(wALength);
                            }
                            i++;
                        }
                    }
                    if (str2.equalsIgnoreCase("sixth")) {
                        int randomNum = random.nextInt(wALength);
                        int i = 0;
                        while (i < 50) {
                            if (!getWinter()[randomNum].isIndoors()) {
                                name = getWinter()[randomNum].toString();
                                description = getWinter()[randomNum].getLocation();
                                i = 100;
                            } else {
                                randomNum = random.nextInt(wALength);
                            }
                            i++;
                        }
                    }
                }
            }
    }



}
