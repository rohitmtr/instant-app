package com.example.instantapp


import com.example.instantapp.model.PhotoComment
import io.reactivex.Single
import retrofit2.http.GET

interface PhotoCommentApi {

    @GET("/list")
    fun getFeeds(photoId: Long):Single<List<PhotoComment>>

    companion object {
        val ENDPOINT = "https://unsplash.it"
    }
}