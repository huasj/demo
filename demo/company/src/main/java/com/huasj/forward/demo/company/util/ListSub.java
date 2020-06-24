package com.huasj.forward.demo.company.util;

import java.util.List;

/**
 * 分页
 * Created by huasj Cotter on 2019/3/22.
 */
public class ListSub<E> {
    private int pageNum; //当前页
    private int pages;   //总页数
    private int total;   //总条数
    private int pageSize;//每页显示数
    private List<E> list;//要进行分页的list

    public ListSub(int pageNum, int pageSize, List<E> list) {
        super();
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.list = list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPages() {
        if(this.total % this.pageSize == 0){
            this.pages = this.total / this.pageSize;
        }else{
            this.pages = this.total / this.pageSize+1;
        }
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        total = list.size();
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<E> getList() {
        List<E> newList = this.list.subList(pageSize*(pageNum-1), (pageSize*pageNum)>total?total:(pageSize*pageNum));
        return newList;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

}
