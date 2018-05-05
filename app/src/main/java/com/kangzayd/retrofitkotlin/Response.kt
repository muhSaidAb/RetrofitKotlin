package com.kangzayd.retrofitkotlin

import com.google.gson.annotations.SerializedName

data class Response(

        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("title")
        val title: String? = null,

        @field:SerializedName("body")
        val body: String? = null,

        @field:SerializedName("userId")
        val userId: Int? = null
)