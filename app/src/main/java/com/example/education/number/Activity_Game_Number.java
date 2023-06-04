package com.example.education.number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.education.R;

public class Activity_Game_Number extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnAmThanh,btnReturn;
    private MediaPlayer amThanhGoiY;
    private MediaPlayer amThanhHieuUng;

    private CauHoiChonSo cauHoiChonSo;
    private ImageButton ibtnA;
    private ImageButton ibtnB;
    private ImageButton ibtnC;
    private ImageButton ibtnD;
    private ImageView ivAnhMoTa2;
    private ImageButton ibtnNextQuestion;
    private ImageButton[] listButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_number);

        btnAmThanh = findViewById(R.id.btnAmThanh2);

        ibtnA = findViewById(R.id.ibtnA);
        ibtnB = findViewById(R.id.ibtnB);
        ibtnC = findViewById(R.id.ibtnC);
        ibtnD = findViewById(R.id.ibtnD);
        btnReturn=findViewById(R.id.nutquaylai);
        ivAnhMoTa2 = findViewById(R.id.ivAnhMota2);
        ibtnNextQuestion = findViewById(R.id.ibtnNextQuestion);
        listButton = new ImageButton[]{ibtnA, ibtnB, ibtnC, ibtnD};


        for (ImageButton ibtn: listButton){
            ibtn.setOnClickListener(this);
        }

        cauHoiChonSo = new CauHoiChonSo();
        thietLapCauHoi();

        btnAmThanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amThanhGoiY.start();
            }
        });

        ibtnNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thietLapCauHoi();
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10= new Intent();
                setResult(110,i10);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int i = 0;
        switch (v.getId()){
            case R.id.ibtnA:
                i = 0;
                break;
            case R.id.ibtnB:
                i = 1;
                break;
            case R.id.ibtnC:
                i = 2;
                break;
            case R.id.ibtnD:
                i = 3;
                break;
        }

        if(cauHoiChonSo.getDanhSachDapAn().get(i).isKiemTraDung()){
            amThanhHieuUng = MediaPlayer.create(this, R.raw.corrcet_sound);
            thietLapCauHoi();
        }
        else{
            amThanhHieuUng = MediaPlayer.create(this, R.raw.wrong_sound);
        }
        amThanhHieuUng.start();
    }

    public void thietLapCauHoi(){
        cauHoiChonSo.sinhCauHoi();

        for(int i = 0; i < 4; i++){
            listButton[i].setBackgroundResource(cauHoiChonSo.getDanhSachDapAn().get(i).getAnhDaiDien());
        }
        DapAnSo dapAnDung = cauHoiChonSo.getDapAnDung();
        ivAnhMoTa2.setImageResource(dapAnDung.getAnhMoTa());
        this.amThanhGoiY = MediaPlayer.create(this, dapAnDung.getAmThanh());
    }
}