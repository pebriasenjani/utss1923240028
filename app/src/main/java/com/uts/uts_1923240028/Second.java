package com.uts.uts_1923240028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView tvNamaLengkap, tvNoPend, tvJalur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNamaLengkap = findViewById(R.id.tv_nama);
        tvNoPend = findViewById(R.id.tv_no_pend);
        tvJalur = findViewById(R.id.tv_jalur);

        Intent ambil = getIntent();
        tvNamaLengkap.setText(ambil.getStringExtra("vrNama"));
        tvNoPend.setText(ambil.getStringExtra("vrNoPend"));
        tvJalur.setText(ambil.getStringExtra("varSpinr"));

    }
}