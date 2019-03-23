package com.example.followwhatulike;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_screen extends AppCompatActivity {

    ImageView splashpicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashpicture = (ImageView)findViewById(R.id.Splash_icon);




        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        splashpicture.setAnimation(myanim);


        final Intent i = new Intent(Splash_screen.this,MainActivity.class);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }

}
