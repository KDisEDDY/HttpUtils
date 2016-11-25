package project.ljy.httputils.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import project.ljy.httputils.R;
import project.ljy.httputils.logic.response.StockRsp;
import project.ljy.httputils.model.ItemBO;

/**
 * Title: ListAdapter
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/11/25
 * Version: 1.0
 */
public class ListAdapter extends BaseAdapter {

    private List<ItemBO> mList = null;
    private Context mContext = null;

    public ListAdapter(Context context , List<ItemBO> list) {
        mContext = context;
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_stock,null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ItemBO data =  mList.get(position);
        viewHolder.mNameTxt.setText(data.getName());
        viewHolder.mRateTxt.setText(String.valueOf(data.getRate()));
        viewHolder.mTurnoverTxt.setText(String.valueOf(data.getTurnover()));
        return convertView;
    }

    static

    class ViewHolder {
        protected TextView mNameTxt;
        protected TextView mRateTxt;
        protected TextView mTurnoverTxt;

        ViewHolder(View rootView) {
            initView(rootView);
        }

        private void initView(View rootView) {
            mNameTxt = (TextView) rootView.findViewById(R.id.tv_name);
            mRateTxt = (TextView) rootView.findViewById(R.id.tv_rate);
            mTurnoverTxt = (TextView) rootView.findViewById(R.id.tv_turnover);
        }
    }
}
