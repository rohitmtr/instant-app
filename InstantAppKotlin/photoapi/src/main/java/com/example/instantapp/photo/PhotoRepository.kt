package com.example.instantapp.photo

import io.reactivex.Single

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */
interface PhotoRepository {
    fun getPhotos():Single<List<Photo>>
}