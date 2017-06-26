package com.example.instantapp.photo.dagger

import com.example.instantapp.photo.PhotoApi
import com.example.instantapp.photo.PhotoRepository
import com.example.instantapp.photo.PhotoRepositoryImpl

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */

@Module
class PhotoModule {

    @Provides
    fun provideRepo(photoApi: PhotoApi): PhotoRepository {
        return PhotoRepositoryImpl(photoApi)
    }

    @Provides
    fun provideApi(retrofit: Retrofit): PhotoApi {
        return retrofit.create(PhotoApi::class.java)
    }
}