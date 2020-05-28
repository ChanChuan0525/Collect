package com.chanchuan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chanchuan.bean.DatasBean;
import com.chanchuan.collect.R;
import com.chanchuan.util.MyApp;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
    Context context;
    List<DatasBean> data = new ArrayList<>();
    List<Boolean> isCheck = new ArrayList<>();

    public InfoAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<DatasBean> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
        if (data.size() != 0) {
            for (int i = 0; i < data.size(); i++) {
                isCheck.add(false);
            }
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.info_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DatasBean datasBean = data.get(position);
        Glide.with(context).load(datasBean.getAvatar()).apply(RequestOptions.circleCropTransform()).into(holder.ivPhoto);
        holder.tvTitle.setText(datasBean.getTitle());
        holder.tvAuthor.setText(datasBean.getAuthor());
        Button btnCollect = holder.btnCollect;

        DatasBean bean = MyApp.query(datasBean);

        if (bean != null) {
            isCheck.set(position, true);
        } else {
            isCheck.set(position, false);
        }

        if (isCheck.get(position)) {
            btnCollect.setText("取消");
        } else {
            btnCollect.setText("关注");
        }

        btnCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCheck.get(position)) {
                    isCheck.set(position, false);
                    DatasBean query = MyApp.query(datasBean);
                    MyApp.delete(query);
                    btnCollect.setText("关注");
                } else {
                    isCheck.set(position, true);
                    MyApp.insert(datasBean);
                    btnCollect.setText("取消");
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.iv_photo)
        ImageView ivPhoto;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_author)
        TextView tvAuthor;
        @BindView(R.id.btn_collect)
        Button btnCollect;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
