package com.example.lenovo.animationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Fade_Out extends AppCompatActivity {
Animation fadeout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade__out);

        button=(Button)findViewById(R.id.button);

        fadeout= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.startAnimation(fadeout);
            }
        });



    }
}
