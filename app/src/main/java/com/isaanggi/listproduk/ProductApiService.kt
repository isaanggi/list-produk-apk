package com.isaanggi.listproduk

import retrofit2.Call
import retrofit2.http.GET

interface ProductApiService {
    @GET("products")
    fun getProducts(): Call<ProductResponse>
}