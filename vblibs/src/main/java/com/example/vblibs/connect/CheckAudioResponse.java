package com.example.vblibs.connect;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CheckAudioResponse {
    @SerializedName("status")
    private Integer status;
    @SerializedName("code")
    private Integer code;
    @SerializedName("msg")
    private String msg;

    public CheckAudioResponse(){

    }

    public CheckAudioResponse(Integer status, Integer code, String msg) {
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
        return "CheckAudioResponse{" + "status=" + status + ", code=" + code + ", msg=" + msg + '}';
    }
}
