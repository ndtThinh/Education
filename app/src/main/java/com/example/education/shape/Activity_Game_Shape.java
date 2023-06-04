package com.example.education.shape;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.education.R;

public class Activity_Game_Shape extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnAmThanh;
    MediaPlayer amThanhGoiY;
    private MediaPlayer amThanhHieuUng;
    private CauHoiChonHinh cauHoiChonHinh;
    private TextView txtA;
    private TextView txtB;
    private TextView txtC;
    private TextView txtD;

    private ImageView ivAnhMoTa2;
    private ImageButton ibtnNextQuestion,btnReturn;
    private TextView[] listTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_shape);
        btnAmThanh = findViewById(R.id.ID_btnAmThanh);

        txtA = findViewById(R.id.ID_txtA);
        txtB = findViewById(R.id.ID_txtB);
        txtC = findViewById(R.id.ID_txtC);
        txtD = findViewById(R.id.ID_txtD);
        btnReturn=findViewById(R.id.returnGameHinh);
        ivAnhMoTa2 = findViewById(R.id.ID_imgAnhmota);
        ibtnNextQuestion = findViewById(R.id.ID_btnRight);
        listTextView = new TextView[]{txtA,txtB,txtC,txtD};

        for (TextView txtv: listTextView){
            txtv.setOnClickListener(this);
        }

        cauHoiChonHinh = new CauHoiChonHinh();

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
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int i = 0;
        switch (v.getId()){
            case R.id.ID_txtA:
                i = 0;
                break;
            case R.id.ID_txtB:
                i = 1;
                break;
            case R.id.ID_txtC:
                i = 2;
                break;
            case R.id.ID_txtD:
                i = 3;
                break;
        }

        if(cauHoiChonHinh.getDanhSachDapAn().get(i).isKiemTraDung()){
            amThanhHieuUng = MediaPlayer.create(this, R.raw.corrcet_sound);
            thietLapCauHoi();
        }
        else{
            amThanhHieuUng = MediaPlayer.create(this, R.raw.wrong_sound);
        }
        amThanhHieuUng.start();
    }
    public void thietLapCauHoi(){
        cauHoiChonHinh.sinhCauHoi();


        for(int i = 0; i < 4; i++){
            listTextView[i].setText(cauHoiChonHinh.getDanhSachDapAn().get(i).getTextImages());
        }
        DapAnHinh dapAnDung = cauHoiChonHinh.getDapAnDung();
        ivAnhMoTa2.setImageResource(dapAnDung.getImages());
        this.amThanhGoiY = MediaPlayer.create(this, dapAnDung.getSoundImages());
    }

}