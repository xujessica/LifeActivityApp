package com.example.lifeactivityapp;

public class Restaurants {
    private String restaurant;
    private String description;
    private int price;
    //private int imageResourceID;

    // price 0 = low and 1 = high
    public Restaurants(String restaurant, String description,
                int price) { //int imageResourceID) {
        this.restaurant = restaurant;
        this.description = description;
        this.price = price;
        //this.imageResourceID = imageResourceID;
    }

    public static final Restaurants[] breakfastPlaces = {
            new Restaurants("Einstein Bros. Bagels", "", 0),
            new Restaurants("Dunkin Donuts", "",0),
            new Restaurants("Mcdonalds", "",0),
            new Restaurants("Wildberry Pancakes & Cafe", "", 1),
            
    };

}
