package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.model.ResponseApi;
import com.example.jean.retrofitexample.model.ResponseApi2;
import com.example.jean.retrofitexample.service.PlayerService;
import com.example.jean.retrofitexample.view.PlayerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistoryPresenter {

    private PlayerView countryView;
    private PlayerService countryService;

    public HistoryPresenter(PlayerView view) {
        this.countryView = view;

        if (this.countryService == null) {
            this.countryService = new PlayerService();
        }
    }

    public void getCountries() {
        countryService
                .getAPI()
                .getHistory()
                .enqueue(new Callback<ResponseApi2>() {
                    @Override
                    public void onResponse(Call<ResponseApi2> call, Response<ResponseApi2> response) {
                        ResponseApi2 data = response.body();

                        if (data != null && data.getData() != null) {
                            List<History> result = data.getData();
                            countryView.historyReady(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseApi2> call, Throwable t) {

                    }


                });
    }
}
