package com.example;

import java.util.List;

public class PostLocation {
    public String city;
    public String country;
    public double latitude;
    public double longitude;
    public Object place_id;
    public String locationName;
    public String type;
    public List<Double> coordinates;


    public PostLocation(String city, String country, double latitude, double longitude, Object place_id, String locationName, String type, List<Double> coordinates) {
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.place_id = place_id;
        this.locationName = locationName;
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Object getPlace_id() {
        return place_id;
    }

    public void setPlace_id(Object place_id) {
        this.place_id = place_id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
