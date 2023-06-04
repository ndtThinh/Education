package com.example.education.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.education.R;

public class Activity_Game_ABC extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnSoundCauHoi;
    private MediaPlayer amThanhGoiY;
    private MediaPlayer amThanhHieuUng;
    private CauHoiChonChuCai cauHoiChonChuCai;
    private ImageButton ibtnA,ibtnB,ibtnC,ibtnD;
    private ImageButton btnNext,btnReturn;
    private ImageButton[]listButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_abc);

        btnSoundCauHoi=findViewById(R.id.btnSoundCauhoi);
        ibtnA=findViewById(R.id.btnDA1);
        ibtnB=findViewById(R.id.btnDA2);
        ibtnC=findViewById(R.id.btnDA3);
        ibtnD=findViewById(R.id.btnDA4);
        btnNext=findViewById(R.id.btnNext);
        btnReturn=findViewById(R.id.buttonreturn);

        listButton = new ImageButton[]{ibtnA, ibtnB, ibtnC, ibtnD,btnReturn};
        for (ImageButton ibtn: listButton){
            ibtn.setOnClickListener(this);
        }
        cauHoiChonChuCai= new CauHoiChonChuCai();
        thietLapCauHoi();

        btnSoundCauHoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amThanhGoiY.start();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thietLapCauHoi();
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int i = 0;
        switch (v.getId()){
            case R.id.btnDA1:
                i = 0;
                break;
            case R.id.btnDA2:
                i = 1;
                break;
            case R.id.btnDA3:
                i = 2;
                break;
            case R.id.btnDA4:
                i = 3;
                break;

        }
        if(cauHoiChonChuCai.getDsDapAn().get(i).isCheckTrue()){
            amThanhHieuUng = MediaPlayer.create(this, R.raw.corrcet_sound);
            thietLapCauHoi();

        }
        else{
            amThanhHieuUng = MediaPlayer.create(this, R.raw.wrong_sound);

        }
        amThanhHieuUng.start();
    }
    public void thietLapCauHoi(){
        cauHoiChonChuCai.sinhCauHoi();
        for(int i = 0; i < 4; i++){
            listButton[i].setBackgroundResource(cauHoiChonChuCai.getDsDapAn().get(i).getImageChuCai());
        }
        DapAnChu dapAnDung = cauHoiChonChuCai.getDapAnDung();
        this.amThanhGoiY = MediaPlayer.create(this, dapAnDung.getAudioChu());
        this.amThanhGoiY.start();
    }
}