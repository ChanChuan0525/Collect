package com.chanchuan.service;

import com.chanchuan.bean.InfoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    String collectUrl = "http://static.owspace.com/";

    @GET("?c=api&a=getList&page_id=0")
    Observable<InfoBean> getInfoData();
}
