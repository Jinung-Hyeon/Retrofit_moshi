package com.example.retrofit_moshi

import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET("/todos")
    suspend fun getTodos(): List<Todo>
}