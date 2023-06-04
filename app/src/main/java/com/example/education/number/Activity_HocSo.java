package com.example.education.number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.education.R;

import java.util.ArrayList;

public class Activity_HocSo extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivMot;
    private ImageView ivHai;
    private ImageView ivBa;
    private ImageView ivBon;
    private ImageView ivNam;
    private ImageView ivSau;
    private ImageView ivBay;
    private ImageView ivTam;
    private ImageView ivChin;
    private ImageView ivMuoi;

    private ImageButton btnReturn;

    private ArrayList<So> lst = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hoc_so);

        ivMot = findViewById(R.id.ivMot);
        ivHai = findViewById(R.id.ivHai);
        ivBa = findViewById(R.id.ivBa);
        ivBon = findViewById(R.id.ivBon);
        ivNam = findViewById(R.id.ivNam);
        ivSau = findViewById(R.id.ivSau);
        ivBay = findViewById(R.id.ivBay);
        ivTam = findViewById(R.id.ivTam);
        ivChin = findViewById(R.id.ivChin);
        ivMuoi = findViewById(R.id.ivMuoi);
        btnReturn=findViewById(R.id.btnreturn123);

        ivMot.setOnClickListener(this);
        ivHai.setOnClickListener(this);
        ivBa.setOnClickListener(this);
        ivBon.setOnClickListener(this);
        ivNam.setOnClickListener(this);
        ivSau.setOnClickListener(this);
        ivBay.setOnClickListener(this);
        ivTam.setOnClickListener(this);
        ivChin.setOnClickListener(this);
        ivMuoi.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ivMot:
            case R.id.ivHai:
            case R.id.ivBa:
            case R.id.ivBon:
            case R.id.ivNam:
            case R.id.ivSau:
            case R.id.ivBay:
            case R.id.ivTam:
            case R.id.ivChin:
            case R.id.ivMuoi:
                Intent intent = new Intent(Activity_HocSo.this, Activity_ChiTietHocSo.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", v.getId());
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.btnreturn123:
                Intent intent1= new Intent();
                setResult(10,intent1);
                finish();
                break;
        }
    }
}