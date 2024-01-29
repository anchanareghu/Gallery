package com.example.gallery02;

public class DataFromJson {

    private String url;

    public String getImage() {
        return url;
    }
    public void setImage(String url) {
        this.url = url;
    }
    public DataFromJson(String url) {
        this.url = url;
    }

}
