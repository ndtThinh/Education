package com.example.education.number;

import java.util.Objects;

public class DapAnSo extends  So{
    private boolean kiemTraDung;

    public boolean isKiemTraDung() {
        return kiemTraDung;
    }

    public void setKiemTraDung(boolean kiemTraDung) {
        this.kiemTraDung = kiemTraDung;
    }

    public DapAnSo(int id, int so, int amThanh, int anhDaiDien, int anhMoTa, boolean kiemTraDung) {
        super(id, so, amThanh, anhDaiDien, anhMoTa);
        this.kiemTraDung = kiemTraDung;
    }

    public DapAnSo(So s, boolean kiemTraDung){
        super(s.getId(), s.getSo(), s.getAmThanh(), s.getAnhDaiDien(), s.getAnhMoTa());
        this.kiemTraDung = kiemTraDung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DapAnSo dapAn = (DapAnSo) o;
        return kiemTraDung == dapAn.kiemTraDung && super.getId() == dapAn.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(kiemTraDung);
    }
}
