package com.apk2try.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Play extends AppCompatActivity {

    public  MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Global MediaPlayer
        final GlobalClass  musicalContext = (GlobalClass) getApplicationContext();
        musicalContext.setMediaPlayer(Play.this,R.raw.udgaye);

        final MediaPlayer[] mediaPlayer = {musicalContext.getMediaPlayer()};

        //find the Play button
        ImageButton playMusic = (ImageButton)findViewById(R.id.playmusic);

        //find the TextView for playing

        final TextView playStatus = (TextView) findViewById(R.id.playStatus);

        if(mediaPlayer[0].isPlaying()){
            playStatus.setText(getString(R.string.playStatus));
        }

        //Create play intent
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer[0] == null) {
                    //Creating the mediaplayer
                    musicalContext.setMediaPlayer(Play.this,R.raw.udgaye);
                    mediaPlayer[0] = musicalContext.getMediaPlayer();
                }

                mediaPlayer[0].start();
                playStatus.setText(getString(R.string.playStatus));
                Toast.makeText(Play.this,getString(R.string.playStatus),Toast.LENGTH_SHORT).show();

                mediaPlayer[0].setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playStatus.setText(getString(R.string.playStatus));
                        Toast.makeText(Play.this, getString(R.string.playStatus), Toast.LENGTH_SHORT).show();
                    }

                });

            }

        });

    }
}
