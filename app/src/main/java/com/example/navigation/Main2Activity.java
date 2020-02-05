package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);


        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransision);


        Thread timer=new Thread(){
            public void run(){
                try {

                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent ma=new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(ma);
                    Main2Activity.this.finish();

                }
            }
        };
        timer.start();
    }
}
