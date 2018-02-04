package com.apk2try.musicalstructure;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

public class Musical extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical);

        //Set the onClickListner when Play is clicked
        ImageButton playMusic = (ImageButton) findViewById(R.id.play);

        //Set the Status
        final TextView status =(TextView)findViewById(R.id.status);

        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer == null) {
                    //Creating the mediaplayer
                    mediaPlayer = MediaPlayer.create(Musical.this,R.raw.udgaye);
                }

                mediaPlayer.start();
                status.setText(getString(R.string.playStatus));
                Toast.makeText(Musical.this,getString(R.string.playStatus),Toast.LENGTH_SHORT).show();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        status.setText(getString(R.string.endStatus));
                        Toast.makeText(Musical.this,getString(R.string.endStatus),Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });

        //Set the onClickListner when Pause is clicked
        ImageButton pauseMusic = (ImageButton)findViewById(R.id.pause);

        pauseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                status.setText(getString(R.string.pauseStatus));
                Toast.makeText(Musical.this,getString(R.string.pauseStatus),Toast.LENGTH_SHORT).show();
            }
        });

        //Set the onClickListner when Stop is clicked
        ImageButton stopMusic = (ImageButton)findViewById(R.id.stop);

        stopMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                status.setText(getString(R.string.stopStatus));
                Toast.makeText(Musical.this,getString(R.string.stopStatus),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
