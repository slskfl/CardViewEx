package com.example.recyclerview;

public class ItemData {
    int imgID;
    String content;
    String title;

    public ItemData(int imgID, String content, String title) {
        this.imgID = imgID;
        this.content = content;
        this.title = title;
    }

    public int getImgID() {
        return imgID;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
