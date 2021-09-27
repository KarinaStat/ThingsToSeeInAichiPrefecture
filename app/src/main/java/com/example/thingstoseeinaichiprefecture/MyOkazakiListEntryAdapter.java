package com.example.thingstoseeinaichiprefecture;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOkazakiListEntryAdapter extends RecyclerView.Adapter<MyOkazakiListEntryAdapter.OkazakiListEntryViewHolder> {

    private OkazakiListEntry[] entries;

    public MyOkazakiListEntryAdapter(OkazakiListEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public OkazakiListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location_entry, parent, false);
        return new OkazakiListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOkazakiListEntryAdapter.OkazakiListEntryViewHolder holder, int position) {
        holder.bind(entries[position]);
    }

    static class OkazakiListEntryViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView headerText;
        private TextView descriptionText;
        private RatingBar ratingBar;

        public OkazakiListEntryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view_item_picture);
            headerText = itemView.findViewById(R.id.text_view_heading);
            descriptionText = itemView.findViewById(R.id.text_view_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);

        }

        public void bind(OkazakiListEntry entry) {
            image.setImageResource(entry.image);
            headerText.setText(entry.heading);
            descriptionText.setText(entry.description);
            ratingBar.setRating(entry.rating);

        }

    }

}
