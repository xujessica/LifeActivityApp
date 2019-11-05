package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

import static com.example.lifeactivityapp.Concerts.getRap;
import static com.example.lifeactivityapp.Movies.getAction;
import static com.example.lifeactivityapp.Movies.getComedy;
import static com.example.lifeactivityapp.Movies.getKids;
import static com.example.lifeactivityapp.Movies.getRomance;

public class RandomActivity extends AppCompatActivity
{
    Random random;
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
            if(eatRand == 0)
            {

            }
            else if(eatRand == 1)
            {

            }
            else if(eatRand == 2)
            {

            }
        }
        else if (eatOrEntertain == 1)
        {
            String name = "";
            String description = "";
            double rating = 0.0;
            String famousSong = " ";

            int entertainRand = random.nextInt(2);
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
                else if(movieRand == 2)
                {
                    int randomNum = random.nextInt(kmLength);
                    name = getKids()[randomNum].toString();
                    description = getKids()[randomNum].getDescription();
                    rating = getKids()[randomNum].getRating();
                }
            }
            else if(entertainRand == 1)
            {

            }
            else if(entertainRand == 2)
            {

            }
        }
    }
}
