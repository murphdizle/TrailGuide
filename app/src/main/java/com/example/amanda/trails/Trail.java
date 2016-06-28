// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Comparator;
/**
 * Created by Randy on 6/28/2016.
 */
public class Trail implements Parcelable {

    private String name;
    private String description;
    private Double distance;
    private String difficulty;
    private int elevation;
    private double latitude;
    private double longitude;
    private Boolean done;

    public Trail() {
        this(null, null, 0.0, null, 0, false, 0.0, 0.0);
    }

    public Trail(String name, String description, Double distance, String difficulty, int elevation, Boolean done, double lat, double longitude) {
        this.name = name;
        this.description = description;
        this.distance = distance;
        this.difficulty = difficulty;
        this.elevation = elevation;
        this.done = done;
        this.latitude = lat;
        this.longitude = longitude;
    }

    protected Trail(Parcel in) {
        name = in.readString();
        description = in.readString();
        difficulty = in.readString();
        elevation = in.readInt();
        distance = in.readDouble();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Trail> CREATOR = new Creator<Trail>() {
        @Override
        public Trail createFromParcel(Parcel in) {
            return new Trail(in);
        }

        @Override
        public Trail[] newArray(int size) {
            return new Trail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(difficulty);
        dest.writeInt(elevation);
        dest.writeDouble(distance);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double lat){
        this.latitude = lat;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    //Java code idea for Comparator overwriting from the Beginners Book website:
    // http://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
    public static Comparator<Trail> TrailNameComparatorAscending = new Comparator<Trail>(){
        public int compare(Trail trail1, Trail trail2) {
            String TrailName1 = trail1.getName().toUpperCase();
            String TrailName2 = trail2.getName().toUpperCase();

            //ascending order
            return TrailName1.compareTo(TrailName2);
        }
    };

    public static Comparator<Trail> TrailNameComparatorDescending = new Comparator<Trail>(){
        public int compare(Trail trail1, Trail trail2) {
            String TrailName1 = trail1.getName().toUpperCase();
            String TrailName2 = trail2.getName().toUpperCase();

            //descending order
            return TrailName2.compareTo(TrailName1);
        }
    };

    public static Comparator<Trail> TrailDistanceAscending = new Comparator<Trail>() {

        public int compare(Trail trail1, Trail trail2) {

            double trailDistance1 = trail1.getDistance();
            double trailDistance2 = trail2.getDistance();

	   /*For ascending order*/
            return (int)(trailDistance1-trailDistance2);
        }};

    public static Comparator<Trail> TrailDistanceDescending = new Comparator<Trail>() {

        public int compare(Trail trail1, Trail trail2) {

            double trailDistance1 = trail1.getDistance();
            double trailDistance2 = trail2.getDistance();

	   /*For descending order*/
            return (int)(trailDistance2-trailDistance1);
        }};

    public static Comparator<Trail> TrailElevationAscending = new Comparator<Trail>() {

        public int compare(Trail trail1, Trail trail2) {

            int trailElev1 = trail1.getElevation();
            int trailElev2 = trail2.getElevation();

	   /*For ascending order*/
            return trailElev1-trailElev2;
        }};

    public static Comparator<Trail> TrailElevationDescending = new Comparator<Trail>() {

        public int compare(Trail trail1, Trail trail2) {

            int trailElev1 = trail1.getElevation();
            int trailElev2 = trail2.getElevation();

	   /*For descending order*/
            return trailElev2-trailElev1;
        }};

    public void print(){
        System.out.println("name = " + name);
        System.out.println("description = " + description);
        System.out.println("difficulty = " + difficulty);
        System.out.println("distance = " + distance);
        System.out.println("elevation = " + elevation);
        System.out.println("completed = " + done + '\n');
    }


}

