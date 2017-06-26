package com.example.instantapp.dagger

import android.content.Context
import dagger.Component
import dagger.Subcomponent
import retrofit2.Retrofit

/**
 * Created by rohitkumar.yadav on 19/6/17.
 */

@Component(modules = arrayOf(
        ApplicationModule::class,
        OkHttpModule::class,
        RetrofitModule::class)
)
interface BaseComponent {
    fun context():Context
    fun retrofit(): Retrofit
}