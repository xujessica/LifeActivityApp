package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

public class RandomActivity extends AppCompatActivity
{
    Random random;
    String name = "";
    String description = "";
    double rating = 0.0;
    String famousSong = " ";
    String idk = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    public void mainRandom()
    {
        int eatOrEntertain = random.nextInt(1);
        if (eatOrEntertain == 0)
        {
            int eatRand = random.nextInt(2);
            //breakfast
            if(eatRand == 0)
            {
                //int breakfastRand = Resturants.getBreakfastPlaces().length
            }
            //lunch
            else if(eatRand == 1)
            {

            }
            //dinner
            else if(eatRand == 2)
            {

            }
        }
        else if (eatOrEntertain == 1)
        {
            int entertainRand = random.nextInt(2);
            //Movies
            if(entertainRand == 0)
            {
                int movieRand = random.nextInt(3);

                int amLength = getAction().length;
                int cmLength = getComedy().length;
                int rmLength = getRomance().length;
                int kmLength = getKids().length;

                if(movieRand == 0)
                {
                    int randomNum = random.nextInt(amLength);
                    name = getAction()[randomNum].toString();
                    description = getAction()[randomNum].getDescription();
                    rating = getAction()[randomNum].getRating();
                }
                else if(movieRand == 1)
                {
                    int randomNum = random.nextInt(cmLength);
                    name = getComedy()[randomNum].toString();
                    description = getComedy()[randomNum].getDescription();
                    rating = getComedy()[randomNum].getRating();
                }
                else if(movieRand == 2)
                {
                    int randomNum = random.nextInt(rmLength);
                    name = getRomance()[randomNum].toString();
                    description = getRomance()[randomNum].getDescription();
                    rating = getRomance()[randomNum].getRating();
                }
                else if(movieRand == 3)
                {
                    int randomNum = random.nextInt(kmLength);
                    name = getKids()[randomNum].toString();
                    description = getKids()[randomNum].getDescription();
                    rating = getKids()[randomNum].getRating();
                }
            }
            //Concerts
            else if(entertainRand == 1)
            {
                int concertRand = random.nextInt(2);

                int rcLength = getRap().length;
                int pcLength = getPop().length;
                int ccLength = getCountry().length;

                if(concertRand == 0)
                {
                    int randomNum = random.nextInt(rcLength);
                    name = getRap()[randomNum].toString();
                    description = getRap()[randomNum].getDescription();
                    famousSong = getRap()[randomNum].getFamousSong();
                }
                else if(concertRand == 1)
                {
                    int randomNum = random.nextInt(pcLength);
                    name = getPop()[randomNum].toString();
                    description = getPop()[randomNum].getDescription();
                    famousSong = getRap()[randomNum].getFamousSong();
                }
                else if(concertRand == 2)
                {
                    int randomNum = random.nextInt(ccLength);
                    name = getCountry()[randomNum].toString();
                    description = getCountry()[randomNum].getDescription();
                    famousSong = getCountry()[randomNum].getFamousSong();
                }


            }
            //Activities
            else if(entertainRand == 2)
            {
                int activityRand = random.nextInt(3);

                int spLength = getSpring().length;
                int sALength = getSummer().length;
                int fALength = getFall().length;
                int wALength = getWinter().length;

                if(activityRand == 0)
                {
                    int randomNum = random.nextInt(spLength);
                    name = getSpring()[randomNum].toString();
                    description = getSpring()[randomNum].getLocation();
                    idk = getSpring()[randomNum].getIDK();
                }
                else if(activityRand == 1)
                {
                    int randomNum = random.nextInt(sALength);
                    name = getSummer()[randomNum].toString();
                    description = getSummer()[randomNum].getLocation();
                    idk = getSummer()[randomNum].getIDK();
                }
                else if(activityRand == 2)
                {
                    int randomNum = random.nextInt(fALength);
                    name = getFall()[randomNum].toString();
                    description = getFall()[randomNum].getLocation();
                    idk = getFall()[randomNum].getIDK();
                }
                else if(activityRand == 3)
                {
                    int randomNum = random.nextInt(wALength);
                    name = getWinter()[randomNum].toString();
                    description = getWinter()[randomNum].getLocation();
                    idk = getWinter()[randomNum].getIDK();
                }
            }
        }
    }
}
