package com.example.p66na.drumapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //    ImageButton m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    MediaPlayer p1, p2, p3, p4, p5, p6, p7, p8;

    public void play(View v) {
        int id=v.getId();
        switch (id) {
            case R.id.imageButton1:
                p1.start();
                break;
            case R.id.imageButton2:
                p2.start();
                break;
            case R.id.imageButton3:
                p3.start();
                break;
            case R.id.imageButton4:
                p4.start();
                break;
            case R.id.imageButton5:
                p5.start();
                break;
            case R.id.imageButton6:
                p6.start();
                break;
            case R.id.imageButton7:
                p7.start();
                break;
            case R.id.imageButton8:
                p8.start();
                break;
            case R.id.imageButton9:
                p1.start();
                break;
            case R.id.imageButton10:
                p2.start();
                break;
            case R.id.imageButton11:
                p3.start();
                break;
            case R.id.imageButton12:
                p4.start();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = MediaPlayer.create(this, R.raw.one);
        p2 = MediaPlayer.create(this, R.raw.two);
        p3 = MediaPlayer.create(this, R.raw.three);
        p4 = MediaPlayer.create(this, R.raw.four);
        p5 = MediaPlayer.create(this, R.raw.fv);
        p6 = MediaPlayer.create(this, R.raw.sixth);
        p7 = MediaPlayer.create(this, R.raw.seventh);
        p8 = MediaPlayer.create(this, R.raw.eighth);
//        m1= findViewById(R.id.imageButton1);
//        m2= findViewById(R.id.imageButton2);
//        m3= findViewById(R.id.imageButton3);
//        m4= findViewById(R.id.imageButton4);
//        m5= findViewById(R.id.imageButton5);
//        m6= findViewById(R.id.imageButton6);
//        m7= findViewById(R.id.imageButton7);
//        m8= findViewById(R.id.imageButton8);
//        m9= findViewById(R.id.imageButton9);
//        m10= findViewById(R.id.imageButton10);
//        m11= findViewById(R.id.imageButton11);
//        m12= findViewById(R.id.imageButton12);
    }
}