package com.example.education.shape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.education.R;
import com.example.education.data.DuLieu;

public class Activity_ChiTietHocHinh extends AppCompatActivity {
    private geometry currentGeometry ;

    private ImageView imgGeometry;
    private TextView txtGeometry;
    private ImageButton btnReturn;

    private ImageButton imgBTLeft,imgBTRight;
    private int currentGeometryIndex = 1;

    private int currentIndex ;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chi_tiet_hoc_hinh);


        currentGeometry = new geometry();
        imgGeometry = findViewById(R.id.ID_imageGeometry);
        txtGeometry = findViewById(R.id.ID_NameGeometry);
        imgBTLeft = findViewById(R.id.ID_ImBtLeft);
        imgBTRight = findViewById(R.id.ID_ImBtRight);

        currentGeometry = DuLieu.detailGeometry1[1];
        imgGeometry.setImageResource(currentGeometry.getImages());
        txtGeometry.setText(currentGeometry.getTextImages());
        btnReturn=findViewById(R.id.ChitietHocHinhQuayLai);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int id=bundle.getInt("Id");
        for(int i=0;i<DuLieu.detailGeometry1.length;i++){
            if(DuLieu.detailGeometry1[i].getId()==id){
                currentIndex=i;
                break;
            }
        }
        displayCurrentGeometry(imgGeometry,txtGeometry);

        imgGeometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(imgGeometry.getContext(),currentGeometry.getSoundImages());
                mediaPlayer.start();

            }
        });


        imgBTLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex == 0) {
                    currentIndex = DuLieu.detailGeometry1.length - 1;
                } else {
                    currentIndex--;
                }
                displayCurrentGeometry(imgGeometry, txtGeometry);
            }
        });
        imgBTRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex == DuLieu.detailGeometry1.length - 1) {
                    currentIndex = 0;
                } else {
                    currentIndex++;
                }
                displayCurrentGeometry(imgGeometry, txtGeometry);
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void displayCurrentGeometry(ImageView imageView, TextView textView) {
        currentGeometry = DuLieu.detailGeometry1[currentIndex];
        imageView.setImageResource(currentGeometry.getImages());
        textView.setText(currentGeometry.getTextImages());

    }
}