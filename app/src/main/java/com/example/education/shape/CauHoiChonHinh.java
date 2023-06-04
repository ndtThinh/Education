package com.example.education.shape;

import com.example.education.data.DuLieu;

import java.util.ArrayList;
import java.util.Random;

public class CauHoiChonHinh {
    private ArrayList<DapAnHinh> danhSachDapAn;

    public CauHoiChonHinh() {
        this.danhSachDapAn = new ArrayList<>();
    }

    public CauHoiChonHinh(ArrayList<DapAnHinh> danhSachDapAn) {
        this.danhSachDapAn = danhSachDapAn;
    }

    public ArrayList<DapAnHinh> getDanhSachDapAn() {
        return danhSachDapAn;
    }

    public void setDanhSachSo(ArrayList<DapAnHinh> danhSachDapAn) {
        this.danhSachDapAn = danhSachDapAn;
    }

    public DapAnHinh getDapAnDung(){
        for(DapAnHinh da: this.danhSachDapAn){
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
            int i = random.nextInt(12);

            DapAnHinh dapAn = new DapAnHinh(DuLieu.detailGeometry1[i], false);

            if(!this.danhSachDapAn.contains(dapAn)){
                this.danhSachDapAn.add(dapAn);
                dem--;
            }
        }

        int a = random.nextInt(4);
        this.danhSachDapAn.get(a).setKiemTraDung(true);
    }
}
