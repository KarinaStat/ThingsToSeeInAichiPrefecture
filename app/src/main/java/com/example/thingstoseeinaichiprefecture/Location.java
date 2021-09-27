package com.example.thingstoseeinaichiprefecture;

import androidx.annotation.NonNull;

public class Location {

    String title;
    String description;
    int rating;

    Location(String title, String description, int rating){
        this.title = title;
        this.description = description;
        this.rating = rating;

    }
    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
