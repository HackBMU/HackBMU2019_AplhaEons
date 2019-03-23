package com.example.followwhatulike;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton)findViewById(R.id.android_icon);
        b2 = (ImageButton)findViewById(R.id.bigdata);
        b3 = (ImageButton)findViewById(R.id.cloud);
        b4 = (ImageButton)findViewById(R.id.datascience);
        b5 = (ImageButton)findViewById(R.id.share);
        b6 =(ImageButton)findViewById(R.id.exitbutton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(MainActivity.this,Android.class);
                startActivity(intentLoadNewActivity);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(MainActivity.this,Bigdata.class);
                startActivity(intentLoadNewActivity);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(MainActivity.this,Cloud.class);
                startActivity(intentLoadNewActivity);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(MainActivity.this,Datascience.class);
                startActivity(intentLoadNewActivity);

            }
        });


        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(Intent.ACTION_SEND);
                        myIntent.setType("text/plan");
                        String shareBody = "Your Body is here";
                        String shareSub = "Your Subject is Here";
                        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                        startActivity(Intent.createChooser(myIntent,"Share Using"));
                    }
                }
        );
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ProcessBuilder mp;
                //mp.start();
                onBackPressed();
            }
        });
    }
}
