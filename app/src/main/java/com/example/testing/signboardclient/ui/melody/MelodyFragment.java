package com.example.testing.signboardclient.ui.melody;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testing.signboardclient.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dannylui on 6/3/17.
 */

public class MelodyFragment extends Fragment {
    @BindView(R.id.rv_melody) RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_melody, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MelodyAdapter());

        MelodyAdapter adapter = (MelodyAdapter) recyclerView.getAdapter();

        List<String> melodys = new ArrayList<>();
        melodys.add("Mary Had A Little Lamb");
        melodys.add("Happy Birthday");


        adapter.setData(melodys);

    }




}
