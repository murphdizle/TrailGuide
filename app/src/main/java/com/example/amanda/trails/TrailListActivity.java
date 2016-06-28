// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TrailListActivity extends AppCompatActivity {
    private ListView LV_Trails;
    private TextView sortBy;
    private TextView sortByName;
    private TextView sortByDistance;
    private TextView sortByElevation;
    private ArrayList<String> names;
    private ArrayAdapter<String> adapter;
    private TrailList trails;
    private Trail aTrail;
    private dbconnection db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail_list);

        sortBy = (TextView) findViewById(R.id.TVSortBy);
        sortByName = (TextView) findViewById(R.id.TVNameSort);
        sortByDistance = (TextView) findViewById(R.id.TVDistanceSort);
        sortByElevation = (TextView) findViewById(R.id.TVElevationSort);
        LV_Trails = (ListView) findViewById(R.id.ListView_Trails);

        //db = new dbconnection();
        trails = dbconnection.getTrailsByRegion(getIntent().getSerializableExtra("Region").toString());
        trails.sortByNameAscending();
        names = trails.listOfTrailNames();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        LV_Trails.setAdapter(adapter);

        sortByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(names.get(0).compareToIgnoreCase(names.get(names.size()-1)) < 0){
                    trails.sortByNameDescending();
                    names = trails.listOfTrailNames();
                    adapter.clear();
                    adapter.addAll(names);
                    LV_Trails.setAdapter(adapter);
                }
                else{
                    trails.sortByNameAscending();
                    names = trails.listOfTrailNames();
                    adapter.clear();
                    adapter.addAll(names);
                    LV_Trails.setAdapter(adapter);

                }
            }
        });
        sortByElevation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                trails.sortByElevation();
                names = trails.listOfTrailNames();
                adapter.clear();
                adapter.addAll(names);
                LV_Trails.setAdapter(adapter);
            }
        });
        sortByDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trails.sortByDistance();
                names = trails.listOfTrailNames();
                adapter.clear();
                adapter.addAll(names);
                LV_Trails.setAdapter(adapter);
            }
        });
        LV_Trails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                int itemPosition = position;
                final String value = (String) LV_Trails.getItemAtPosition(itemPosition);
                Toast.makeText(TrailListActivity.this, "" + value, Toast.LENGTH_SHORT).show();

                aTrail = trails.searchTrailReturnTrail(value);
                Intent i = new Intent(TrailListActivity.this, TrailActivity.class);
                i.putExtra("trailData", aTrail);

                //go to the trail information window from here....
                startActivity(new Intent(i));
            }
        });
    }
}
