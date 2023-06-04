package com.example.education.abc;

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

public class Activity_ChiTietHocChuCai extends AppCompatActivity {
    public int index;
    ImageView imgViewAnh;
    TextView txtTenhinh;
    ImageButton btnreturnimage,btntang,btngiam,btnchucai,btnsoundchucai;
    public MediaPlayer playerChu,playerHinh;
    int audioHinh,audioChu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_abc);


        imgViewAnh=findViewById(R.id.imageViewhinhhienthi);
        btnchucai=findViewById(R.id.texttenchucai);
        txtTenhinh=findViewById(R.id.textView2);
        btngiam=findViewById(R.id.button3);
        btntang=findViewById(R.id.button4);
        btnreturnimage=findViewById(R.id.buttonreturn);
        btnsoundchucai=findViewById(R.id.btnsoundchucai);


        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int id=bundle.getInt("Id");
        for(int i = 0; i< DuLieu.ChuCai.length; i++){
            if(DuLieu.ChuCai[i].getId()==id){
                index=i;
                break;
            }
        }
        imgViewAnh.setBackgroundResource((DuLieu.ChuCai[index].getImage()));
        btnchucai.setBackgroundResource(DuLieu.ChuCai[index].getImageChuCai());
        txtTenhinh.setText((DuLieu.ChuCai[index].getTextTenHinh()));
        audioHinh=DuLieu.ChuCai[index].getAudioHinh();
        audioChu=DuLieu.ChuCai[index].getAudioChu();

        btnsoundchucai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play(playerChu,audioChu);
            }
        });
        btntang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                if (index==DuLieu.ChuCai.length){
                    index=0;
                }
                imgViewAnh.setBackgroundResource(DuLieu.ChuCai[index].getImage());
                btnchucai.setBackgroundResource(DuLieu.ChuCai[index].getImageChuCai());
                txtTenhinh.setText(DuLieu.ChuCai[index].getTextTenHinh());
                audioHinh=DuLieu.ChuCai[index].getAudioHinh();
                audioChu=DuLieu.ChuCai[index].getAudioChu();


            }
        });
        btngiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if(index<0){
                    index=DuLieu.ChuCai.length-1;
                }
                imgViewAnh.setBackgroundResource(DuLieu.ChuCai[index].getImage());
                btnchucai.setBackgroundResource(DuLieu.ChuCai[index].getImageChuCai());
                txtTenhinh.setText(DuLieu.ChuCai[index].getTextTenHinh());
                audioHinh=DuLieu.ChuCai[index].getAudioHinh();
                audioChu=DuLieu.ChuCai[index].getAudioChu();



            }
        });
        imgViewAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play(playerHinh,audioHinh);
            }
        });

        //RETURN
        btnreturnimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    public  void Play(MediaPlayer player,int audio){
        if(player==null){
            player= MediaPlayer.create(this,audio);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    StopPlayer(mediaPlayer);
                }
            });
        }
        player.start();
    }
    private void StopPlayer(MediaPlayer player){
        if(player!=null){
            player.release();
            player=null;
        }
    }
}