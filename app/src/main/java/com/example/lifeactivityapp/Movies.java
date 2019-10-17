package com.example.lifeactivityapp;

public class Movies {
    private String name;

    // Inlcude rating and date released when done with main functionality of project

    public Movies(String name){
        this.name = name;
    }

    public static final Movies[] Action = {
            new Movies("Joker"),
            new Movies("Spiderman"),
            new Movies("Avengers"),
            new Movies("Fast and Furious"),
            new Movies("Die Hard"),
            new Movies("Mad Max"),
            new Movies("Expendables"),
            new Movies("Terminator"),
    };

    public static final Movies[] Comedy = {
            new Movies("Napolean's Dynamite"),
            new Movies("Bridesmaids"),
            new Movies("Mean Girls"),
            new Movies("The Hangover"),
            new Movies("Grown Ups"),
            new Movies("Deadpool"),
            new Movies("Legally Blonde"),
            new Movies("Dumb and Dumber"),
    };

    public static final Movies[] Romance = {
            new Movies("The Notebook"),
            new Movies("50 First Dates"),
            new Movies("How to Lose a Guy in 10 days"),
            new Movies("A Walk to Remember"),
            new Movies("The Longest Ride"),
            new Movies("Mad Max"),
            new Movies("Expendables"),
            new Movies("Terminator"),
    };

    public static final Movies[] Kids = {
            new Movies("Frozen 2"),
            new Movies("The Lion King"),
            new Movies("Abominable"),
            new Movies("Dora and the Lost City of Gold"),
            new Movies("Coco"),
            new Movies("Moana"),
            new Movies("Inside Out"),
            new Movies("Cars"),
    };




}
