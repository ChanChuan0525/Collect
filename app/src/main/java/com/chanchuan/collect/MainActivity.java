package com.chanchuan.collect;


import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chanchuan.adapter.InfoAdapter;
import com.chanchuan.base.BaseActivity;
import com.chanchuan.bean.DatasBean;
import com.chanchuan.bean.InfoBean;
import com.chanchuan.contract.InfoContract;
import com.chanchuan.presenter.InfoPresenter;

import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity<InfoPresenter> implements InfoContract.View<InfoBean> {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private InfoAdapter infoAdapter;

    @Override
    protected void initData() {
        presenter.getInfoDat();
    }

    @Override
    protected void initView() {
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        infoAdapter = new InfoAdapter(this);
        recycler.setAdapter(infoAdapter);
    }

    @Override
    protected InfoPresenter initPresenter() {
        return new InfoPresenter();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void successData(InfoBean infoBean) {
        List<DatasBean> datas = infoBean.getDatas();
        infoAdapter.setData(datas);
    }

    @Override
    public void error(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
