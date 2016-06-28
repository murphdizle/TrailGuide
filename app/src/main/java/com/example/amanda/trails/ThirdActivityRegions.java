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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
import java.lang.*;

public class ThirdActivityRegions extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private TextView selectRegionsTextBox;
    private Spinner spinner;
    private List<String> regions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity_regions);

        selectRegionsTextBox = (TextView) findViewById(R.id.regionTextBox);

        spinner = (Spinner) findViewById(R.id.regionSpinner);
        regions = new ArrayList<String>();
        //dbconnection db = new dbconnection();
        String state = getIntent().getSerializableExtra("State").toString();
        //regions = db.getRegions(state);               //commented out for dbconnection problem.
        regions = dbconnection.getRegions(state);

        regions.add(0, "Select region:");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,regions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0,false);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text = (TextView) view;
        if(position != 0) {
            Toast.makeText(this, "You selected " + text.getText(), Toast.LENGTH_SHORT).show();
            //go to the trails window from here....
            Intent i = new Intent(ThirdActivityRegions.this, TrailListActivity.class);
            i.putExtra("Region", text.getText());
            startActivity(i);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //do nothing
    }
}
