package com.huasj.forward.demo.company.util;

/**
 * Created by huasj Cotter on 2019/3/7.
 */
public class PageData {
    private int total;
    private Object rows;

    public PageData() {
    }

    public PageData(int total, Object rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getRows() {
        return this.rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }
}
