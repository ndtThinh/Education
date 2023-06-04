package com.example.education.shape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.education.R;

public class Activity_HocHinh extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgTriangle,imgRectangle,imgCircle,imgRhombus,imgParallelogram,imgSquere;
    ImageButton imgOctagon,imgHexagon,imgCylinder,imgCone,imgRectangular,imgPentagon;
    ImageButton btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hoc_hinh);

        imgTriangle = findViewById(R.id.BtnID_beforeTriangle);
        imgRectangle = findViewById(R.id.BtnID_beforeRectangle);
        imgCircle = findViewById(R.id.BtnID_beforeCircle);
        imgRhombus = findViewById(R.id.BtnID_beforeRhombus);
        imgParallelogram = findViewById(R.id.BtnID_beforeParallelogram);
        imgSquere = findViewById(R.id.BtnID_beforeSquere);
        imgOctagon = findViewById(R.id.BtnID_beforeOctagon);
        imgHexagon = findViewById(R.id.BtnID_beforeHexagon);
        imgCylinder = findViewById(R.id.BtnID_beforeCylinder);
        imgCone = findViewById(R.id.BtnID_beforeCone);
        imgRectangular = findViewById(R.id.BtnID_beforeRectangular);
        imgPentagon = findViewById(R.id.BtnID_beforePentagon);
        btnReturn=findViewById(R.id.returnShape);

        imgTriangle.setOnClickListener(this);
        imgRectangle.setOnClickListener(this);
        imgCircle.setOnClickListener(this);
        imgRhombus.setOnClickListener(this);
        imgParallelogram.setOnClickListener(this);
        imgSquere.setOnClickListener(this);
        imgOctagon.setOnClickListener(this);
        imgHexagon.setOnClickListener(this);
        imgCylinder.setOnClickListener(this);
        imgCone.setOnClickListener(this);
        imgRectangular.setOnClickListener(this);
        imgPentagon.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnID_beforeTriangle:
            case R.id.BtnID_beforeRectangle:
            case R.id.BtnID_beforeCircle:
            case R.id.BtnID_beforeRhombus:
            case R.id.BtnID_beforeParallelogram:
            case R.id.BtnID_beforeSquere:
            case R.id.BtnID_beforeOctagon:
            case R.id.BtnID_beforeHexagon:
            case R.id.BtnID_beforeCylinder:
            case R.id.BtnID_beforeCone:
            case R.id.BtnID_beforeRectangular:
            case R.id.BtnID_beforePentagon:
                Intent intent= new Intent(Activity_HocHinh.this,Activity_ChiTietHocHinh.class);
                Bundle bundle= new Bundle();
                bundle.putInt("Id",v.getId());
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.returnShape:

                finish();
                break;
        }
    }
}