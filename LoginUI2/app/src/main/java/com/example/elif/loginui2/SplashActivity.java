package com.example.elif.loginui2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView txtSplashText;
    private ImageView imgSplashImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txtSplashText=(TextView)findViewById(R.id.txtSplashText);
        imgSplashImage=(ImageView)findViewById(R.id.imgSplashImage);

        Animation myanimation= AnimationUtils.loadAnimation(this,R.anim.mytransitional);
        txtSplashText.startAnimation(myanimation);
        imgSplashImage.startAnimation(myanimation);

        final Intent mainIntent=new Intent(this,MainActivity.class);

        Thread timer=new Thread(){
            public void run()
            {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                finally {
                    startActivity(mainIntent);
                    finish();
                }
            }
        };

        timer.start();
    }
}
