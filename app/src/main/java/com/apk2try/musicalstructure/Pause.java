package com.apk2try.musicalstructure;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Pause extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause);

        //Global MediaPlayer
        final GlobalClass  musicalContext = (GlobalClass) getApplicationContext();

        final MediaPlayer[] mediaPlayer = {musicalContext.getMediaPlayer()};

        //Pause button and Status of mediaPlayer
        ImageButton pauseMusic = (ImageButton)findViewById(R.id.pauseMusic);
        final TextView pauseStatus = (TextView)findViewById(R.id.pauseStatus);

        //onclicklistener for pause Music

        pauseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer[0].isPlaying()){
                    mediaPlayer[0].pause();
                    pauseStatus.setText(getString(R.string.pauseStatus));
                    Toast.makeText(Pause.this,getString(R.string.pauseStatus),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
