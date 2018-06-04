package com.example.android.miwok;

import android.widget.ImageView;

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID = -1;

    public Word (String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
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
}
