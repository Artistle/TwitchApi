package com.example.twitchapi;

import android.util.Log;

import com.example.twitchapi.NetworkUtils.CallApi;
import com.example.twitchapi.POJO.TopGamesPOJO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetwortThread implements Runnable {
    private CallApi callApi = new CallApi();
    @Override
    public void run() {
        callApi.getRetrofitCall().str().enqueue(new Callback<TopGamesPOJO>() {
            @Override
            public void onResponse(Call<TopGamesPOJO> call, Response<TopGamesPOJO> response) {
                System.out.println(response.body().getDataArrayList().size());
            }

            @Override
            public void onFailure(Call<TopGamesPOJO> call, Throwable t) {
                Log.e("Error retr", "error = " + t.getLocalizedMessage());
            }
        });
    }
}
