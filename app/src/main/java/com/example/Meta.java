package com.example;

public class Meta {
    int page_number;
    String start;
    int total;

    public Meta(int page_number, String start, int total) {
        this.page_number = page_number;
        this.start = start;
        this.total = total;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
