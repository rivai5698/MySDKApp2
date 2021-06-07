package com.example.vblibs.connect;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface CheckAudioCommunication {
    @POST("check-audio")
    @Multipart
    Call<CheckAudioResponse> checkAudio(
            @Part MultipartBody.Part file
    );
}
