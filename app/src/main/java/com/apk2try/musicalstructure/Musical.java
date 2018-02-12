package com.apk2try.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class Musical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical);

        //Global MediaPlayer
        final GlobalClass  musicalContext = (GlobalClass) getApplicationContext();

        // Find the View that shows the Play window
        ImageButton playWindow = (ImageButton) findViewById(R.id.play);

        // Set a click listener on that View
        playWindow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the PlayWindow category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Play Activity}
                Intent playIntent = new Intent(Musical.this, Play.class);

                // Start the new activity
                startActivity(playIntent);
            }
        });

        // Find the View that shows the Pause window
        ImageButton pauseWindow = (ImageButton) findViewById(R.id.pause);

        // Set a click listener on that View
        pauseWindow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the PauseWindow category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Pause Activity}
                Intent pauseIntent = new Intent(Musical.this, Pause.class);

                // Start the new activity
                startActivity(pauseIntent);
            }
        });

        // Find the View that shows the Album window
        ImageButton albumWindow = (ImageButton) findViewById(R.id.album);

        // Set a click listener on that View
        albumWindow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Albums Activity}
                Intent albumIntent = new Intent(Musical.this, Album.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the Stop window
        ImageButton listWindow = (ImageButton) findViewById(R.id.stop);

        // Set a click listener on that View
        listWindow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Stop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Stop Activity}
                Intent stopIntent = new Intent(Musical.this, Stop.class);

                // Start the new activity
                startActivity(stopIntent);
            }
        });

    }
}
