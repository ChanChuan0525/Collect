package com.chanchuan.contract;

import com.chanchuan.base.IBasePresenter;
import com.chanchuan.base.IBaseView;

public interface InfoContract {
    interface View<T> extends IBaseView {
        void successData(T t);
    }

    interface Presenter extends IBasePresenter<View> {
        void getInfoDat();
    }
}
