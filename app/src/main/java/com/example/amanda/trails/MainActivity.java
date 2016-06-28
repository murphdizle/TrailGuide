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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private TextView stateTextBox;
    private Spinner spinner;
    private List<String> states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stateTextBox = (TextView) findViewById(R.id.stateListTextBox);

        //This section is the list dropdown box. It uses the spinner to change the List into the dropdown menu.
        //It gets the List from the dB and adds it to the ui dropdown menu.
        spinner = (Spinner) findViewById(R.id.spinnerStateList);
        states = new ArrayList<String>();
        dbconnection db = new dbconnection();
        states = db.getStates();

        //states.add("Oregon");           //I added these since the states weren't returning from the database.
        //states.add("Washington");

        states.add(0, "Select state:");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,states);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0, false);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text = (TextView) view;
        if(position != 0) {
            Toast.makeText(this, "You selected " + text.getText(), Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, ThirdActivityRegions.class);
            i.putExtra("State", text.getText());
            //go to the cities window from here....
            startActivity(new Intent(i));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Auto Generated method
    }
}
