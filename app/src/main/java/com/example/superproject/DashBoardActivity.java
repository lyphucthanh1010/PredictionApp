package com.example.superproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity {
    List<ImageSlider> ListAsset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        ListAsset = new ArrayList<>();
//        ImageSlider imageSlider = findViewById(R.id.imgslider);
//        ArrayList<SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel(R.drawable.uit, ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.nc, ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.deep, ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.aqi, ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.air, ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.iot,ScaleTypes.FIT));
//        slideModels.add(new SlideModel(R.drawable.smartcity,ScaleTypes.FIT));
//        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

//        LinearLayout lnl1 = findViewById(R.id.lnl1);
//        lnl1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, OpenRemoteActivity.class));
//            }
//        });
//        LinearLayout lnl5 = findViewById(R.id.linearsettings);
//        lnl5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, SettingActivity.class));
//            }
//        });
//        LinearLayout lnl6 = findViewById(R.id.linearprofile);
//        lnl6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, AccountActivity.class));
//            }
//        });
//        LinearLayout lnl2 = findViewById(R.id.lineardevice);
//        lnl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, DeviceActivity.class));
//            }
//        });
//        LinearLayout lnl3 = findViewById(R.id.lnl3);
//        lnl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, GraphActivity.class));
//            }
//        });
//        LinearLayout lnl4 = findViewById(R.id.linearnoti);
//        lnl4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, NotificationActivity.class));
//            }
//        });
//        ImageView img = findViewById(R.id.imageinfo);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DashBoardActivity.this, AccountActivity.class));
//            }
//        });
    }
}