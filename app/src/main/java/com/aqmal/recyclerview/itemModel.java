package com.aqmal.recyclerview;

public class itemModel {
    String name;
    String nim;
    int image;

    public itemModel(String name, String nim, int image) {
        this.name = name;
        this.nim = nim;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
