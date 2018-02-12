package com.apk2try.musicalstructure;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Stop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        //Global MediaPlayer
        final GlobalClass  musicalContext = (GlobalClass) getApplicationContext();

        final MediaPlayer[] mediaPlayer = {musicalContext.getMediaPlayer()};

        //Pause button and Status of mediaPlayer
        ImageButton pauseMusic = (ImageButton)findViewById(R.id.stopMusic);
        final TextView pauseStatus = (TextView)findViewById(R.id.stopStatus);

        //onclicklistener for stop Music

        pauseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer[0].isPlaying()){
                    mediaPlayer[0].stop();
                        mediaPlayer[0].release();
                        mediaPlayer[0] = null;
                    pauseStatus.setText(getString(R.string.stopStatus));
                    Toast.makeText(Stop.this,getString(R.string.stopStatus),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
