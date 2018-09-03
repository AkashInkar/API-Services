package com.example.felix_its.rest_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnadd,btnview,btnupdate,btndelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = findViewById(R.id.btnadd);
        btnview = findViewById(R.id.btnview);
        btnupdate = findViewById(R.id.btnupdate);
        btndelete = findViewById(R.id.btndelete);
    }

    public void addEmployee(View view) {
        Intent intent = new Intent(MainActivity.this,Add_EmployeeActivity.class);
        startActivity(intent);
    }

    public void viewEmployee(View view) {
    }

    public void updateEmployee(View view) {
    }

    public void deleteEmployee(View view) {
    }
}
