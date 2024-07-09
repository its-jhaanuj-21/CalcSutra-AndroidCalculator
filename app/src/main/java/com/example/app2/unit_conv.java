package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class unit_conv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conv);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().hide();  // Hides the title of the app

        // To set Status Bar colors same as app Bg
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.my_app_bg));
        }

        ImageView back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, MainActivity.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideRight(unit_conv.this);
            }
        });

        ImageView area = findViewById(R.id.btn_area);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, area_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView speed = findViewById(R.id.btn_speed);
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, speed_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView volume = findViewById(R.id.btn_volume);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, volume_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView weight = findViewById(R.id.btn_weight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, weight_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView length = findViewById(R.id.btn_length);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, length_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView currency = findViewById(R.id.btn_memory);
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, memory_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

        ImageView temp = findViewById(R.id.btn_temperature);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(unit_conv.this, temperature_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(unit_conv.this);
            }
        });

    }
}