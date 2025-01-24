package com.example.retrofitexample.retrofit.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;
public class ResponseUserModel {
        private Data data;
    /*@SerializedName("data")
    private List<Data> dataList;*/
    private Support support;
    private int page;
    @SerializedName("per_page")
    private int perPage;
    private int total;
    @SerializedName("total_pages")
    private int totalPages;

    public ResponseUserModel(List<Data> dataList, Support support, int page, int perPage, int total, int totalPages) {
//        this.dataList = dataList;
        this.support = support;
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
    }

  /*  public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }*/

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}


