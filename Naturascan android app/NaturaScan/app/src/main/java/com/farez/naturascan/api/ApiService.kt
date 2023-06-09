package com.farez.naturascan.api

import com.farez.naturascan.data.remote.response.LoginResponse
import com.farez.naturascan.data.remote.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<LoginResponse>

    @FormUrlEncoded
    @POST("daftar")
    fun register(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<RegisterResponse>

}