package com.example.thingstoseeinaichiprefecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TokonameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoname);

        ListView tokonameList = findViewById(R.id.list_view_tokoname);

        Location[] locations = {
                new Location("Tokoname City Pottery Footpath", "An amazing walk through streets lined with ceramics.", 45),
                new Location("Tokonyan", "Who doesn't want to see a giant Manekineko face?", 43),
                new Location("Climbing Kiln", "A wierd looking kiln that is shaped as if it was climbing up the hill.", 40),
                new Location ("Tokoname Manekineko Street", "A street with many different manekinekos.", 48)
        };

        ArrayAdapter<Location> locationArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, locations);
        tokonameList.setAdapter(locationArrayAdapter);
    }
}