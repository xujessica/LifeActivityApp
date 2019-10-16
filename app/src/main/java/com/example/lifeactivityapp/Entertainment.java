package com.example.lifeactivityapp;

public class Entertainment {
    private String restaurant;
    private String description;
    private int price;
    //private int imageResourceID;

    // price 0 = low and 1 = high
    public Entertainment(String restaurant, String description,
                       int price) { //int imageResourceID) {
        this.restaurant = restaurant;
        this.description = description;
        this.price = price;
        //this.imageResourceID = imageResourceID;
    }

    public static final Entertainment[] breakfastPlaces = {
            new Entertainment("Einstein Bros. Bagels", "", 0),
            new Entertainment("Dunkin Donuts", "",0),
            new Entertainment("Mcdonalds", "",0),
            new Entertainment("Wildberry Pancakes & Cafe", "", 1),

    };

}
