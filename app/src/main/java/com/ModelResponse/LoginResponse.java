package com.ModelResponse;

import com.example.androiddevtask.Payload;
import com.example.androiddevtask.Status;
import com.example.androiddevtask.User;

public class LoginResponse {
    Status status;
    Payload payload;

    public LoginResponse(Status status, Payload payload) {
        this.status = status;
        this.payload = payload;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
