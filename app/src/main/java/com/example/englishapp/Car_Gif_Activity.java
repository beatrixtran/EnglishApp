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

public class Car_Gif_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_car__gif_);
        goToAirplane();
        clickToPlayAudio();
    }

    private void goToAirplane(){
        ImageButton goToAirplaneButton = (ImageButton)findViewById(R.id.nextToAirplane);
        goToAirplaneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Car_Gif_Activity.this, AirplaneActivity.class));
            }
        });
    }
    private void clickToPlayAudio(){
        ImageButton playAudioImageButton = (ImageButton)findViewById(R.id.Voice);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.car);
        playAudioImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }
}
