package com.example.lenovo.animationtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button fadein,fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadein=(Button)findViewById(R.id.fadein_button);
        fadeout=(Button)findViewById(R.id.button2);



              fadein.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent fade=new Intent(MainActivity.this,FadeInActivity.class);
                      startActivity(fade);
                  }
              });

        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fadeout=new Intent(MainActivity.this,Fade_Out.class);
                startActivity(fadeout);
            }
        });
    }
}
