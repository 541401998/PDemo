package com.example.xian.pdemo;

import java.util.List;

/**
 * Created by Administrator on 2017/6/10 0010.
 */

public class GigEntity {
    private String big;
    private List<SmallEntity> slist;

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public List<SmallEntity> getSlist() {
        return slist;
    }

    public void setSlist(List<SmallEntity> slist) {
        this.slist = slist;
    }
}
