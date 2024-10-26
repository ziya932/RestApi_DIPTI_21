package com.example.RestApi_DIPTI_21

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance_21 {


    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())

        .build()



    val apiService = retrofit.create(ApiService_21::class.java)

}