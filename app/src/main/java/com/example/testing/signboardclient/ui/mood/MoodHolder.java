package com.example.testing.signboardclient.ui.mood;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testing.signboardclient.R;
import com.example.testing.signboardclient.model.Mood;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

/**pπ
 * Created by dannylui on 6/3/17.
 */

public class MoodHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.civ_mood_color) ImageView moodTv;
    @BindView(R.id.tv_mood_text) TextView mootTextTv;

    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

    public MoodHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final Mood mood) {
        moodTv.setBackgroundResource(mood.getMoodImageId());
        mootTextTv.setText(mood.getMoodText());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ref.child("mood-color").setValue(mood.getMoodColor());
                Toast.makeText(itemView.getContext(), mood.getMoodColor(), Toast.LENGTH_SHORT).show();

                ref.child("message").setValue(mood.getMoodText().toUpperCase());
            }
        });

    }

}
