// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.widget.ArrayAdapter;

import java.util.*;
import java.util.Collections;
/**
 * Created by Randy on 6/28/2016.
 */
public class TrailList {
    private List<Trail> aTrails;

    TrailList(){
        aTrails = new ArrayList<Trail>();
    }

    public void addTrail(Trail aTrail){
        this.aTrails.add(aTrail);
    }

    public Boolean removeTrail(String name){
        Boolean found = false;
        int max = aTrails.size();
        for(int index = 0; index < max; index++){
            if(aTrails.get(index).getName().equals(name)){
                aTrails.remove(index);
                found = true;
                break;
            }
        }
        return found;
    }

    public int getSize(){
        return aTrails.size();
    }

    public Boolean searchTrail(String name){
        Boolean found = false;
        for(Trail a: aTrails){
            if(a.getName().equals(name)){
                found = true;
            }
        }
        return found;
    }

    public Trail searchTrailReturnTrail(String name){
        for(Trail a: aTrails){
            if(a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }

    public ArrayList<String> listOfTrailNames()
    {
        ArrayList<String> names = new ArrayList<>();
        for(Trail a: aTrails)
        {
            names.add(a.getName());
        }
        return names;
    }

    public void sortByNameAscending(){
        Collections.sort(aTrails, Trail.TrailNameComparatorAscending);
    }

    public void sortByNameDescending(){
        Collections.sort(aTrails, Trail.TrailNameComparatorDescending);
    }

    public void sortByDistance()
    {
        if(aTrails.get(0).getDistance() > aTrails.get(aTrails.size()-1).getDistance() )
        {
            this.sortByDistanceAscending();
        }
        else
            this.sortByDistanceDescending();
    }
    public void sortByElevation()
    {
        if(aTrails.get(0).getElevation() > aTrails.get(aTrails.size()-1).getElevation())
            this.sortByElevationAscending();
        else
            this.sortByElevationDescending();
    }
    public void sortByDistanceAscending(){
        Collections.sort(aTrails, Trail.TrailDistanceAscending);
    }

    public void sortByDistanceDescending(){
        Collections.sort(aTrails, Trail.TrailDistanceDescending);
    }

    public void sortByElevationAscending(){
        Collections.sort(aTrails, Trail.TrailElevationAscending);
    }

    public void sortByElevationDescending(){
        Collections.sort(aTrails, Trail.TrailElevationDescending);
    }

    public void difficulty(){

    }
    public void print(){
        for(Trail a: aTrails){
            a.print();
        }
    }
    /*
    public static void main(String[] args){
     //   Trail aTrail = new Trail("falls", "cool walk", 5.0 ,"easy", 30, false);
     //   Trail aTrail1 = new Trail("rivers", "cool rivers", 10.0 ,"medium", 50, false);
     //   Trail aTrail2 = new Trail("lakes", "cool lakes", 15.0 ,"hard", 100, false);

        TrailList trails = new TrailList();
        trails.addTrail(aTrail);
        trails.addTrail(aTrail1);
        trails.addTrail(aTrail2);

        trails.print();

        if(trails.searchTrail("lakes")){
            System.out.println("'lakes' found!");
        }
        else
            System.out.println("'lakes' not found.");

        System.out.println("Sorted by name!");
        trails.sortByNameAscending();
        trails.print();

        System.out.println("Sorted by name reverse!");
        trails.sortByNameDescending();
        trails.print();

        System.out.println("Sorted by distance!");
        trails.sortByDistanceAscending();
        trails.print();

        System.out.println("Sorted by distance reverse!");
        trails.sortByDistanceDescending();
        trails.print();

        System.out.println("Sorted by elevation!");
        trails.sortByElevationAscending();
        trails.print();

        System.out.println("Sorted by elevation reverse!");
        trails.sortByElevationDescending();
        trails.print();

        System.out.println("Remove 'lakes'!");
        trails.removeTrail("lakes");
        trails.print();

/*
        if(trails.searchTrail("lakes")){
            System.out.println("'lakes' found!");
        }
        else
            System.out.println("'lakes' not found.");

        dbconnection db = new dbconnection();
        Trail trail = db.getTrail("a");
        System.out.println(trail.getName());
        TrailList alist = db.getTrailsByCity("Columbia River Gorge");
        db.getStates();
        db.getRegions();
        db.getCities();
        alist.print();
    }
*/
}
