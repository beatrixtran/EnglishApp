package com.example.englishapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class PigActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pig);

        goToHippoGif();
        clickToPlayAudio();
    }

    private void goToHippoGif(){
        ImageButton goToFishGifButton = (ImageButton)findViewById(R.id.nextToFishGif);
        goToFishGifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PigActivity.this, Pig_Gif_Activity.class));
            }
        });
    }

    private void clickToPlayAudio(){
        ImageButton playAudioImageButton = (ImageButton)findViewById(R.id.Voice);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.pig);
        playAudioImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }
}
