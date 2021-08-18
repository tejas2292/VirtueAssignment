package com.example;

import com.example.androiddevtask.Root;
import com.example.androiddevtask.Status;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchPostResponse {
    Status status;
    AvailabilityDays availabilityDays;
    Education education;

    @SerializedName("user")
    PostUser postUser;

    @SerializedName("location")
    PostLocation postLocation;

    LocationSort locationSort;
    Meta meta;
    Root root;

    @SerializedName("payload")
    List<PostPayloads> postPayloads;

    public FetchPostResponse(Status status, AvailabilityDays availabilityDays, Education education, PostUser postUser, PostLocation postLocation, LocationSort locationSort, Meta meta, Root root, List<PostPayloads> postPayloads) {
        this.status = status;
        this.availabilityDays = availabilityDays;
        this.education = education;
        this.postUser = postUser;
        this.postLocation = postLocation;
        this.locationSort = locationSort;
        this.meta = meta;
        this.root = root;
        this.postPayloads = postPayloads;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AvailabilityDays getAvailabilityDays() {
        return availabilityDays;
    }

    public void setAvailabilityDays(AvailabilityDays availabilityDays) {
        this.availabilityDays = availabilityDays;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public PostUser getPostUser() {
        return postUser;
    }

    public void setPostUser(PostUser postUser) {
        this.postUser = postUser;
    }

    public PostLocation getPostLocation() {
        return postLocation;
    }

    public void setPostLocation(PostLocation postLocation) {
        this.postLocation = postLocation;
    }

    public LocationSort getLocationSort() {
        return locationSort;
    }

    public void setLocationSort(LocationSort locationSort) {
        this.locationSort = locationSort;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    public List<PostPayloads> getPostPayloads() {
        return postPayloads;
    }

    public void setPostPayloads(List<PostPayloads> postPayloads) {
        this.postPayloads = postPayloads;
    }
}
