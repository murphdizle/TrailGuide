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

public class SecondActivityCities extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private TextView selectCityTextBox;
    private Spinner spinner;
    private List<String> cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity_cities);

        selectCityTextBox = (TextView) findViewById(R.id.selectCityTextBoxId);

        //Same idea as the MainActivity class. Just doing it with states.
        spinner = (Spinner) findViewById(R.id.spinnerCityList);
        cities = new ArrayList<String>();
        //dbconnection db = new dbconnection();
        //cities = db.getCities();

        cities.add("Portland");           //I added these since the cities weren't returning from the database.
        cities.add("Clackamas");

        cities.add(0, "Select city:");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0,false);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text = (TextView) view;
        Toast.makeText(this, "You selected " + text.getText(), Toast.LENGTH_SHORT).show();
        //go to the regions window from here....
        startActivity(new Intent(SecondActivityCities.this, ThirdActivityRegions.class));

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Auto Generated Method
    }
}
