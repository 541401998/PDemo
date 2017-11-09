package com.example.xian.pdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import eu.erikw.PullToRefreshListView;

public class MainActivity extends AppCompatActivity implements PullToRefreshListView.OnRefreshListener {
    private PullToRefreshListView pullToRefreshListView;
    private  MyAdapter adapter;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pullToRefreshListView= ((PullToRefreshListView) findViewById(R.id.pullto));
        list= new ArrayList<>();
        for (int i = 0; i <30 ; i++) {
           list.add("这是第"+i+"个item") ;
        }
        adapter= new MyAdapter(list,getApplicationContext());
        pullToRefreshListView.setAdapter(adapter);
        pullToRefreshListView.setOnRefreshListener(this);


    }

    @Override
    public void onRefresh() {
        Toast.makeText(MainActivity.this, "刷新了...", Toast.LENGTH_SHORT).show();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pullToRefreshListView.onRefreshComplete();
    }
}
