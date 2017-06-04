package com.example.testing.signboardclient.ui.mood;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testing.signboardclient.R;
import com.example.testing.signboardclient.model.Mood;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dannylui on 6/3/17.
 */

public class MoodAdapter extends RecyclerView.Adapter<MoodHolder> {
    private List<Mood> moods = new ArrayList<>();

    @Override
    public MoodHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mood, viewGroup, false);
        return new MoodHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MoodHolder moodHolder, int i) {
        moodHolder.bind(moods.get(i));
    }

    @Override
    public int getItemCount() {
        return moods.size();
    }

    public void setData(List<Mood> moods) {
        this.moods.clear();
        this.moods.addAll(moods);
        notifyDataSetChanged();
    }
}
