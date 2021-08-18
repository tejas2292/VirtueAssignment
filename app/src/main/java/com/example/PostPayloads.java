package com.example;

import java.util.Date;

public class PostPayloads {
    public int comment_count;
    public int like_count;
    public int share_count;
    public int view_count;
    public boolean deleted;
    public String _id;
    public String text;
    public Object file_type;
    public String file;
    public PostLocation location;
    public Date expires_on;
    public Date createdAt;
    public Object expiry;
    public PostUser user;
    public boolean is_liked;
    public Date updatedAt;
    public int __v;
    public LocationSort location_sort;

    public PostPayloads(int comment_count, int like_count, int share_count, int view_count, boolean deleted, String _id, String text, Object file_type, String file, PostLocation location, Date expires_on, Date createdAt, Object expiry, PostUser user, boolean is_liked, Date updatedAt, int __v, LocationSort location_sort) {
        this.comment_count = comment_count;
        this.like_count = like_count;
        this.share_count = share_count;
        this.view_count = view_count;
        this.deleted = deleted;
        this._id = _id;
        this.text = text;
        this.file_type = file_type;
        this.file = file;
        this.location = location;
        this.expires_on = expires_on;
        this.createdAt = createdAt;
        this.expiry = expiry;
        this.user = user;
        this.is_liked = is_liked;
        this.updatedAt = updatedAt;
        this.__v = __v;
        this.location_sort = location_sort;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getShare_count() {
        return share_count;
    }

    public void setShare_count(int share_count) {
        this.share_count = share_count;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getFile_type() {
        return file_type;
    }

    public void setFile_type(Object file_type) {
        this.file_type = file_type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public PostLocation getLocation() {
        return location;
    }

    public void setLocation(PostLocation location) {
        this.location = location;
    }

    public Date getExpires_on() {
        return expires_on;
    }

    public void setExpires_on(Date expires_on) {
        this.expires_on = expires_on;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Object getExpiry() {
        return expiry;
    }

    public void setExpiry(Object expiry) {
        this.expiry = expiry;
    }

    public PostUser getUser() {
        return user;
    }

    public void setUser(PostUser user) {
        this.user = user;
    }

    public boolean isIs_liked() {
        return is_liked;
    }

    public void setIs_liked(boolean is_liked) {
        this.is_liked = is_liked;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public LocationSort getLocation_sort() {
        return location_sort;
    }

    public void setLocation_sort(LocationSort location_sort) {
        this.location_sort = location_sort;
    }
}
