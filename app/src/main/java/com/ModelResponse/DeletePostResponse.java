package com.ModelResponse;

import com.example.androiddevtask.Root;
import com.example.androiddevtask.Status;

public class DeletePostResponse {
    Status status;
    Root root;

    public DeletePostResponse(Status status, Root root) {
        this.status = status;
        this.root = root;
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
}
