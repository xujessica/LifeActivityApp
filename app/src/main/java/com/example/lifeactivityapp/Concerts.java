package com.example.lifeactivityapp;

public class Concerts {
    private String name;
    private String description;
    private String famousSong;

    // Inlcude rating and date released when done with main functionality of project

    public Concerts(String name, String description, String famousSong){

        this.name = name;
        this.description = description;
        this.famousSong = famousSong;
    }

    public static final Concerts[] Rap = {
            new Concerts("Cardi B", "American rapper, songwriter, actress, and television personality",
                    "Famous songs: I like it, Bartier Carter, Finesse"),
            new Concerts("A Boogie Wit Da Hoodie","American rapper, singer, and songwriter",
                    "Famous songs: Look Back at It, Drowning, Swervin"),
            new Concerts("Chance the Rapper","American rapper, singer, songwriter, actor and activist",
                    "Famous songs: No Problem, Cocoa Butter Kisses, Blessings"),
            new Concerts("Logic","American rapper, singer, songwriter, record producer and author",
                    "Famous songs: Under Pressure, Gang Related, 1-800-273-8255\n"),
            new Concerts("Snoop dog","American rapper, singer, songwriter, producer, media personality, entrepreneur, and actor",
                    "Famous songs: Drop It Like It's Hot, Gin and Juice, Who am I"),
            new Concerts("Post Malone","American rapper, singer, songwriter, and record producer",
                    "Famous songs: Congratulations, Rockstar, Better Now"),
            new Concerts("Lizzo","American singer, rapper and songwriter",
                    "Famous songs: Truth Hurts, Juice, Good as Hell"),
            new Concerts("Louis the Child","Chicago-based DJ and production duo",
                    "Famous songs: Better Not, The City, Dear Sense"),
    };

    public static final Concerts[] Pop = {
            new Concerts("Alessia Cara", "Canadian singer, songwriter and instrumentalist",
                    "Famous songs: Scars To Your Beautiful, Here, Stay"),
            new Concerts("Ariana Grande","American singer, songwriter, and actress",
                    "Famous songs: Problem, No Tears Left To Cry, Break Free"),
            new Concerts("Jonas Brothers","American pop rock band",
                    "Famous songs: Year 3000, Sucker, Burnin' Up"),
            new Concerts("Taylor Swift","American singer-songwriter",
                    "Famous songs: Bad Blood, You Belong With Me, Shake It Off"),
            new Concerts("Maroon 5","American pop rock band from Los Angeles",
                    "Famous songs: Moves Like Jagger, Payphone, This Love"),
            new Concerts("Billie Ellish","American singer-songwriter",
                    "Famous songs: Ocean Eyes, Bad Guy, When the Party's Over"),
            new Concerts("Backstreet Boys", "American vocal group",
                    "Famous songs: Everybody, As Long As You Love Me, I Want It That Way"),
            new Concerts("Lady Gaga","American singer, songwriter and actress",
                    "Famous songs: Poker Face, Bad Romance, Born This Way"),
    };

    public static final Concerts[] Country = {
            new Concerts("Florida Georgia Line","American country music duo",
                    "Famous songs: Cruise, This is How We Roll, Meant to Be"),
            new Concerts("Carrie Underwood","American singer, songwriter, fashion designer, and actress",
                    "Famous songs: Before He Cheats, All-American Girl, Jesus Take the Wheel"),
            new Concerts("Old Dominion","American five-member country music band",
                    "Famous songs: Break Up With Him, No Such Thing as a Broken Heart, Written in The Sand"),
            new Concerts("Kane Brown","American singer and songwriter",
                    "Famous songs: What ifs, Heaven, Good As You"),
            new Concerts("Luke Combs","American country music singer and songwriter",
                    "Famous songs: She Got the Best of Me, Beer Never Broke My Heart, One Number Away"),
            new Concerts("Thomas Rhett","American country music singer and songwriter",
                    "Famous songs: Die a Happy Man, Star of the Show, Craving You"),
            new Concerts("Luke Bryan","American country music singer and songwriter",
                    "Famous songs: Country Girl, Kick the Dust Up, That's My Kind of Night"),
            new Concerts("Zac Brown Band","American country/rock band",
                    "Famous songs: Chicken Fried, Knee Deep, Homegrown"),
    };

    public static Concerts[] getRap() { return Rap; }
    public static Concerts[] getPop() {
        return Pop;
    }
    public static Concerts[] getCountry() {
        return Country;
    }


    public String toString(){return name;}
}
