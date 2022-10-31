package com.uts.uts_1923240028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNama,etNomorpe;
    private CheckBox checkBox12;
    private Spinner spinner1;
    private Button buttn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.et_namalngkp);
        etNomorpe = findViewById(R.id.et_nomorp);
        checkBox12 = findViewById(R.id.checkbox1);
        spinner1   = findViewById(R.id.Spinner);
        buttn  = findViewById(R.id.btn_dftr);

        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaLen, noPend, spinr;
            namaLen = etNama.getText().toString();
            noPend = etNomorpe.getText().toString();
            spinr = spinner1.getSelectedItem().toString();
            if (namaLen.trim().equals("")){
                    etNama.setError("Set error!");
                }
            else if (noPend.trim().equals("")){
                etNomorpe.setError("Set error!");
            }

                else if (spinr.trim().equals("jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "pilih jalur pendaftaran!", Toast.LENGTH_SHORT).show();
                }
                else if (!(checkBox12.isChecked())){
                    Toast.makeText(MainActivity.this, "check box belum dicentang", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent = new
                            Intent(MainActivity.this, Second.class);
                            intent.putExtra("vrNama", namaLen);
                            intent.putExtra("vrNoPend", noPend);
                            intent.putExtra("varSpinr", spinr);
                            startActivity(intent);

            }
        }
    });
}}