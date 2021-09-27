package com.example.thingstoseeinaichiprefecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GamagoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamagori);

        ListView gamagoriList = findViewById(R.id.list_view_gamagori);

        Location[] locations = {
                new Location("Takeshima", "Feed the seagulls on the bridge.", 50),
                new Location("Gamagori Fantasy Museum", "Psychodelic place with shells and koi.", 44),
                new Location("Hydrangea village", "I have not been there but they must look beautiful light up in June.", 48),
                new Location("Mt.Kobo", "Pigeons will eat seeds from your hands. Must go!", 47)
        };

        ArrayAdapter<Location> locationsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, locations);
        gamagoriList.setAdapter(locationsAdapter);
    }

}


