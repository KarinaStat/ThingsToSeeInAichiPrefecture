package com.example.thingstoseeinaichiprefecture;

import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;

public class OkazakiListEntry {

    String heading;
    String description;
    int image;
    float rating;

    public OkazakiListEntry(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
