package com.example.dgarc.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the Songs category
        TextView songs = (TextView) findViewById(R.id.Songs);
        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });
        // Find the View that shows the Podcasts category
        TextView podcasts = (TextView) findViewById(R.id.Podcasts);
        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PodcastActivity
                Intent podcastsIntent = new Intent(MainActivity.this, PodCastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });
    }
}
