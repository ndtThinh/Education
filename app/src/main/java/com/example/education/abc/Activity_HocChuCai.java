package com.example.education.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.education.R;

public class Activity_HocChuCai extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnA,btnA1,btnA2,btnB,btnC,btnD,btnD1,btnE,btnE1,btnG,btnH,btnI,btnK,btnL;
    private ImageButton btnM,btnN,btnO,btnO1,btnO2,btnP,btnQ,btnR,btnS,btnT,btnU,btnU1,btnV,btnX,btnY;
    private ImageButton btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_abc);
        btnA=findViewById(R.id.btnA);
        btnA1=findViewById(R.id.btnA1);
        btnA2=findViewById(R.id.btnA2);
        btnB=findViewById(R.id.btnB);
        btnC=findViewById(R.id.btnC);
        btnD=findViewById(R.id.btnD);
        btnD1=findViewById(R.id.btnD1);
        btnE=findViewById(R.id.btnE);
        btnE1=findViewById(R.id.btnE1);
        btnG=findViewById(R.id.btnG);
        btnH=findViewById(R.id.btnH);
        btnI=findViewById(R.id.btnI);
        btnK=findViewById(R.id.btnK);
        btnL=findViewById(R.id.btnL);
        btnM=findViewById(R.id.btnM);
        btnN=findViewById(R.id.btnN);
        btnO=findViewById(R.id.btnO);
        btnO1=findViewById(R.id.btnO1);
        btnO2=findViewById(R.id.btnO2);
        btnO2=findViewById(R.id.btnO2);
        btnP=findViewById(R.id.btnP);
        btnQ=findViewById(R.id.btnQ);
        btnR=findViewById(R.id.btnR);
        btnS=findViewById(R.id.btnS);
        btnT=findViewById(R.id.btnT);
        btnU=findViewById(R.id.btnU);
        btnU1=findViewById(R.id.btnU1);
        btnV=findViewById(R.id.btnV);
        btnX=findViewById(R.id.btnX);
        btnY=findViewById(R.id.btnY);
        btnReturn=findViewById(R.id.btnReturn);


        btnA.setOnClickListener(this);
        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnD1.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnE1.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnN.setOnClickListener(this);
        btnO.setOnClickListener(this);
        btnO1.setOnClickListener(this);
        btnO2.setOnClickListener(this);
        btnP.setOnClickListener(this);
        btnQ.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnT.setOnClickListener(this);
        btnU.setOnClickListener(this);
        btnU1.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnY.setOnClickListener(this);
        btnV.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnA:
            case R.id.btnA1:
            case R.id.btnA2:
            case R.id.btnB:
            case R.id.btnC:
            case R.id.btnD:
            case R.id.btnD1:
            case R.id.btnE:
            case R.id.btnE1:
            case R.id.btnG:
            case R.id.btnH:
            case R.id.btnI:
            case R.id.btnK:
            case R.id.btnL:
            case R.id.btnM:
            case R.id.btnN:
            case R.id.btnO:
            case R.id.btnO1:
            case R.id.btnO2:
            case R.id.btnP:
            case R.id.btnQ:
            case R.id.btnR:
            case R.id.btnS:
            case R.id.btnT:
            case R.id.btnU:
            case R.id.btnU1:
            case R.id.btnV:
            case R.id.btnX:
            case R.id.btnY:
                Intent intent= new Intent(Activity_HocChuCai.this, Activity_ChiTietHocChuCai.class);
                Bundle bundle= new Bundle();
                bundle.putInt("Id",v.getId());
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.btnReturn:

                finish();
                break;
        }
    }

}