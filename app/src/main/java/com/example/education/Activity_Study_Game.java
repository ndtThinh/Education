package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.education.abc.Activity_Game_ABC;
import com.example.education.abc.Activity_HocChuCai;
import com.example.education.number.Activity_Game_Number;
import com.example.education.number.Activity_HocSo;
import com.example.education.shape.Activity_Game_Shape;
import com.example.education.shape.Activity_HocHinh;

public class Activity_Study_Game extends AppCompatActivity {
    ImageButton btnHoc,btnChoi,btnReturn;
    public  int id ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_study_game);
        btnHoc=findViewById(R.id.btnhoc);
        btnChoi=findViewById(R.id.btnChoi);
        btnReturn=findViewById(R.id.quaylai);

        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        id=b.getInt("state");
        //Toast.makeText(this, ""+id, Toast.LENGTH_SHORT).show();

        btnHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id==1){
                    Intent intent1= new Intent(Activity_Study_Game.this, Activity_HocChuCai.class);
                    startActivity(intent1);
                    return;
                }
                else if(id==2){
                    Intent intent2= new Intent(Activity_Study_Game.this, Activity_HocSo.class);
                    startActivity(intent2);
                    return;
                }
                else if (id==3){
                    Intent intent3= new Intent(Activity_Study_Game.this, Activity_HocHinh.class);
                    startActivity(intent3);
                    return;
                }
            }
        });
        btnChoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id==1){
                    Intent intent1= new Intent(Activity_Study_Game.this, Activity_Game_ABC.class);
                    startActivity(intent1);
                }
                if(id==2){
                    Intent intent1= new Intent(Activity_Study_Game.this, Activity_Game_Number.class);
                    startActivity(intent1);
                }
                if (id==3){
                    Intent intent1= new Intent(Activity_Study_Game.this, Activity_Game_Shape.class);
                    startActivity(intent1);
                }
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}