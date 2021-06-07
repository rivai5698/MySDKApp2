package com.example.vblibs.module;

public class AudioCheckResultResponse {
    Integer status;
    Integer code;
    String msg;

    public AudioCheckResultResponse() {
    }

    public AudioCheckResultResponse(Integer status, Integer code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "AudioCheckResultResponse{" + "status=" + status + ", code=" + code + ", msg=" + msg + '}';
    }
}
