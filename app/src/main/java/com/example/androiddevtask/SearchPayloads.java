package com.example.androiddevtask;

import java.util.Date;

public class SearchPayloads {
    public boolean is_pro;
    public boolean is_online;
    public String _id;
    public String first_name;
    public String last_name;
    public String phone_number;
    public String occupation;
    public Date createdAt;
    public String country;

    public SearchPayloads(boolean is_pro, boolean is_online, String _id, String first_name, String last_name, String phone_number, String occupation, Date createdAt, String country) {
        this.is_pro = is_pro;
        this.is_online = is_online;
        this._id = _id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.occupation = occupation;
        this.createdAt = createdAt;
        this.country = country;
    }

    public boolean isIs_pro() {
        return is_pro;
    }

    public void setIs_pro(boolean is_pro) {
        this.is_pro = is_pro;
    }

    public boolean isIs_online() {
        return is_online;
    }

    public void setIs_online(boolean is_online) {
        this.is_online = is_online;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
