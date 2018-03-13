package com.example.hossam.tourguide;

/**
 * Created by hossam on 3/13/18.
 */

public class Place
{
    private String name;
    private String address;
    private String description;
    private int imageResourceID;

    public Place(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
