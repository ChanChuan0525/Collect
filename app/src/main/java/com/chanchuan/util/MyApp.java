package com.chanchuan.util;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.chanchuan.bean.DatasBean;
import com.chanchuan.greendao.DaoMaster;
import com.chanchuan.greendao.DaoSession;
import com.chanchuan.greendao.DatasBeanDao;

import java.util.List;

public class MyApp extends Application {
    public static Context context;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(context, "info.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        daoSession = daoMaster.newSession();
    }

    public static boolean queryOne(DatasBean data) {                        //单个查询是否存在
        DatasBean unique = daoSession.queryBuilder(DatasBean.class)
                .where(DatasBeanDao.Properties.Title.eq(data.getTitle()))
                .unique();
        return unique == null ? true : false;
    }

    public static DatasBean query(DatasBean data) {                 //查询单个数据
        DatasBean unique = daoSession.queryBuilder(DatasBean.class)
                .where(DatasBeanDao.Properties.Title.eq(data.getTitle()))
                .unique();
        return unique;
    }

    public static void insert(DatasBean data) {                 //数据库的插入方法
        if (queryOne(data)) {
            daoSession.insert(data);
            Toast.makeText(context, "收藏成功！", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "已经收藏过啦！", Toast.LENGTH_SHORT).show();
        }
    }

    public static void delete(DatasBean data) {                     //数据库的删除方法
        if (!queryOne(data)) {
            daoSession.delete(data);
            Toast.makeText(context, "取消收藏成功！", Toast.LENGTH_SHORT).show();
        }
    }

    public static void update(DatasBean data) {                     //数据库的更新方法
        if (!queryOne(data)) {
            daoSession.update(data);
            Toast.makeText(context, "修改成功！", Toast.LENGTH_SHORT).show();
        }
    }

    public static List<DatasBean> select() {                        //数据库的全查
        List<DatasBean> datasBeans = daoSession.loadAll(DatasBean.class);
        return datasBeans;
    }
}
