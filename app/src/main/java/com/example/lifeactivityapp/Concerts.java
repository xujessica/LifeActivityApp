package com.example.lifeactivityapp;

public class Concerts {
    private String name;

    // Inlcude rating and date released when done with main functionality of project

    public Concerts(String name){
        this.name = name;
    }

    public static final Concerts[] Rap = {
            new Concerts("Cardi B"),
            new Concerts("A Boogie Wit Da Hoodie"),
            new Concerts("Chance the Rapper"),
            new Concerts("Logic"),
            new Concerts("Snoop dog"),
            new Concerts("Post Malone"),
            new Concerts("Lizzo"),
            new Concerts("Louis the Child"),
    };

    public static final Concerts[] Pop = {
            new Concerts("Alessia Cara"),
            new Concerts("Ariana Grande"),
            new Concerts("Jonas Brothers"),
            new Concerts("Taylor Swift"),
            new Concerts("Maroon 5"),
            new Concerts("Billie Ellish"),
            new Concerts("Backstreet Boys"),
            new Concerts("Lady Gaga"),
    };

    public static final Concerts[] Country = {
            new Concerts("Floridea Georgia Line"),
            new Concerts("Carrie Underwood"),
            new Concerts("Old Dominion"),
            new Concerts("Kane Brown"),
            new Concerts("Luke Combs"),
            new Concerts("Thomas Rhett"),
            new Concerts("Luke Bryan"),
            new Concerts("Zac Brown Band"),
    };


}
