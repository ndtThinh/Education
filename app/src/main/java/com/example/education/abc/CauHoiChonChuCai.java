package com.example.education.abc;

import com.example.education.data.DuLieu;

import java.util.ArrayList;
import java.util.Random;

public class CauHoiChonChuCai {
    private ArrayList<DapAnChu> dsDapAn;

    public CauHoiChonChuCai(){
        this.dsDapAn= new ArrayList<>();
    }
    public  CauHoiChonChuCai(ArrayList<DapAnChu> dsDapAn){
        this.dsDapAn=dsDapAn;
    }
    public ArrayList<DapAnChu> getDsDapAn() {
        return dsDapAn;
    }

    public void setDsDapAn(ArrayList<DapAnChu> dsDapAn) {
        this.dsDapAn = dsDapAn;
    }

    public DapAnChu getDapAnDung(){
        for(DapAnChu da: this.dsDapAn){
            if(da.isCheckTrue()){
                return da;
            }
        }
        return null;
    }
    public void sinhCauHoi(){
        this.dsDapAn = new ArrayList<>();
        Random random = new Random();
        int dem = 4;
        while(dem > 0){
            int i = random.nextInt(28);

            DapAnChu dapAn = new DapAnChu(DuLieu.ChuCai[i], false);

            if(!this.dsDapAn.contains(dapAn)){
                this.dsDapAn.add(dapAn);
                dem--;
            }
        }
        int a = random.nextInt(4);
        this.dsDapAn.get(a).SetKiemTraDung(true);
    }
}
