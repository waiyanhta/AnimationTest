package com.example.lenovo.animationtest;

import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class FadeInActivity extends AppCompatActivity implements Animation.AnimationListener {
TextView txtMessage;
    //Animation
    Animation animFadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_in);

        txtMessage =(TextView)findViewById(R.id.textView2);

        //load the animation
        animFadein= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadein.setAnimationListener(this);
        txtMessage.startAnimation(animFadein);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if(animation==animFadein)
            Toast.makeText(this, "Animation Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
