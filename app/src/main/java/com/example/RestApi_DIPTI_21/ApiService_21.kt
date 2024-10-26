package com.example.RestApi_DIPTI_21

import retrofit2.http.GET

interface ApiService_21 {
    @GET("products")
    suspend fun getProducts(): List<Product_21>
}