package com.endpoint.gably.models;

import java.io.Serializable;
import java.util.List;

public class NearbyModel implements Serializable {

    private String id;
    private String place_id;
    private String name;
    private Geometry geometry;
    private String icon;
    private float rating;
    private String vicinity;
    private Opening_Hours opening_hours;
    private List<PhotosModel> photos;




    public Geometry getGeometry() {
        return geometry;
    }


    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public Opening_Hours getOpening_hours() {
        return opening_hours;
    }

    public String getVicinity() {
        return vicinity;
    }

    public String getId() {
        return id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public List<PhotosModel> getPhotos() {
        return photos;
    }

    public class Geometry implements Serializable
    {
        private Location location;

        public Location getLocation() {
            return location;
        }
    }

    public class Location implements Serializable {

        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public double getLng() {
            return lng;
        }
    }


    public class Opening_Hours implements Serializable
    {
        private boolean open_now;

        public boolean isOpen_now() {
            return open_now;
        }
    }


}