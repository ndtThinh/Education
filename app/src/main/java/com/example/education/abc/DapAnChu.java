package com.example.education.abc;

import androidx.annotation.Nullable;

public class DapAnChu extends ClassABC {
    private boolean kiemtradung;

    public boolean isCheckTrue(){
            return kiemtradung;
    }
    public void SetKiemTraDung(boolean kiemtradung){
        this.kiemtradung=kiemtradung;
    }
    public DapAnChu(int id, int image, int chucai, String tenhinh, int audioChu, int audioHinh,boolean ktradung) {
        super(id, image, chucai, tenhinh, audioChu, audioHinh);
        this.kiemtradung=ktradung;
    }
    public DapAnChu (ClassABC abc,boolean ktradung){
        super(abc.getId(),abc.getImage(),abc.getImageChuCai(),abc.getTextTenHinh(),abc.getAudioChu(),abc.getAudioHinh());
        this.kiemtradung=ktradung;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()){
            return  false;
        }
        DapAnChu dapAnChu=(DapAnChu) obj;
        return kiemtradung==dapAnChu.kiemtradung && super.getId()==dapAnChu.getId();
    }

}
