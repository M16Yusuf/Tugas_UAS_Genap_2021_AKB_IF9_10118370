package com.m16yusuf.diappaja10118370.view;
//Nama : Muhammad Yusuf
//Kelas : IF-9
//NIM : 10118370
//tanggal : Selasa, 10 Agustus 2021
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.m16yusuf.diappaja10118370.MainActivity;
import com.m16yusuf.diappaja10118370.R;

public class AboutActivity extends AppCompatActivity {

    private MaterialButton buttonKembali;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        buttonKembali = findViewById(R.id.buttonback);

        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }
}