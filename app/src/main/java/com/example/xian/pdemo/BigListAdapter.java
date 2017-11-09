package com.example.xian.pdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/10 0010.
 */

public class BigListAdapter extends BaseAdapter {
    private List<GigEntity> blist;
    private Context context;

    public BigListAdapter(List<GigEntity> blist, Context context) {
        this.blist = blist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return blist.size();
    }

    @Override
    public Object getItem(int position) {
        return blist.get(position);
        //nihao
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    class ViewHolderB{

    }
}
