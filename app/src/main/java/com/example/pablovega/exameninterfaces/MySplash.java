package com.example.pablovega.exameninterfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MySplash extends Activity {

    TextView textSplash;
    private final int DURACION_SPLASH = 3000;
    private final int DURACION = 1000;
    private final int TIEMPO_DESPUES = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        textSplash = findViewById(R.id.textSplash);

        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(DURACION);
        fadeIn.setStartOffset(TIEMPO_DESPUES);
        fadeIn.setFillAfter(true);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        textSplash.startAnimation(fadeIn);


        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(MySplash.this, MyLogin.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
