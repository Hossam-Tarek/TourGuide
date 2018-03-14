package com.example.hossam.tourguide;

/**
 * Created by hossam on 3/13/18.
 */

public class Place
{
    private int nameResourceID;
    private int descriptionResourceID;
    private int imageResourceID;

    public Place(int nameResourceID, int descriptionResourceID, int imageResourceID) {
        this.nameResourceID = nameResourceID;
        this.descriptionResourceID = descriptionResourceID;
        this.imageResourceID = imageResourceID;
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
}
