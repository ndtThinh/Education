package com.example.education.abc;

public class ClassABC {
    private int Id;
    private int Image;
    private int ImageChuCai;
    private String TextTenHinh;
    private int audioChu,audioHinh;


    public ClassABC(int id, int image, int chucai,String tenhinh, int audioChu,int audioHinh) {
        Id = id;
        Image = image;
        ImageChuCai =chucai;
        TextTenHinh=tenhinh;
        this.audioChu = audioChu;
        this.audioHinh=audioHinh;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }



    public int getAudioChu() {
        return audioChu;
    }
    public int getAudioHinh(){return audioHinh;}

    public void setAudioChu(int audioChu) {
        this.audioChu = audioChu;
    }
    public void SetAudioHinh(int audioHinh){this.audioHinh=audioHinh;}

    public String getTextTenHinh() {
        return TextTenHinh;
    }

    public int getImageChuCai() {
        return ImageChuCai;
    }
    public void setImageChuCai(int imageChuCai) {
        ImageChuCai = imageChuCai;
    }

    public void setTextTenHinh(String textTenHinh) {
        TextTenHinh = textTenHinh;
    }
}
