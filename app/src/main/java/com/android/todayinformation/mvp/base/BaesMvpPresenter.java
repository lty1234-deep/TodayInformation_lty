package com.android.todayinformation.mvp.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.view.menu.BaseMenuPresenter;

import com.android.todayinformation.mvp.IMvpView;
import com.android.todayinformation.mvp.persenter.LifeCircleMvpPresenter;


//p层的中间类
public abstract class BaesMvpPresenter<T extends IMvpView> extends LifeCircleMvpPresenter<T> {

    public BaesMvpPresenter(T view){
        super(view);
    }



    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onActivityCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void destoryView() {

    }

    @Override
    public void onViewDestroy() {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {

    }
}
