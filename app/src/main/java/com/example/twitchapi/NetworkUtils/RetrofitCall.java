package com.example.twitchapi.NetworkUtils;

import com.example.twitchapi.POJO.TopGamesPOJO;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RetrofitCall {
    @Headers({
            "Client-ID: 3kl6l5uju3lylr5icn4jabig74hf9d",
            "Authorization: Bearer c8pj363jt26h9o6mfhvurhpx6a8xym"
    })
    @GET("games/top")
    Call<TopGamesPOJO> str();
}
