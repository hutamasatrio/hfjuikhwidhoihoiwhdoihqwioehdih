package com.example.jean.retrofitexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.presenter.HistoryPresenter;
import com.example.jean.retrofitexample.presenter.PlayerPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private RecyclerView mRvPlayer;
    private RV_AdapterPlayer rv_adapterPlayer;
    private List<Player> mPlayer = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PlayerPresenter playerPresenter = new PlayerPresenter(this);
        HistoryPresenter historyPresenter = new HistoryPresenter(this);

        // Maybe it's best to call it on onResume()
        playerPresenter.getData();
        historyPresenter.getData();

        mRvPlayer = (RecyclerView) findViewById(R.id.rv_player);

        mRvPlayer.setLayoutManager(new LinearLayoutManager(this));
        rv_adapterPlayer = new RV_AdapterPlayer(this);
        mRvPlayer.setAdapter(rv_adapterPlayer);

    }

    @Override
    public void countriesReady(List<Player> players) {
        mPlayer.addAll(players);
        rv_adapterPlayer.setdata(mPlayer);
        rv_adapterPlayer.notifyDataSetChanged();
        // See your Logcat :)
        for (Player book : players) {
            Log.i("RETROFIT", book.getId() + "\n"
                    + " - Alpha2:  " + book.getTeam() + " \n"
                    + " - Alpha3: " + book.getNama());
        }
    }

    @Override
    public void historyReady(List<History> books) {
        for (History book : books) {
            Log.i("RETROFIT", book.getId() + "\n"
                    + " - Alpha4:  " + book.getTeam() + " \n"
                    + " - Alpha5: " + book.getNama());
        }
    }
}
