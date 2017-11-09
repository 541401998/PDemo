package com.example.xian.pdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

    private Button bt_show;
    private boolean ifshow=true;
    private ImageView sun;
    private ImageView sky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt_show = ((Button) findViewById(R.id.show_bt));
        sun = ((ImageView) findViewById(R.id.sun));
        sky = ((ImageView) findViewById(R.id.sky));
        bt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               initstart(ifshow);
            }
        });
    }

    private void initstart(boolean st) {
//        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sun_sky);
        LinearInterpolator lin = new LinearInterpolator();
        TranslateAnimation translateAnimation= new TranslateAnimation(
                Animation.RELATIVE_TO_SELF,0f,
                Animation.RELATIVE_TO_SELF,6f,
                Animation.RELATIVE_TO_SELF,0f,
                Animation.RELATIVE_TO_SELF,2.8f
        );
        translateAnimation.setDuration(3000);
        translateAnimation.setRepeatCount(20);
//        animation.setInterpolator(lin);

        if (st){
            if (translateAnimation!=null){
                sun.startAnimation(translateAnimation);
            }
            ifshow=false;
        }else {
            ifshow=true;
            sun.clearAnimation();
        }



    }
}
