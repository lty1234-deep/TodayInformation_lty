package com.android.todayinformation;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.todayinformation.mvp.ISplashActivityContract;

import java.io.File;

import butterknife.BindView;

@ViewInject(mainlayoutid = R.layout.activity_splash)
public class SplashActivity extends BaseAcivity implements ISplashActivityContract.Iview {

    @BindView(R.id.vv_play)
    FullScreenVideoView mVideoView;
    @BindView(R.id.tv_splash_time)
    TextView mTvTimer;
    private ISplashActivityContract.IPresenter timerPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);


//        initTimer();

    }

    @Override
    public void afterBindView() {
        initTimerPresenter();

        initListener();
        initVideo();
    }

    private void initTimerPresenter() {
        timerPresenter = new SplashTimerPresenter(this);
        timerPresenter.initTimer();
    }

//    private void initTimer() {
//
//        timer = new CustomCountDownTimer(5, new CustomCountDownTimer.ICountDownHandler() {
//            @Override
//            public void onTicker(int time) {
//                mTvTimer.setText(time + "秒");
//            }
//
//            @Override
//            public void onFinish() {
//                mTvTimer.setText("跳过");
//
//
//            }
//        });
//        timer.start();
//    }

    private void initVideo() {
        mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + File.separator + R.raw.splash));
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

    }

    private void initListener() {

        mTvTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });

        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });


    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        timerPresenter.onDestroy();
//    }

    public void setTvTimer(String s) {
        mTvTimer.setText(s);
    }
}
