package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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

public class formulae_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulae_page);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // To set Status Bar colors same as app Bg
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.my_app_bg));
        }

        getSupportActionBar().hide();  // Hides the title of the app


        ImageView back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, MainActivity.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideRight(formulae_page.this);
            }
        });



        CardView algebra = findViewById(R.id.algebra);
        algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, algebra.class);
                startActivity(intent);
            }
        });

        CardView geometry = findViewById(R.id.geometry);
        geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, geometry.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(formulae_page.this);
            }
        });

        CardView trigo = findViewById(R.id.trigonometry);
        trigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, trigonometry.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(formulae_page.this);
            }
        });

        CardView calc = findViewById(R.id.calculus);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, calculus.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(formulae_page.this);
            }
        });

        CardView prob_and_stat = findViewById(R.id.pro_and_stat);
        prob_and_stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, prob_and_stat.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(formulae_page.this);
            }
        });

        CardView linear_algebra = findViewById(R.id.linerar_algebra);
        linear_algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formulae_page.this, linear_algebra.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(formulae_page.this);
            }
        });
    }
}