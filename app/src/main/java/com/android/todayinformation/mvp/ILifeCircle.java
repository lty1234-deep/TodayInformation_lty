package com.android.todayinformation.mvp;

import android.content.Intent;
import android.os.Bundle;

public interface ILifeCircle {

    void onCreate(Bundle savedInstanceState, Intent intent,Bundle getArguments);

    void onActivityCreate(Bundle savedInstanceState, Intent intent,Bundle getArguments);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void destoryView();

    void onViewDestroy();

    void onNewIntent(Intent intent);

    void onActivityResult(int requestCode,int resultCode,Intent data);

    void onSaveInstanceState(Bundle bundle);

    void attachView(IMvpView iMvpView);

}
