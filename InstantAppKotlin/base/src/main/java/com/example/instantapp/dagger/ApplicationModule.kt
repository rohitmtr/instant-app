package com.example.instantapp.dagger

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by rohitkumar.yadav on 19/6/17.
 */

@Module
class ApplicationModule(app: Context) {
    val mContext = app
    @Provides
    fun context(): Context {
        return mContext
    }
}
