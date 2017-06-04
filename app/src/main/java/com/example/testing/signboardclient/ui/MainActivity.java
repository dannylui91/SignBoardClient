package com.example.testing.signboardclient.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.testing.signboardclient.R;
import com.example.testing.signboardclient.ui.melody.MelodyFragment;
import com.example.testing.signboardclient.ui.message.MessageFragment;
import com.example.testing.signboardclient.ui.mood.MoodFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @BindView(R.id.bottom_navigation) BottomNavigationView bottomNV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNV.setOnNavigationItemSelectedListener(this);
        onNavigationItemSelected(bottomNV.getMenu().getItem(0));
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_message:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new MessageFragment())
                        .commit();
                break;
            case R.id.action_mood:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new MoodFragment())
                        .commit();
                break;
            case R.id.action_melody:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new MelodyFragment())
                        .commit();
                break;
        }
        return true;
    }
}
