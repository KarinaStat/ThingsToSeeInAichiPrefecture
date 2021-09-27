package com.example.thingstoseeinaichiprefecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OkazakiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okazaki2);
        setupList();
    }

    private void setupList() {
        OkazakiListEntry[] okazakiLocations = {
                new OkazakiListEntry("Okazaki castle", "Beautiful castle that Tokugawa Ieyasu was born in.", R.drawable.okazaki_castle, 4.8f),
                new OkazakiListEntry("Iga Hachimangu shrine", "Lotuses are beautiful in July.", R.drawable.iga_hachimangu, 4.6f),
                new OkazakiListEntry("Higashi park", "There are many irises in May.", R.drawable.higashi_park, 4.2f),
                new OkazakiListEntry("Aeon Mall Okazaki", "Largest mall in town.", R.drawable.aeon_mall, 3.5f),
                new OkazakiListEntry("Okazaki Minami Park", "A great place for Pokemon Go fans.", R.drawable.minami_park, 3.8f)
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_okazaki);
        MyOkazakiListEntryAdapter adapter = new MyOkazakiListEntryAdapter(okazakiLocations);
        recyclerView.setAdapter(adapter);
    }
}