package com.example.listingnews.network

import com.example.listingnews.model.GetAllNewsResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("news")
    fun getAllDataNews() : Call<List<GetAllNewsResponseItem>>

}