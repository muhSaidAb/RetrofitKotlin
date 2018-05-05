package com.kangzayd.retrofitkotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ApiCall {

    fun connect() : Retrofit{
        val retrofit = Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit
    }
}