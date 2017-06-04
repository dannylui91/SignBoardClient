package com.example.testing.signboardclient.ui.melody;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.testing.signboardclient.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dannylui on 6/4/17.
 */

public class MelodyHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_melody_name) TextView melodyNameTv;

    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

    public MelodyHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final String s) {
        melodyNameTv.setText(s);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ref.child("melody").setValue(s);
            }
        });
    }
}
