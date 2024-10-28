package com.example.mahasiswa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


            public class MainActivity extends AppCompatActivity {


                private EditText mNama;
                private EditText mNik;
                private EditText mUmur;
                private EditText mAlamat;
                private EditText mAsalSekolah;


                private TextView tNama;
                private TextView tNik;
                private TextView tUmur;
                private TextView tAlamat;
                private TextView tAsalSekolah;
                private Button btn1;

                private View.OnClickListener onClickListener = new View.OnClickListener() {
                    public void onClick(View v){
                        save(v);
                    }
                };;


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    EdgeToEdge.enable(this);
                    setContentView(R.layout.activity_main);
                    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                        return insets;
                    });


                    mNama = findViewById(R.id.inputNama);
                    mNik = findViewById(R.id.inputNik);
                    mUmur = findViewById(R.id.inputUmur);
                    mAlamat = findViewById(R.id.inputAlamat);
                    mAsalSekolah = findViewById(R.id.inputAsalSekolah);


                    tNama = findViewById(R.id.txtNama);
                    tNik = findViewById(R.id.txtNik);
                    tUmur = findViewById(R.id.txtUmur);
                    tAlamat = findViewById(R.id.txtAlamat);
                    tAsalSekolah = findViewById(R.id.txtAsalSekolah);
                    btn1 = findViewById(R.id.button1);
                    btn1.setOnClickListener(onClickListener);



                }


                public void save(View view) {


                    String nama = mNama.getText().toString();
                    String nik = mNik.getText().toString();
                    String umur = mUmur.getText().toString();
                    String alamat = mAlamat.getText().toString();
                    String asalSekolah = mAsalSekolah.getText().toString();


                    tNama .setText(nama);
                    tNik.setText(nik);
                    tUmur.setText(umur);
                    tAlamat.setText(alamat);
                    tAsalSekolah.setText(asalSekolah);


                }

            }