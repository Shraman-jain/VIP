package com.example.bhopalcoderscommunity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash2 extends AppCompatActivity {
    private static int SPLASH_OUT_TIME=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(splash2.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },SPLASH_OUT_TIME);
    }
}
