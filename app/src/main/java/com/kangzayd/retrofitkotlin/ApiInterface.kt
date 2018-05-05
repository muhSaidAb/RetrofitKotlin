package com.kangzayd.retrofitkotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {
    @GET("posts/{id}")
    fun getData(@Path("id") id: String): Call<Response>
}