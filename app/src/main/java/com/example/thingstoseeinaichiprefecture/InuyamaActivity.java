package com.example.thingstoseeinaichiprefecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class InuyamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inuyama1);

        ListView inuyamaList = findViewById(R.id.list_view_inuyama);

        Location[] locations = {
                new Location("Inuyama castle", "One of the most beautiful castles in all of Japna.", 49),
                new Location("Meiji mura", "A must go for people who want to experience Meiji lifestyle in Japan.", 45),
                new Location("Inuyama jokamachi", "The most Instagramable place in all of Inuyama.", 47)
        };
        ArrayAdapter<Location> locationArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, locations);
        inuyamaList.setAdapter(locationArrayAdapter);

    }
}