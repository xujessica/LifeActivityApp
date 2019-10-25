package com.example.lifeactivityapp;

public class Restaurants {
    private String restaurant;
    private String description;
    private int price;
    private String type;
    private double rating;
    //private int imageResourceID;

    // price 0 = low and 1 = high
    public Restaurants(String restaurant, String description,
                int price, String type, double rating) { //int imageResourceID) {
        this.restaurant = restaurant;
        this.description = description;
        this.price = price;
        this.type = type;
        this.rating = rating;
        //this.imageResourceID = imageResourceID;
    }

    public static final Restaurants[] breakfastPlaces = {
            new Restaurants("Einstein Bros. Bagels", "American bagel and coffee chain", 0, "chain", 2.0),
            new Restaurants("Dunkin Donuts", "American multinational coffee/donut company and quick service restaurant",0, "chain",2.0),
            new Restaurants("Mcdonald's", "Fast food, limited service restaurant",0, "chain",2.0),
            new Restaurants("Wildberry Pancakes & Cafe", "Bustling, family-oriented eatery features American breakfasts & lunches in a smart setting", 1, "chain",4.5),
            new Restaurants("Denny's", "American table service diner-style restaurant chain", 0, "chain",2.5),
            new Restaurants("IHOP", "American multinational pancake house restaurant chain that specializes in breakfast foods", 0, "chain",3),
            new Restaurants("Egg Harbor Cafe","High quality, carefully-sourced breakfast and lunch with fast, friendly service in a contemporary farmhouse setting",1, "chain",4),
            new Restaurants("Walker Bros. Original Pancake House","Serving you the very best, from our famous Apple Pancake to our thick sliced Bacon",1,"chain",4),
            new Restaurants("Anna's Red Apple","Casual American cafe serving classic breakfast fare plus salads, sandwiches & burgers",1,"local",4),
            new Restaurants("Bread and Butter Cafe","Breakfast and Brunch restaurant",0,"local",4),
            new Restaurants("Gus' Diner","Family-friendly spot with a retro 1950s theme serving waffles, burgers & other American classics",1,"local",4),
            new Restaurants("Jelly Cafe","Airy, contemporary cafe serving up breakfast & sandwiches made with local produce",1,"local",4),
            new Restaurants("Southern Belle's","We use only the finest and freshest ingredients to create a meal that will fill your belly and warm your heart",1,"local",4),
            new Restaurants("Honey-Jam Cafe","Discover our passion for delectable dishes and dedicated customer service",1,"local",4),
            new Restaurants("Billy's Pancake House","Old-fashioned eatery since 1971 with pancakes & crêpes in original flavors, plus sandwiches & soups",1,"local", 3.5),
            new Restaurants("Golden Brunch","Casual diner providing breakfast classics, burgers, salads, sandwiches & wraps for dine-in or to-go",1,"local", 4.5)
    };

    public static final Restaurants[] lunchPlaces = {
            new Restaurants("Jimmy John's","American franchised sandwich fast food restaurant chain, specializing in delivery.",0,"chain", 2.5),
            new Restaurants("Vini's Pizza","",0,"fast food", 3.5),
            new Restaurants("Chipotle","American chain of fast casual restaurants specializing in tacos and Mission-style burritos.",0,"fast food", 2.5),
            new Restaurants("Portillos","",0,"fast food", 4),
            new Restaurants("Chick-fil-A","The largest quick-service chicken restaurant chain in the United States",0,"fast food", 4),
            new Restaurants("Culver's","",0,"fast food", 3.5),
            new Restaurants("Wendy's","",0,"fast food", 2.0),
            new Restaurants("Heng Wing Restaurant","",0,"sit down", 3.5),
            new Restaurants("Tap House Grill","",0,"sit down", 3.5),
            new Restaurants("Mother Cluckers Kitchen","",0,"sit down", 4.0),
            new Restaurants("Gianni's Cafe","",0,"sit down", 4.0),
            new Restaurants("Brandt's","",0,"sit down",4.0),
            new Restaurants("On the Border","",0,"sit down", 3.0),
            new Restaurants("Giordano's","",0,"sit down", 3.0)
    };

    public static final Restaurants[] dinnerPlaces = {
            new Restaurants("Panera Bread","",0,"fast food",3.0),
            new Restaurants("Papa John's","",0,"fast food", 2.0),
            new Restaurants("Five Guys","",0,"fast food",3.0),
            new Restaurants("Taco Bell","",0,"fast food", 2.0),
            new Restaurants("Panda Express","",0,"fast food", 3.0),
            new Restaurants("MOD Pizza","",0,"fast food", 4.5),
            new Restaurants("Maggiano's Little Italy","",0,"sit down", 3.5),
            new Restaurants("Moretti's Ristorante and Pizzeria","",0,"sit down", 3.5),
            new Restaurants("Westwood Tavern","",0,"sit down", 4.0),
            new Restaurants("Red Lobster","",0,"sit down", 3.5),
            new Restaurants("Olive Garden","",0,"sit down", 3.0),
            new Restaurants("The Cheesecake Factory","",0,"sit down",3.0)
    };


    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public static Restaurants[] getBreakfastPlaces() {
        return breakfastPlaces;
    }

    public static Restaurants[] getLunchPlaces() {
        return lunchPlaces;
    }

    public static Restaurants[] getDinnerPlaces() {
        return dinnerPlaces;
    }

}
