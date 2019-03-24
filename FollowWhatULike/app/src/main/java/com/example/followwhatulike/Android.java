package com.example.followwhatulike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Android extends AppCompatActivity {
    private Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        b1 = (Button)findViewById(R.id.languages);
        b2 = (Button)findViewById(R.id.courserecommendation);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(Android.this,Languages.class);
                startActivity(intentLoadNewActivity);

            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mp.start();
                Intent intentLoadNewActivity = new Intent(Android.this,Course_recommendation.class);
                startActivity(intentLoadNewActivity);

            }
        });
    }
}
