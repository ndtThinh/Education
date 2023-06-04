package com.example.education.shape;

public class geometry {
    private int id;
    private int images;
    private String textImages;

    private int soundImages;

    public int getSoundImages() {
        return soundImages;
    }

    public void setSoundImages(int soundImages) {
        this.soundImages = soundImages;
    }

    public geometry(int id, int images, String textImages, int soundImages) {
        this.id = id;
        this.images = images;
        this.textImages = textImages;
        this.soundImages = soundImages;
    }

    private int onlyNubmer;

    public geometry() {

    }
    public int getOnlyNubmer() {
        return onlyNubmer;
    }
    public void setOnlyNubmer(int onlyNubmer) {
        this.onlyNubmer = onlyNubmer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTextImages() {
        return textImages;
    }

    public void setTextImages(String textImages) {
        this.textImages = textImages;
    }




}
