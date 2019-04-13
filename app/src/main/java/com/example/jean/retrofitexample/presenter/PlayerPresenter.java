package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.model.ResponseApi;
import com.example.jean.retrofitexample.service.CountryService;
import com.example.jean.retrofitexample.view.CountryView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class CountryPresenter {

    private CountryView countryView;
    private CountryService countryService;

    public CountryPresenter(CountryView view) {
        this.countryView = view;

        if (this.countryService == null) {
            this.countryService = new CountryService();
        }
    }

    public void getCountries() {
        countryService
                .getAPI()
                .getResults()
                .enqueue(new Callback<ResponseApi>() {
                    @Override
                    public void onResponse(Call<ResponseApi> call, Response<ResponseApi> response) {
                        ResponseApi data = response.body();

                        if (data != null && data.getData() != null) {
                            List<Player> result = data.getData();
                            countryView.countriesReady(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseApi> call, Throwable t) {

                    }


                });
    }
}
