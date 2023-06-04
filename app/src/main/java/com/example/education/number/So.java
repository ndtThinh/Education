package com.example.education.number;

public class So {
    private int id;
    private int so;
    private int amThanh;
    private int anhDaiDien;
    private int anhMoTa;


    public So(){}

    public So(int id, int so, int amThanh, int anhDaiDien, int anhMoTa) {
        this.id = id;
        this.so = so;
        this.amThanh = amThanh;
        this.anhDaiDien = anhDaiDien;
        this.anhMoTa = anhMoTa;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getAmThanh() {
        return amThanh;
    }

    public void setAmThanh(int amThanh) {
        this.amThanh = amThanh;
    }

    public int getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(int anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public int getAnhMoTa() {
        return anhMoTa;
    }

    public void setAnhMoTa(int anhMoTa) {
        this.anhMoTa = anhMoTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
