package com.example.englishapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class LearningActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_learning);

        goToCat();
        goToCar();
        goHome();
    }



    private void goToCat(){
        ImageButton goToCatButton = (ImageButton)findViewById(R.id.animalButton);
        goToCatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearningActivity.this, CatActivity.class));
            }
        });
    }

    private void goToCar(){
        ImageButton goToCarButton = (ImageButton)findViewById(R.id.tranportsButton);
        goToCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearningActivity.this, CarActivity.class));
            }
        });
    }

    private void goHome(){
        ImageButton goToHomeButton = (ImageButton)findViewById(R.id.homeButton);
        goToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearningActivity.this, MainActivity.class));
            }
        });
    }
}
