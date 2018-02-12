package com.apk2try.musicalstructure;

import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by AKUMAR63 on 2/4/2018.
 */

public class GlobalClass extends Application {

    private MediaPlayer mediaPlayer;


    public MediaPlayer getMediaPlayer(){
        return mediaPlayer;
    }

    public void  setMediaPlayer(Context context, int resid){
        mediaPlayer = MediaPlayer.create(context,resid);
    }
}
