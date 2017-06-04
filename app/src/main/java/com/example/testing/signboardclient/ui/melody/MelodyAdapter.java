package com.example.testing.signboardclient.ui.melody;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testing.signboardclient.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dannylui on 6/4/17.
 */

public class MelodyAdapter extends RecyclerView.Adapter<MelodyHolder> {
    private List<String> melodys = new ArrayList<>();

    @Override
    public MelodyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_melody, viewGroup, false);
        return new MelodyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MelodyHolder melodyHolder, int i) {
        melodyHolder.bind(melodys.get(i));
    }

    @Override
    public int getItemCount() {
        return melodys.size();
    }

    public void setData(List<String> melodys) {
        this.melodys.clear();
        this.melodys.addAll(melodys);
        notifyDataSetChanged();
    }
}
