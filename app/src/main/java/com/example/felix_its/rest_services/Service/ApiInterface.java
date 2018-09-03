package com.example.felix_its.rest_services.Service;

import com.example.felix_its.rest_services.Model.BaseResponse;
import com.example.felix_its.rest_services.Model.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/myapp/api/employees/single")

    public Call<BaseResponse> addEmployee(@Body Employee employee);
}



