package com.meshilogic.tcsparentsmodule.Adapter;

import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;

public class SiblingsModel implements Serializable {
    public int siblingId;
    public String siblingName;
    public int image;

    public SiblingsModel(int siblingId, String siblingName, int image) {
        this.siblingId = siblingId;
        this.siblingName = siblingName;
        this.image = image;
    }

    public int getSiblingId() {
        return siblingId;
    }

    public String getSiblingName() {
        return siblingName;
    }

    public int getImage() {
        return image;
    }
}

