package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents...
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public class Data {

    @SerializedName("ResponseApi")
    private ResponseApi responseApi;

    public ResponseApi getResponseApi() {
        return responseApi;
    }



    @SerializedName("ResponseApi2")
    private  ResponseApi2 responseApi2;

    public ResponseApi2 getResponseApi2(){
        return responseApi2;
    }

}
