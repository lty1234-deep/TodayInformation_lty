package com.android.todayinformation.mvp.persenter;

import com.android.todayinformation.mvp.ILifeCircle;
import com.android.todayinformation.mvp.IMvpView;
import com.android.todayinformation.mvp.MvpControler;

import java.lang.ref.WeakReference;

public abstract class LifeCircleMvpPresenter<T extends IMvpView> implements ILifeCircle {

    protected WeakReference<T> weakReference;

    protected LifeCircleMvpPresenter(){
        super();
    }

    public LifeCircleMvpPresenter(IMvpView iMvpView){
        super();
        attachView(iMvpView);
        MvpControler mvpControler = iMvpView.getMvpControler();
        mvpControler.savePersenter(this);
    }

    @Override
    public void attachView(IMvpView iMvpView) {
        if (weakReference == null){
            weakReference = new WeakReference(iMvpView);
        }else {
            T view = (T) weakReference.get();
            if (view != iMvpView){
                weakReference = new WeakReference(iMvpView);
            }
        }
    }

    @Override
    public void onDestroy() {
        weakReference = null;
    }
    
    protected T getView(){
        T view = weakReference != null ? (T)weakReference.get():null;
        if (view == null){
            return getEmptyView();
        }
        return view;
    }

    protected abstract T getEmptyView();
}
