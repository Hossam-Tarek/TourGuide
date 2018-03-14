package com.example.hossam.tourguide;

/**
 * Created by hossam on 3/13/18.
 */

public class Place
{
    private int nameResourceID;
    private int descriptionResourceID;
    private int imageResourceID;
    private Location location;

    public Place(int nameResourceID, int descriptionResourceID, int imageResourceID, Location location) {
        this.nameResourceID = nameResourceID;
        this.descriptionResourceID = descriptionResourceID;
        this.imageResourceID = imageResourceID;
        this.location = location;
    }

    public int getNameResourceID() {
        return nameResourceID;
    }

    public int getDescriptionResourceID() {
        return descriptionResourceID;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public Location getLocation() {
        return location;
    }
}
