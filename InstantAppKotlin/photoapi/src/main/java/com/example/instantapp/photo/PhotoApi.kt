package com.example.instantapp.photo

import io.reactivex.Single
import retrofit2.http.GET

interface PhotoApi {

    @GET("/list")
    fun getFeeds(): Single<List<Photo>>

    companion object {
        val ENDPOINT = "https://unsplash.it"
    }
}