package com.ModelResponse;

import com.example.Meta;
import com.example.MorePayload;
import com.example.androiddevtask.SearchPayloads;
import com.example.androiddevtask.Status;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchUserResponse {
    Status status;
    Meta meta;

    @SerializedName("payload")
    List<SearchPayloads> morePayloads;

    public SearchUserResponse(Status status, Meta meta, List<SearchPayloads> morePayloads) {
        this.status = status;
        this.meta = meta;
        this.morePayloads = morePayloads;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<SearchPayloads> getMorePayloads() {
        return morePayloads;
    }

    public void setMorePayloads(List<SearchPayloads> morePayloads) {
        this.morePayloads = morePayloads;
    }
}
