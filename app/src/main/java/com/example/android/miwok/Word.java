package com.example.android.miwok;

import android.widget.ImageView;

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID = -1;
    private int audioResourceID;

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceID = audioResourceID;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage() {
        return (imageResourceID == -1) ? false : true;
    }

    public int getAudioResourceID() {
        return audioResourceID;
    }
}
