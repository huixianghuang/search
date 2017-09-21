package com.weapes.domin.response;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Response {
    protected String message;
    protected int status;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
