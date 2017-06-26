package com.example.instantapp.photo

import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */
class PhotoRepositoryImpl @Inject constructor(photoApi: PhotoApi) : PhotoRepository {

    val mPhotoApi = photoApi

    override fun getPhotos(): Single<List<Photo>> {
        return mPhotoApi.getFeeds()
    }
}