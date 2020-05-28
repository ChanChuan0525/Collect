package com.chanchuan.base;

import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenter<V> implements IBasePresenter<V> {
    public V view;
    public static CompositeDisposable compositeDisposable;

    @Override
    public void attach(V view) {
        WeakReference<V> vWeakReference = new WeakReference<>(view);
        this.view = vWeakReference.get();
    }

    @Override
    public void detach() {
        if (view != null) {
            view = null;
        }
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    public static void addSubscribe(Disposable disposable) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }
}
