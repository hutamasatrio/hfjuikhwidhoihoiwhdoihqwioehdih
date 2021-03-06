package com.example.jean.retrofitexample.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.Player;

import java.util.ArrayList;
import java.util.List;


public class RV_AdapterPlayer extends RecyclerView.Adapter<RV_AdapterPlayer.MyViewHolder> {

    private List<Player> players = new ArrayList<>();
    private Context context;

    public RV_AdapterPlayer(Context context) {
        this.context = context;
    }

    public void setdata(List<Player> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        return new MyViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        Player mplayer = players.get(position);
        myViewHolder.id.setText("Player Position  : " + mplayer.getPosisi());
        myViewHolder.nama.setText("Player Name      : " + mplayer.getNama());
        myViewHolder.team.setText("Player Team       : " + mplayer.getTeam());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView id, nama, team;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id =(TextView) itemView.findViewById(R.id.tv_id);
            nama = (TextView)itemView.findViewById(R.id.tv_nama);
            team = (TextView)itemView.findViewById(R.id.tv_team);

        }
    }

}
