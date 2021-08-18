package com.example.androiddevtask;

import java.util.Date;

public class User {
    public String _id;
    public String name;
    public String email;
    public String createdAt;

    public User(String _id, String name, String email, String createdAt) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
