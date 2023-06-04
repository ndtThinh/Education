package com.example.education.number;

import com.example.education.data.DuLieu;

import java.util.ArrayList;
import java.util.Random;

public class CauHoiChonSo {
    private ArrayList<DapAnSo> danhSachDapAn;

    public  CauHoiChonSo(){
        this.danhSachDapAn = new ArrayList<>();
    }

    public CauHoiChonSo(ArrayList<DapAnSo> danhSachDapAn) {
        this.danhSachDapAn = danhSachDapAn;
    }

    public ArrayList<DapAnSo> getDanhSachDapAn() {
        return danhSachDapAn;
    }

    public void setDanhSachSo(ArrayList<DapAnSo> danhSachDapAn) {
        this.danhSachDapAn = danhSachDapAn;
    }

    public DapAnSo getDapAnDung(){
        for(DapAnSo da: this.danhSachDapAn){
            if(da.isKiemTraDung()){
                return da;
            }
        }
        return null;
    }

    public void sinhCauHoi(){
        this.danhSachDapAn = new ArrayList<>();
        Random random = new Random();
        int dem = 4;
        while(dem > 0){
            int i = random.nextInt(9);

            DapAnSo dapAn = new DapAnSo(DuLieu.danhSachSo[i], false);

            if(!this.danhSachDapAn.contains(dapAn)){
                this.danhSachDapAn.add(dapAn);
                dem--;
            }
        }

        int a = random.nextInt(4);
        this.danhSachDapAn.get(a).setKiemTraDung(true);
    }
}
