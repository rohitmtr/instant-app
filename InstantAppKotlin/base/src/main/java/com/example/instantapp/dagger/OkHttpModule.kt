package com.example.instantapp.dagger

import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by rohitkumar.yadav on 19/6/17.
 */

@Module
class OkHttpModule {

    val CONNECTION_TIMEOUT = (60 * 1000).toLong()

    @Provides
    internal fun provideOkHttpClient(): OkHttpClient {
        return getCommonOkHttpBuilder()
                .build()
    }

    private fun getCommonOkHttpBuilder(): OkHttpClient.Builder {
        val builder = OkHttpClient.Builder()
                .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
        return builder
    }
}