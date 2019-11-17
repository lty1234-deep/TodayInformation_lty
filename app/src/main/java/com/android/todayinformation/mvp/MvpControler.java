package com.android.todayinformation.mvp;

import android.content.Intent;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MvpControler implements ILifeCircle {

    //存放的是P层的实例
    private Set<ILifeCircle> lifeCircles = new HashSet<>();

    public void  savePersenter(ILifeCircle lifeCircle){
        this.lifeCircles.add(lifeCircle);
    }

    public static MvpControler newInstance(){
        return new MvpControler();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {
        Iterator<ILifeCircle> iterator =this.lifeCircles.iterator();
        while (iterator.hasNext()){
            ILifeCircle next = iterator.next();
            if (intent == null){
                intent = new Intent();
            }
            if (getArguments == null){
                getArguments = new Bundle();
            }
            next.onCreate(savedInstanceState,intent,getArguments);
        }
    }

    @Override
    public void onActivityCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {
        Iterator var3 = this.lifeCircles.iterator();
        while (var3.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var3.next();
            if (intent == null){
                intent = new Intent();
            }
            if (getArguments == null){
                getArguments = new Bundle();
            }
            persenter.onActivityCreate(savedInstanceState,intent,getArguments);

        }

    }

    @Override
    public void onStart() {
        Iterator var2 = this.lifeCircles.iterator();

        while (var2.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var2.next();
            persenter.onStart();
        }

    }

    @Override
    public void onResume() {
        Iterator var4 = this.lifeCircles.iterator();

        while (var4.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var4.next();
            persenter.onResume();
        }

    }

    @Override
    public void onPause() {
        Iterator var5 = this.lifeCircles.iterator();

        while (var5.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var5.next();
            persenter.onPause();
        }

    }

    @Override
    public void onStop() {
        Iterator var6 = this.lifeCircles.iterator();

        while (var6.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var6.next();
            persenter.onStop();
        }

    }

    @Override
    public void onDestroy() {
        Iterator var1 = this.lifeCircles.iterator();

        while (var1.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var1.next();
            persenter.onDestroy();
        }

    }

    @Override
    public void destoryView() {
        Iterator var7 = this.lifeCircles.iterator();

        while (var7.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var7.next();
            persenter.destoryView();
        }

    }

    @Override
    public void onViewDestroy() {
        Iterator var8 = this.lifeCircles.iterator();

        while (var8.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var8.next();
            persenter.onViewDestroy();
        }

    }

    @Override
    public void onNewIntent(Intent intent) {
        Iterator var9 = this.lifeCircles.iterator();

        while (var9.hasNext()){
            if (intent == null){
                intent = new Intent();
            }

            ILifeCircle persenter = (ILifeCircle) var9.next();
            persenter.onNewIntent(intent);
        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator var10 = this.lifeCircles.iterator();

        while (var10.hasNext()){
            if (data == null){
                data = new Intent();
            }

            ILifeCircle persenter = (ILifeCircle) var10.next();
            persenter.onActivityResult(requestCode,resultCode,data);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        Iterator var11 = this.lifeCircles.iterator();

        while (var11.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var11.next();
            persenter.onSaveInstanceState(bundle);
        }

    }

    @Override
    public void attachView(IMvpView iMvpView) {
        Iterator var12 = this.lifeCircles.iterator();

        while (var12.hasNext()){
            ILifeCircle persenter = (ILifeCircle) var12.next();
            persenter.attachView(iMvpView);
        }

    }
}
