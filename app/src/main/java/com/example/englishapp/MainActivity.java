package com.example.englishapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class  MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.abc);
        mp.start();

        Button btnQuit = (Button) findViewById(R.id.btnQuit);
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }

    public void clickToGo2(View view) {
        Intent intent = new Intent(this, QuizMainActivity.class);
        startActivity(intent);
    }

    public void clickToQuiz(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }


    public void clickToPlay(View view) {
        Intent i = new Intent(MainActivity.this,LearningActivity.class);
        startActivity(i);
    }




}
