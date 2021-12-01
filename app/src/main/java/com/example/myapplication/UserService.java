package com.example.myapplication;

import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.Call;

public interface UserService {
    @POST("login/")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);
}
