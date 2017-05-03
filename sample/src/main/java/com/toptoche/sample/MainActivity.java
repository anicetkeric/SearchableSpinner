package com.toptoche.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spPlanets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spPlanets = (Spinner) findViewById(R.id.spinner_pl);


        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, planets);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spPlanets.setAdapter(adapter);

    }
}
