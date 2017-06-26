package com.example.instantapp.instantappdemo.feeds

import android.content.Context
import com.example.instantapp.photo.PhotoRepository
import javax.inject.Inject

/**
 * Created by rohitkumar.yadav on 20/6/17.
 */
class PhotosModelView @Inject constructor(context: Context, photoRepository: PhotoRepository) {

    val mContext = context
    val mPhotoRepository = photoRepository
}