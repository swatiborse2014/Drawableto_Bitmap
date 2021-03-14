package com.example.drawabletobitmaplibrary;

import android.graphics.Bitmap;

public class Model {
    String name;
    Bitmap img;


    public Model(String name, Bitmap bitmap) {
        this.name = name;
        img= (bitmap);
    }

    public Model() {

    }

    public String getName() {
        return name;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }
}
