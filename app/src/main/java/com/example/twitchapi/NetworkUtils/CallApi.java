package com.example.twitchapi.NetworkUtils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CallApi {
    private RetrofitCall retrofitCall;
    private Retrofit retrofit;

    public CallApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.twitch.tv/helix/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RetrofitCall getRetrofitCall(){
        return retrofit.create(RetrofitCall.class);
    }


}
