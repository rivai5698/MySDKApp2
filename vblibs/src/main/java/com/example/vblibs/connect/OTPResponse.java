package com.example.vblibs.connect;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OTPResponse {
    @SerializedName("status")
    private Integer status;

    public OTPResponse(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OTPResponse{" +
                "status='" + status + '\'' +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
