package com.example.vblibs.module;

public class AudioCheckResultResponse {

    Integer code;
    String msg;
    String error;

    public AudioCheckResultResponse() {
    }

    public AudioCheckResultResponse(Integer code, String msg, String error) {
        this.code = code;
        this.msg = msg;
        this.error = error;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "AudioCheckResultResponse{" + "code=" + code + ", msg=" + msg + ", error=" + error + '}';
    }



}