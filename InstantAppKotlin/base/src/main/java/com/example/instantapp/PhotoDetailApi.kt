package com.example.instantapp

import com.example.instantapp.model.PhotoDetail
import io.reactivex.Single
import retrofit2.http.GET

interface PhotoDetailApi {

    @GET("/list")
    fun getFeeds(photoId: Long): Single<List<PhotoDetail>>

    companion object {
        val ENDPOINT = "https://unsplash.it"
    }
}