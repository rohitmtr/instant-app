package com.example.instantapp.photo.dagger

import com.example.instantapp.dagger.BaseComponent
import com.example.instantapp.photo.PhotoRepository
import dagger.Component

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */
@Component(modules = arrayOf(PhotoModule::class), dependencies = arrayOf(BaseComponent::class))
interface PhotoComponent {
    fun photoRepository(): PhotoRepository
}