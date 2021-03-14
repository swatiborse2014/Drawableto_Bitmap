package com.example.mydrawabletobitmp;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawabletobitmaplibrary.Model;

import java.io.InputStream;
import java.util.List;

import static com.example.drawabletobitmaplibrary.DrawableLibrary.listAllImages;

public class MainActivity extends Activity {
    private final static String TAG = "MainActivity";
    private String[] imgPath;
    private InputStream is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyDrawableName = findViewById(R.id.recyDrawableName);
        AssetManager assetManager = getAssets();

        List<Model> data = listAllImages(assetManager, imgPath, is);
        ShowImageAdapter adapter = new ShowImageAdapter(data);
        recyDrawableName.setHasFixedSize(true);
        recyDrawableName.setLayoutManager(new LinearLayoutManager(this));
        recyDrawableName.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}