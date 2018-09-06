package com.example.dgarc.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PodCastsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_list);

        Button button1 = findViewById(R.id.homebtn);

        button1.setOnClickListener(this);

        // Create a list of Podcasts and Publishers
        ArrayList<Title> titles = new ArrayList<>();
        titles.add(new Title("Title: Pod Save America", "Publisher: Crooked Media"));
        titles.add(new Title("Title: Left, Right & Center", "Publisher: KCRW"));
        titles.add(new Title("Title: Fragemented", "Publisher: Spec"));
        titles.add(new Title("Title: NPR News", "Publisher: NPR"));
        titles.add(new Title("Title: Bookworm", "Publisher: Scholastic"));
        titles.add(new Title("Title: Here Be Monsters", "Publisher: L.A."));
        titles.add(new Title("Title: Celestial Blood", "Publisher: KCRW"));
        titles.add(new Title("Title: Bodies In Motion", "Publisher: Fenn"));
        titles.add(new Title("Title: Unfictional", "Publisher: Tom "));
        titles.add(new Title("Title: Blood Orange", "Publisher: Growers"));

        // Create an ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple default_list.xml layout resource defined in the Android framework.
        // This list item layout contains a single two TextViews, which the adapter will set to
        // display the info
        SongAdapter adapter =
                new SongAdapter(this, titles);

        // Find the ListView object in the view hierarchy of the Activity}.
        // There should be a ListView with the view ID called list, which is declared in the
        // populated_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the ListView} use the ArrayAdapter} we created above, so that the
        // ListView} will display list items for each song.
        // Do this by calling the setAdapter method on the ListView} object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name Adapter.
        listView.setAdapter(adapter);
    }

    // The code in this method will be executed when the home button is clicked on
    @Override
    public void onClick(View v) {
        Intent homeIntent = new Intent(PodCastsActivity.this, MainActivity.class);
        startActivity(homeIntent);
    }

}