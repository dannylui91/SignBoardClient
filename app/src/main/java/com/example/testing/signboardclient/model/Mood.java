package com.example.testing.signboardclient.model;

/**
 * Created by dannylui on 6/3/17.
 */

public class Mood {
    private String moodText;
    private String moodColor;

    public Mood(String moodText, String moodColor) {
        this.moodText = moodText;
        this.moodColor = moodColor;
    }

    public String getMoodText() {
        return moodText;
    }

    public String getMoodColor() {
        return moodColor;
    }

    public void setMoodText(String moodText) {
        this.moodText = moodText;
    }

    public void setMoodColor(String moodColor) {
        this.moodColor = moodColor;
    }
}
