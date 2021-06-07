package com.example.vblibs.module;


import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import com.example.vblibs.connect.CheckAudioCommunication;
import com.example.vblibs.connect.CheckAudioResponse;
import com.example.vblibs.connect.NetworkProvider;

public class CheckAudio {
    File myRecordFile;

    public File getMyRecordFile() {
        return myRecordFile;
    }

    public void setMyRecordFile(File myRecordFile) {
        this.myRecordFile = myRecordFile;
    }


    public AudioCheckResultResponse solveAudioFile(){
        ExecutorService threadPoll = Executors.newFixedThreadPool(1);
        Future<AudioCheckResultResponse> future = threadPoll.submit(new Callable<AudioCheckResultResponse>() {
            @Override
            public AudioCheckResultResponse call() throws Exception {
                CheckAudioCommunication checkAudioCommunication = NetworkProvider.self().getRetrofit().create(CheckAudioCommunication.class);

                RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), myRecordFile);
                MultipartBody.Part file = MultipartBody.Part.createFormData("file", myRecordFile.getName(), requestFile);
                Call<CheckAudioResponse> call = checkAudioCommunication.checkAudio(file);
                Response<CheckAudioResponse> response = call.execute();
                AudioCheckResultResponse responseResult = new AudioCheckResultResponse();
                if (response.isSuccessful()) {
                    System.out.println("res in: " + response.body());

                    responseResult.setCode(response.body().getCode());
                    responseResult.setStatus(response.body().getStatus());
                    responseResult.setMsg(response.body().getMsg());
                }
                return responseResult;
            }
        });
        AudioCheckResultResponse responseResult = null;
        try {
            responseResult = future.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
            responseResult = new AudioCheckResultResponse();
            responseResult.setMsg("System Error");
        }
        System.out.println("Result: " + responseResult);
        return responseResult;

    };
}
