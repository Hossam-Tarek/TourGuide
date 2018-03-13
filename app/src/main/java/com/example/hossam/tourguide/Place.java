package com.example.hossam.tourguide;

/**
 * Created by hossam on 3/13/18.
 */

public class Place
{
    private String name;
    private String description;
    private int imageResourceID;

    public Place(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
