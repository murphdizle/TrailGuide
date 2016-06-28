// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TrailActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private Trail chosenTrail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail);

        chosenTrail = (Trail) getIntent().getParcelableExtra("trailData");

        TextView trailName = (TextView) findViewById(R.id.TBTrailNameTag);
        TextView trailDifficulty = (TextView) findViewById(R.id.TBDifficultyTag);
        TextView trailDistance = (TextView) findViewById(R.id.TBDistanceTag);
        TextView trailElevation = (TextView) findViewById(R.id.TBElevationTag);
        TextView trailDescription = (TextView) findViewById(R.id.TBDescriptionTag);

        TextView nameOfTrail = (TextView) findViewById(R.id.TBNameOfTrail);
        TextView difficultyOfTrail = (TextView) findViewById(R.id.TBDifficultyOfTrail);
        TextView distanceOfTrail = (TextView) findViewById(R.id.TBDistanceOfTrail);
        TextView elevationOfTrail = (TextView) findViewById(R.id.TBElevationOfTrail);
        TextView descriptionOfTrail = (TextView) findViewById(R.id.TBDescriptionOfTrail);

        if(chosenTrail.getName() != null){
            nameOfTrail.setText(chosenTrail.getName());

        }

        if (chosenTrail.getDifficulty() != null) {
            difficultyOfTrail.setText(chosenTrail.getDifficulty());
        }

        if(chosenTrail.getDescription() != null){
            descriptionOfTrail.setText(chosenTrail.getDescription());
        }

        distanceOfTrail.setText(chosenTrail.getDistance().toString());
        elevationOfTrail.setText("" + chosenTrail.getElevation());

        //String trailName = getIntent().getSerializableExtra("trail").toString();
        //Trail trail;
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trail.getName());
    }
    public void onMapClick(View view){
        if(view.getId() == R.id.map_butt)
        {
            Intent i = new Intent(TrailActivity.this, MapsActivity.class);
            i.putExtra("trail", chosenTrail);
            startActivity(new Intent(i));
        }
    }
}
