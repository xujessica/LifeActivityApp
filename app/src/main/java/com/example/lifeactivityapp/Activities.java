package com.example.lifeactivityapp;

public class Activities {
    private String name;
    public String desciption;
    public String location;

    // Inlcude rating and date released when done with main functionality of project

    public Activities(String name){
        this.name = name;
    }

    public static final Activities[] Rap = {
            new Activities("Cardi B"),
            new Activities("A Boogie Wit Da Hoodie"),
            new Activities("Chance the Rapper"),
            new Activities("Logic"),
            new Activities("Snoop dog"),
            new Activities("Post Malone"),
            new Activities("Lizzo"),
            new Activities("Louis the Child"),
    };

    public static final Activities[] Pop = {
            new Activities("Alessia Cara"),
            new Activities("Ariana Grande"),
            new Activities("Jonas Brothers"),
            new Activities("Taylor Swift"),
            new Activities("Maroon 5"),
            new Activities("Billie Ellish"),
            new Activities("Backstreet Boys"),
            new Activities("Lady Gaga"),
    };

    public static final Activities[] Country = {
            new Activities("Floridea Georgia Line"),
            new Activities("Carrie Underwood"),
            new Activities("Old Dominion"),
            new Activities("Kane Brown"),
            new Activities("Luke Combs"),
            new Activities("Thomas Rhett"),
            new Activities("Luke Bryan"),
            new Activities("Zac Brown Band"),
    };


}
