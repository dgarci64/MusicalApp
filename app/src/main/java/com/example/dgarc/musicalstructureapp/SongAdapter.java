package com.example.dgarc.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Title> {
    public SongAdapter(Activity context, ArrayList<Title> titles) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, titles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.populated_list, parent, false);
        }
        // Get the object located at this position in the list
        Title currentword = getItem(position);

        // Find the TextView in the default_list.xml layout
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the version name from the current object and
        // set this text on the song TextView
        songTextView.setText(currentword.getSongTitle());

        // Find the TextView in the default_list.xml layout
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the version number from the current object and
        // set this text on the artist TextView
        artistTextView.setText(currentword.getArtist());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


