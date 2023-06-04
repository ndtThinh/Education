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
import com.example.education.data.DuLieu;

public class Activity_ChiTietHocSo extends AppCompatActivity {
    private MediaPlayer amThanh;
    private ImageButton btnAmThanh;

    private So so;

    private ImageView ivAnhDaiDien;
    private ImageView ivAnhMoTa;
    private ImageButton ibtnPrev;
    private ImageButton ibtnNext,btnReturn;

    private int chiSoHienTai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chi_tiet_hoc_so);

        btnAmThanh = findViewById(R.id.btnAmThanh);
        ivAnhDaiDien = findViewById(R.id.ivAnhDaiDien);
        ivAnhMoTa = findViewById(R.id.ivAnhMoTa);
        ibtnPrev = findViewById(R.id.ibtnPrev);
        ibtnNext = findViewById(R.id.ibtnNext);
        btnReturn=findViewById(R.id.chitietHocSoQuayLai);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        int id = bundle.getInt("id");

        int chiSo = -1;
        for (So s : DuLieu.danhSachSo) {
            chiSo++;
            if(id == s.getId()){
                this.so = s;
                chiSoHienTai = chiSo;
                break;
            }
        }
        setTaiNguyen();

        btnAmThanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chayAmThanh();
            }
        });

        ibtnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chiSoHienTai == 0){
                    chiSoHienTai = 9;
                }else{
                    chiSoHienTai--;
                }

                so = DuLieu.danhSachSo[chiSoHienTai];
                setTaiNguyen();
            }
        });

        ibtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chiSoHienTai == 9){
                    chiSoHienTai = 0;
                }else{
                    chiSoHienTai++;
                }

                so = DuLieu.danhSachSo[chiSoHienTai];
                setTaiNguyen();
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent();
                setResult(120,ii);
                finish();
            }
        });
    }
    public  void chayAmThanh(){
        amThanh = MediaPlayer.create(this, so.getAmThanh());
        amThanh.start();
    }

    public void setTaiNguyen(){
        ivAnhDaiDien.setImageResource(so.getAnhDaiDien());
        ivAnhMoTa.setImageResource(so.getAnhMoTa());
    }
}