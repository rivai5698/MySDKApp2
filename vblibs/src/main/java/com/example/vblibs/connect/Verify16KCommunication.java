package com.example.vblibs.connect;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import okhttp3.MultipartBody;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 *
 * @author thangth
 */
public interface Verify16KCommunication {

    @POST("do_verify_16k")
    @Multipart
    Call<Verify16KResponse> verify(
            @Part("phone") RequestBody phone,
            @Part MultipartBody.Part file
            // @Part("verify_type") RequestBody verify_type
    );
}

