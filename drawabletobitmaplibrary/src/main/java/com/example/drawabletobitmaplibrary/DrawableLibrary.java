package com.example.drawabletobitmaplibrary;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DrawableLibrary {

    public static List<Model> listAllImages(AssetManager assetManager, String[] imgPath, InputStream is) {
        List<Model> data = new ArrayList<>();
        Model model = new Model();
        try {
            imgPath = assetManager.list("img");
            for (int i = 0; i < imgPath.length; i++) {
                is = assetManager.open("img/" + imgPath[i]);
                Bitmap bitmap = BitmapFactory.decodeStream(is);
                model = new Model(imgPath[i],bitmap);
                data.add(model);
                Log.d("TAG", imgPath[i]);
                bitmapImage(is);
            }
        } catch (IOException e) {
            Log.e("TAG", e.getMessage());
        }
        return data;
    }

    public static Bitmap bitmapImage(InputStream is) {
        Bitmap bitmap = BitmapFactory.decodeStream(is);
        return bitmap;
    }
}
