package com.example.felix_its.rest_services;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.felix_its.rest_services.Model.BaseResponse;
import com.example.felix_its.rest_services.Model.Employee;
import com.example.felix_its.rest_services.Service.ApiClient;
import com.example.felix_its.rest_services.Service.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Add_EmployeeActivity extends AppCompatActivity {
    EditText edtname,edtaddress,edtphone,edtsalary,edtdesignation;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__employee);
        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtphone = findViewById(R.id.edtphone);
        edtsalary = findViewById(R.id.edtsalary);
        edtdesignation = findViewById(R.id.edtdesignation);
        btnsave = findViewById(R.id.btnsave);
    }


    public void addToServer(View view) {
        String name = edtname.getText().toString().trim();
        String address = edtaddress.getText().toString().trim();
        String phonenumber = edtphone.getText().toString().trim();
        String salaryString = edtsalary.getText().toString().trim();
        String designation = edtdesignation.getText().toString().trim();

        if (TextUtils.isEmpty(name) ||TextUtils.isEmpty(address) ||TextUtils.isEmpty(phonenumber)  ||TextUtils.isEmpty(salaryString) ||TextUtils.isEmpty(designation)){
            Toast.makeText(getApplicationContext(),"Plz Enter the data",Toast.LENGTH_SHORT).show();
        }
        long salary = Long.parseLong(salaryString);
        Employee employee = new Employee(name,address,phonenumber,salary,designation);


       // ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
       // Call<BaseResponse> call = apiInterface.addEmployee(employee);


        //call.enqueue(new Callback<BaseResponse>() {


            ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

            Call<BaseResponse> call = apiInterface.addEmployee(employee);
             call.enqueue(new Callback<BaseResponse>() {

            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                BaseResponse baseResponse = response.body();
                //Toast.makeText(getApplicationContext(),"Data is Added"+baseResponse,Toast.LENGTH_SHORT).show();
                Toast.makeText(Add_EmployeeActivity.this,baseResponse.getMessage(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {

            }
        });

    }
}
