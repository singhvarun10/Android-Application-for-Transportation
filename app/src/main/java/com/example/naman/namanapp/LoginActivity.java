package com.example.naman.namanapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.naman.namanapp.activities.AdminActivity;
import com.example.naman.namanapp.activities.DriverActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnAdmin, btnDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnAdmin = findViewById(R.id.btnAdmin);
        btnDriver = findViewById(R.id.btnDriver);

        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, AdminActivity.class));
            }
        });

        btnDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, DriverActivity.class));
            }
        });

    }
}
