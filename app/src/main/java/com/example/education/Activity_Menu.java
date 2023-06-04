package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Activity_Menu extends AppCompatActivity {
    ImageButton btnabc;
    ImageButton btn123,btnHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        btnabc=findViewById(R.id.btnABC);
        btn123=findViewById(R.id.btn123);
        btnHinh=findViewById(R.id.btnHinhHoc);

        Intent intent = new Intent(Activity_Menu.this, Activity_Study_Game.class);

        btnabc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("state",1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("state",2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btnHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("state",3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

}