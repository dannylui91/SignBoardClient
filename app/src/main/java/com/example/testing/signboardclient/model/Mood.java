package com.example.testing.signboardclient.model;

/**
 * Created by dannylui on 6/3/17.
 */

public class Mood {
    private String moodText;
    private String moodColor;
    private Integer moodImageId;

    public Mood(String moodText, String moodColor, int moodImageId) {
        this.moodText = moodText;
        this.moodColor = moodColor;
        this.moodImageId = moodImageId;
    }

    public String getMoodText() {
        return moodText;
    }

    public String getMoodColor() {
        return moodColor;
    }

    public Integer getMoodImageId() {
        return moodImageId;
    }

    public void setMoodText(String moodText) {
        this.moodText = moodText;
    }

    public void setMoodColor(String moodColor) {
        this.moodColor = moodColor;
    }

    public void setMoodImageId(Integer moodImageId) {
        this.moodImageId = moodImageId;
    }
}
