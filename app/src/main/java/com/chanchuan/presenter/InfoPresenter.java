package com.chanchuan.presenter;

import android.util.Log;

import com.chanchuan.base.BasePresenter;
import com.chanchuan.bean.InfoBean;
import com.chanchuan.contract.InfoContract;
import com.chanchuan.net.HttpManager;
import com.chanchuan.service.ApiService;
import com.chanchuan.util.RxUtils;

import io.reactivex.observers.ResourceObserver;

public class InfoPresenter extends BasePresenter<InfoContract.View> implements InfoContract.Presenter {
    @Override
    public void getInfoDat() {
        ApiService service = HttpManager.getInstance().getService(ApiService.collectUrl, ApiService.class);
        ResourceObserver<InfoBean> resourceObserver = service.getInfoData()
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new ResourceObserver<InfoBean>() {
                    @Override
                    public void onNext(InfoBean infoBean) {
                        Log.d(TAG, "onNext: "+infoBean.toString());
                        view.successData(infoBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.error(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        addSubscribe(resourceObserver);
    }

    private static final String TAG = "InfoPresenter";
}
