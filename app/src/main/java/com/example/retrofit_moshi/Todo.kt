package com.example.retrofit_moshi

data class Todo(
    val userId: Int = 0,
    val id: Int = 0,
    val title: String = "",
    val completed: Boolean = false,
)