package com.aptech.blood_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

   EditText etName,etEmail,etPassword,etNic,etNo;
   Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    init();

    }

    private void init() {

        etName = (EditText)findViewById(R.id.etName);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etNic = (EditText)findViewById(R.id.etNic);
        etNo = (EditText)findViewById(R.id.etNo);
        btnRegister = (Button)findViewById(R.id.btnRegister);

    }
}