package com.example.hossam.tourguide;

/**
 * Created by hossam on 3/14/18.
 */

public class Location
{
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
