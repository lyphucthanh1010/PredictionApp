package com.example.superproject;

import android.content.Intent;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    Animation topAmin , bottomAmin;
    ImageView logo;
    TextView logoName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        topAmin = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAmin = AnimationUtils.loadAnimation(this,R.anim.bot_anim);
        logo = (ImageView) findViewById(R.id.logo);
        logoName = (TextView) findViewById(R.id.texttitle);

        logo.setAnimation(topAmin);
        logoName.setAnimation(bottomAmin);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(SplashActivity.this, OnBoardActivity.class));
                finish();
            }
        },3000);
    }
}