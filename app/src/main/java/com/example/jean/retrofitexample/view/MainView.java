package com.example.jean.retrofitexample.view;

import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.Player;

import java.util.List;

/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public interface MainView {

    void countriesReady(List<Player> books);
    void historyReady(List<History> books);
}
