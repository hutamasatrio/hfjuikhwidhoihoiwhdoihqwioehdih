package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.ResponseApi2;
import com.example.jean.retrofitexample.service.MainService;
import com.example.jean.retrofitexample.view.MainView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistoryPresenter {

    private MainView countryView;
    private MainService countryService;

    public HistoryPresenter(MainView view) {
        this.countryView = view;

        if (this.countryService == null) {
            this.countryService = new MainService();
        }
    }

    public void getData() {
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
