package com.example.lifeactivityapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Restaurants {
    private String restaurant;
    private String description;
    private int price;
    private String type;
    private double rating;

    public Restaurants(String restaurant, String description,
                       String type, double rating) { //int imageResourceID) {
        this.restaurant = restaurant;
        this.description = description;
        this.type = type;
        this.rating = rating;
        //this.imageResourceID = imageResourceID;
    }




    public static final Restaurants[] breakfastPlaces = {
            new Restaurants("Einstein Bros. Bagels", "American bagel and coffee chain ", "chain", 2.0),
            new Restaurants("Dunkin Donuts", "American multinational coffee/donut company and quick service restaurant", "chain",2.0),
            new Restaurants("Mcdonalds", "Fast food, limited service restaurant", "chain",2.0),
            new Restaurants("Wildberry Pancakes & Cafe", "Bustling, family-oriented eatery features American breakfasts & lunches in a smart setting", "chain",4.5),
            new Restaurants("Denny's", "American table service diner-style restaurant chain", "chain",2.5),
            new Restaurants("IHOP", "American multinational pancake house restaurant chain that specializes in breakfast foods", "chain",3),
            new Restaurants("Egg Harbor Cafe","High quality, carefully-sourced breakfast and lunch with fast, friendly service in a contemporary farmhouse setting", "chain",4),
            new Restaurants("Walker Bros. Original Pancake House","Serving you the very best, from our famous Apple Pancake to our thick sliced Bacon","chain",4),
            new Restaurants("Anna's Red Apple","Casual American cafe serving classic breakfast fare plus salads, sandwiches & burgers","local",4),
            new Restaurants("Bread and Butter Cafe","Breakfast and Brunch restaurant","local",4),
            new Restaurants("Gus' Diner","Family-friendly spot with a retro 1950s theme serving waffles, burgers & other American classics","local",4),
            new Restaurants("Jelly Cafe","Airy, contemporary cafe serving up breakfast & sandwiches made with local produce","local",4),
            new Restaurants("Southern Belle's","We use only the finest and freshest ingredients to create a meal that will fill your belly and warm your heart","local",4),
            new Restaurants("Honey-Jam Cafe","Discover our passion for delectable dishes and dedicated customer service","local",4),
            new Restaurants("Billy's Pancake House","Old-fashioned eatery since 1971 with pancakes & crêpes in original flavors, plus sandwiches & soups","local", 3.5),
            new Restaurants("Golden Brunch","Casual diner providing breakfast classics, burgers, salads, sandwiches & wraps for dine-in or to-go","local", 4.5)
    };

    public static final Restaurants[] lunchPlaces = {
            new Restaurants("Jimmy John's","American franchised sandwich fast food restaurant chain, specializing in delivery.","chain", 2.5),
            new Restaurants("Vini's Pizza","Vini's Pizza serves up great Italian food including pizzas, pastas, sandwiches, salads, ribs, wings & more","fast food", 3.5),
            new Restaurants("Chipotle","American chain of fast casual restaurants specializing in tacos and Mission-style burritos.","fast food", 2.5),
            new Restaurants("Portillos","American fast casual restaurant chain that specializes in serving Chicago-style food such as hot dogs, Maxwell Street Polish, and Italian Beef.","fast food", 4),
            new Restaurants("Chick-fil-A","The largest quick-service chicken restaurant chain in the United States","fast food", 4),
            new Restaurants("Culver's","A privately owned and operated casual fast food restaurant chain that is mostly known for its \"butterburgers\" and frozen custard.","fast food", 3.5),
            new Restaurants("Wendy's","An American international fast food restaurant chain that sells hamburgers, chicken sandwiches, and Frostys","fast food", 2.0),
            new Restaurants("Heng Wing Restaurant","A locally owned Chinese cuisine restaurant located in Palatine","sit down", 3.5),
            new Restaurants("Tap House Grill","At Tap House restaurant, sports bar and grill you will find great friends, addictive food and creative brews.","sit down", 3.5),
            new Restaurants("Mother Cluckers Kitchen","A local restaurant serving chicken and sandwiches.","sit down", 4.0),
            new Restaurants("Gianni's Cafe","An Italian restaurant serving regional salads, create-your-own pastas & classic entrees in a family-friendly setting.","sit down", 4.0),
            new Restaurants("Brandt's","A local bar and grill restaurant serving hamburgers and beer.","sit down",4.0),
            new Restaurants("On the Border","A restaurant chain serving dishes inspired by famous areas along the border between Texas and Mexico","sit down", 3.0),
            new Restaurants("Panera Bread","A bakery chain that focuses on providing the cleanest and healthiest ingredients in their bakery items, pasta, salads, sandwiches, soups, and specialty drinks.","fast food",3.0),
            new Restaurants("Dario's", "Snug cafe offering custom sandwiches, paninis & homemade soup in a casual setting with a patio.", "sit down", 4.5)
    };

    public static final Restaurants[] dinnerPlaces = {
            new Restaurants("Giordano's","Giordano's has been serving Chicago's famous deep dish pizza since 1974 with more than 50 locations nationwide","sit down", 3.0),
            new Restaurants("Papa John's","Papa Johns is an fourth largest American pizza restaurant franchise.","fast food", 2.0),
            new Restaurants("Five Guys","An American fast casual restaurant chain focused on hamburgers, hot dogs, and French fries.","fast food",3.0),
            new Restaurants("Taco Bell","An American chain of fast food restaurants that serves a variety of Mexican inspired foods that include tacos, burritos, quesadillas, and nachos.","fast food", 2.0),
            new Restaurants("Panda Express","Panda Express is a fast food restaurant chain which serves American Chinese cuisine.","fast food", 3.0),
            new Restaurants("MOD Pizza","MOD is the original superfast pizza experience – a pioneering fast-casual concept that puts you in the driver's seat. Artisan-style pizzas and salads are individually sized, made on demand, and ready in just minutes.","fast food", 4.5),
            new Restaurants("Maggiano's Little Italy","Maggiano's Little Italy is an American casual dining restaurant chain specializing in Italian-American cuisine. ","sit down", 3.5),
            new Restaurants("Moretti's Ristorante and Pizzeria","Voted Reader's Choice \"Best Pizza\" by local Daily Herald Readers, Moretti's pizza is just the most famous part of their large and varied menu.","sit down", 3.5),
            new Restaurants("Westwood Tavern","Modern wood-&-stone watering hole with table taps, American eats, fireplaces & an outside patio.","sit down", 4.0),
            new Restaurants("Red Lobster","A restaurant that specializes in seafood, including crab, fish, lobster, mollusks, and shrimp.","sit down", 3.5),
            new Restaurants("Olive Garden","An American casual dining restaurant chain specializing in Italian-American cuisine.","sit down", 3.0),
            new Restaurants("The Cheesecake Factory","An American restaurant company and distributor of cheesecakes based in the United States.","sit down",3.0),
            new Restaurants("BENKEI Ramen","A traditional Japanese restaurant that serves tonkotsu ramen","sit down",4.5)
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
