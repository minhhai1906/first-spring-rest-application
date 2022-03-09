package com.minhhai.springrest.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
