package com.example.lifeactivityapp;

public class Activities {
    private String name;
    public String desciption;
    public String location;

    // Inlcude rating and date released when done with main functionality of project

    public Activities(String name, String location){
        this.name = name;
        this.location = location;
    }

    public static final Activities[] Spring = {
            new Activities("Go shopping at the mall", "outdoors"),
            new Activities("Go to an art festival", "outdoors"),
            new Activities("Have a picnic", "outdoors"),
            new Activities("Plant flowers", "outdoors"),
            new Activities("Ride your bike", "outdoors"),
            new Activities("Visit a flea market", "outdoors"),
            new Activities("Read a book", "indoors")
    };

    public static final Activities[] Summer = {
            new Activities("Get ice cream", "outdoors"),
            new Activities("Mini golf", "outdoors"),
            new Activities("Go camping", "outdoors"),
            new Activities("See a drive-in movie", "outdoors"),
            new Activities("Visit a carnival", "outdoors"),
            new Activities("Go to a theme park", "outdoors"),
            new Activities("Go to the beach", "outdoors"),
            new Activities("Go tubing", "outdoors")
    };

    public static final Activities[] Fall = {
            new Activities("Have a bonfire", "outdoors"),
            new Activities("Visit a haunted house", "indoors"),
            new Activities("Pick apples", "outdoors"),
            new Activities("Carve pumpkins", "outdoors"),
            new Activities("Bake a pie", "indoors"),
            new Activities("Watch a scary movie", "indoors"),
            new Activities("Visit a corn maze", "outdoors"),
            new Activities("Make candy apples", "indoors")
    };

    public static final Activities[] Winter = {
            new Activities("Build a snowman", "outdoors"),
            new Activities("Drink hot coco", "indoors"),
            new Activities("Go skiing/snowboarding", "outdoors"),
            new Activities("Go ice skating", "outdoors"),
            new Activities("Watch a Christmas movie", "indoors"),
            new Activities("See zoo lights", "outdoors"),
            new Activities("Make gingerbread lights", "indoors"),
            new Activities("Go to a museum", "indoors")
    };

    public String getName() {
        return name;
    }

    public static Activities[] getSpring() {
        return Spring;
    }
    public static Activities[] getSummer() {
        return Summer;
    }
    public static Activities[] getFall() {
        return Fall;
    }
    public static Activities[] getWinter() {
        return Winter;
    }

    public String getLocation() {return location;}
    public String getIDK() {return "idk";}


    public String toString(){ return name;}
}
