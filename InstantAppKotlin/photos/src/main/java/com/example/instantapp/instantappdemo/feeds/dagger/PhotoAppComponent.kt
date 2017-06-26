package com.example.instantapp.instantappdemo.feeds.dagger

import com.example.instantapp.instantappdemo.feeds.PhotosActivity
import com.example.instantapp.photo.dagger.PhotoComponent
import dagger.Component

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */

@Component(dependencies = arrayOf(PhotoComponent::class))
interface PhotoAppComponent {
    fun inject(activity: PhotosActivity)
}