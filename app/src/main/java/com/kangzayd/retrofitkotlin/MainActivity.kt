package com.kangzayd.retrofitkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api: ApiInterface = ApiCall().connect().create(ApiInterface::class.java)
        val getData: Call<Response> = api.getData("1")
        getData.enqueue(object : Callback<Response> {
            override fun onFailure(call: Call<Response>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>?) {
                textTes.text = response?.body()?.title
            }

        })
    }
}
