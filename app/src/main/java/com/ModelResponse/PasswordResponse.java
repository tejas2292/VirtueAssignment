package com.ModelResponse;

import com.example.androiddevtask.Root;
import com.example.androiddevtask.Status;
import com.google.gson.annotations.SerializedName;

public class PasswordResponse {
    Status status;
    Root root;

    @SerializedName("payload")
    PassPayload passPayload;

    public PasswordResponse(Status status, Root root, PassPayload passPayload) {
        this.status = status;
        this.root = root;
        this.passPayload = passPayload;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    public PassPayload getPassPayload() {
        return passPayload;
    }

    public void setPassPayload(PassPayload passPayload) {
        this.passPayload = passPayload;
    }
}
