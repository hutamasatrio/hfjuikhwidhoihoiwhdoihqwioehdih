package com.example.jean.retrofitexample.service;

import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.model.ResponseApi;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This class represents the Countries API, all endpoints can stay here.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public interface CountryAPI {

    @GET("player")
    Call<ResponseApi> getResults();

//    @GET("bins/1bsqcn")
//    Call<Data> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);
}
