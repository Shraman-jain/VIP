package com.example.bhopalcoderscommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {
private static int SPLASH_OUT_TIME=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(splash.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },SPLASH_OUT_TIME);
    }
}
