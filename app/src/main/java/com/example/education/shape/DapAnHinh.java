package com.example.education.shape;

import java.util.Objects;

public class DapAnHinh extends geometry{
    private boolean kiemTraDung;

    public boolean isKiemTraDung() {
        return kiemTraDung;
    }

    public void setKiemTraDung(boolean kiemTraDung) {
        this.kiemTraDung = kiemTraDung;
    }

    public DapAnHinh(int id, int images, String textImages, int soundImages, boolean kiemTraDung) {
        super(id, images, textImages, soundImages);
        this.kiemTraDung = kiemTraDung;
    }

    public DapAnHinh(geometry s, boolean kiemTraDung){
        super(s.getId(), s.getImages(), s.getTextImages(), s.getSoundImages());
        this.kiemTraDung = kiemTraDung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DapAnHinh dapAn = (DapAnHinh) o;
        return kiemTraDung == dapAn.kiemTraDung && super.getId() == dapAn.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(kiemTraDung);
    }
}
