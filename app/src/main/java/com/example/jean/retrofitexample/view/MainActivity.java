package com.example.jean.retrofitexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.presenter.PlayerPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements PlayerView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PlayerPresenter playerPresenter = new PlayerPresenter(this);

        // Maybe it's best to call it on onResume()
        playerPresenter.getCountries();


    }

    @Override
    public void countriesReady(List<Player> books) {

        // See your Logcat :)
        for (Player book : books) {
            Log.i("RETROFIT", book.getId() + "\n"
                    + " - Alpha2:  " + book.getTeam() + " \n"
                    + " - Alpha3: " + book.getNama());
        }
    }

    @Override
    public void historyReady(List<History> books) {

    }
}
