package com.example.dgarc.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_list);
        //Declares button and sets on click listener
        Button button1 = findViewById(R.id.homebtn);

        button1.setOnClickListener(this);

        // Create a list of Songs and Artists
        ArrayList<Title> titles = new ArrayList<>();
        titles.add(new Title("Song: Sober", "Artist: Tool"));
        titles.add(new Title("Song: Breaking The Habit", "Artist: Linkin Park"));
        titles.add(new Title("Song: Firestone", "Artist: Kygo"));
        titles.add(new Title("Song: Smile", "Artist: Stereo Explosion"));
        titles.add(new Title("Song: Loving Is Easy", "Artist: Rex Orange County"));
        titles.add(new Title("Song: Show Me Your Genitals", "Artist: Jon Lajoie"));
        titles.add(new Title("Song: Strangers In The Wind", "Artist: Cut Copy"));
        titles.add(new Title("Song: Lost In Space", "Artist: Emmit Fenn"));
        titles.add(new Title("Song: Movie", "Artist: Tom Misch"));
        titles.add(new Title("Song: Hurricane", "Artist: Thrice"));

        // Create an ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // default_list.xml layout resource defined in the Android framework.
        // This list item layout contains two TextViews, which the adapter will set to
        // display the info.
        SongAdapter adapter =
                new SongAdapter(this, titles);

        // Find the ListView object in the view hierarchy of the Activity}.
        // There should be a  ListView} with the view ID called list, which is declared in the
        // default_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the ListView} use the ArrayAdapter we created above, so that the
        // ListView will display list items for each field
        // Do this by calling the setAdapter method on the ListView object and pass in
        // the arguments, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
        startActivity(homeIntent);
    }
}