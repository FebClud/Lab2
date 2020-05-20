package com.example.lab2;

import android.graphics.Bitmap;
import android.graphics.Color;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageIn {
    private static ImageIn instance;
    public Map<String, Bitmap> images = new HashMap<>();
    Fragments adapter;
    public static ImageIn createInstance(List<Item> items, Fragments adapter) {
        if(instance == null) {
            instance = new ImageIn(items, adapter);
        }
        return instance;
    }

    public static ImageIn getInstance() {
        return instance;
    }

    private ImageIn(List<Item> items, Fragments  adapter) {
        this.adapter = adapter;
        int[] colors = new int[300*300];
        Arrays.fill(colors, 0, 300*300, Color.GRAY);
        for(Item item : items) {
            images.put(item.getGraphic(), Bitmap.createBitmap(colors, 300, 300, Bitmap.Config.ARGB_8888));
        }
    }
    public Bitmap getImage(String graphics) {
        return images.get(graphics);
    }

}
