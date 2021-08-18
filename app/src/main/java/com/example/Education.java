package com.example;

import java.util.Date;

public class Education {
    public String name;
    public String degree;
    public Date work_start;
    public Date work_end;
    public boolean is_current_company;
    public String education_url;

    public Education(String name, String degree, Date work_start, Date work_end, boolean is_current_company, String education_url) {
        this.name = name;
        this.degree = degree;
        this.work_start = work_start;
        this.work_end = work_end;
        this.is_current_company = is_current_company;
        this.education_url = education_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getWork_start() {
        return work_start;
    }

    public void setWork_start(Date work_start) {
        this.work_start = work_start;
    }

    public Date getWork_end() {
        return work_end;
    }

    public void setWork_end(Date work_end) {
        this.work_end = work_end;
    }

    public boolean isIs_current_company() {
        return is_current_company;
    }

    public void setIs_current_company(boolean is_current_company) {
        this.is_current_company = is_current_company;
    }

    public String getEducation_url() {
        return education_url;
    }

    public void setEducation_url(String education_url) {
        this.education_url = education_url;
    }
}
