package com.example.uts_pemograman_mobile;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button tombol;
    EditText editTextName, editTextEmail, editTextPhone;
    RadioGroup radioGroupGender;
    CheckBox checkBoxSport, checkBoxCoding, checkBoxReading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen
        tombol = findViewById(R.id.button);
        editTextName = findViewById(R.id.editTextText);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        checkBoxSport = findViewById(R.id.checkBox);
        checkBoxCoding = findViewById(R.id.checkBox2);
        checkBoxReading = findViewById(R.id.checkBox3);

        // Set listener untuk tombol
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil input dari EditText
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String phone = editTextPhone.getText().toString();

                // Mengambil input dari RadioButton
                String gender = "";
                int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
                if (selectedGenderId != -1) {
                    RadioButton selectedGender = findViewById(selectedGenderId);
                    gender = selectedGender.getText().toString();
                }

                // Mengambil input dari CheckBox
                StringBuilder hobbies = new StringBuilder();
                if (checkBoxSport.isChecked()) {
                    hobbies.append(checkBoxSport.getText()).append(" ");
                }
                if (checkBoxCoding.isChecked()) {
                    hobbies.append(checkBoxCoding.getText()).append(" ");
                }
                if (checkBoxReading.isChecked()) {
                    hobbies.append(checkBoxReading.getText()).append(" ");
                }

                // Menampilkan informasi satu persatu
                displayToastOneByOne(name, email, phone, gender, hobbies.toString().trim());
            }
        });
    }

    private void displayToastOneByOne(String name, String email, String phone, String gender, String hobbies) {
        Handler handler = new Handler();
        int delay = 2000; // delay 2 detik

        // Tampilkan Nama
        handler.postDelayed(() -> Toast.makeText(MainActivity.this, "Nama: " + name, Toast.LENGTH_SHORT).show(), delay);

        // Tampilkan Email
        handler.postDelayed(() -> Toast.makeText(MainActivity.this, "Email: " + email, Toast.LENGTH_SHORT).show(), delay * 2);

        // Tampilkan Telepon
        handler.postDelayed(() -> Toast.makeText(MainActivity.this, "Telepon: " + phone, Toast.LENGTH_SHORT).show(), delay * 3);

        // Tampilkan Jenis Kelamin
        handler.postDelayed(() -> Toast.makeText(MainActivity.this, "Jenis Kelamin: " + gender, Toast.LENGTH_SHORT).show(), delay * 4);

        // Tampilkan Hobi
        handler.postDelayed(() -> Toast.makeText(MainActivity.this, "Hobi: " + hobbies, Toast.LENGTH_SHORT).show(), delay * 5);
    }
}
