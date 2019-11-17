package com.android.todayinformation;

import android.util.Log;
import android.widget.SimpleAdapter;

import com.android.todayinformation.mvp.IMvpView;
import com.android.todayinformation.mvp.ISplashActivityContract;
import com.android.todayinformation.mvp.base.BaesMvpPresenter;

public class SplashTimerPresenter extends BaesMvpPresenter<ISplashActivityContract.Iview> implements ISplashActivityContract.IPresenter {


    private CustomCountDownTimer timer;

    public SplashTimerPresenter(ISplashActivityContract.Iview view) {
        super(view);
    }


    public void initTimer() {

        timer = new CustomCountDownTimer(5, new CustomCountDownTimer.ICountDownHandler() {
            @Override
            public void onTicker(int time) {
                getView().setTvTimer(time + "秒");

            }

            @Override
            public void onFinish() {
                getView().setTvTimer("跳过");

            }
        });
        timer.start();
    }

    public void cancel() {
        timer.cancel();
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        cancel();
        Log.e("SplashTimerPresenter","onDestory");
    }

    @Override
    protected ISplashActivityContract.Iview getEmptyView() {
        return ISplashActivityContract.emptyView;
    }
}
