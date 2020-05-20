package com.bytedance.tiktok.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bytedance.tiktok.R;
import com.bytedance.tiktok.base.BaseRvAdapter;
import com.bytedance.tiktok.base.BaseRvViewHolder;

import java.util.List;

/**
 * create by libo
 * create on 2020-05-20
 * description
 */
public class GridVideoAdapter extends BaseRvAdapter<Integer, GridVideoAdapter.GridVideoViewHolder> {

    public GridVideoAdapter(Context context, List<Integer> datas) {
        super(context, datas);
    }

    @Override
    protected void onBindData(GridVideoViewHolder holder, Integer data, int position) {
        holder.ivCover.setBackgroundResource(data);
    }

    @NonNull
    @Override
    public GridVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gridvideo, parent, false);
        return new GridVideoViewHolder(view);
    }

    public class GridVideoViewHolder extends BaseRvViewHolder {
        public ImageView ivCover;

        public GridVideoViewHolder(View itemView) {
            super(itemView);

            ivCover = itemView.findViewById(R.id.iv_cover);
        }
    }
}
