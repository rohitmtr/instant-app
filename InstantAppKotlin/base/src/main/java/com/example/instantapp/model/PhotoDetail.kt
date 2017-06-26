package com.example.instantapp.model

import android.os.Parcel
import android.os.Parcelable

import java.util.Locale

/**
 * Model class representing data returned from unsplash.it
 */
class PhotoDetail : Parcelable {

    /*{
        "format": "jpeg",
        "width": 5616,
        "height": 3744,
        "filename": "0000_yC-Yzbqy7PY.jpeg",
        "id": 0,
        "author": "Alejandro Escamilla",
        "author_url": "https://unsplash.com/alejandroescamilla",
        "post_url": "https://unsplash.com/photos/yC-Yzbqy7PY"
    }*/

    val format: String
    val width: Int
    val height: Int
    val filename: String
    val id: Long
    val author: String
    val author_url: String
    val post_url: String

    constructor(format: String,
                width: Int,
                height: Int,
                filename: String,
                id: Long,
                author: String,
                author_url: String,
                post_url: String) {
        this.format = format
        this.width = width
        this.height = height
        this.filename = filename
        this.id = id
        this.author = author
        this.author_url = author_url
        this.post_url = post_url
    }

    protected constructor(`in`: Parcel) {
        format = `in`.readString()
        width = `in`.readInt()
        height = `in`.readInt()
        filename = `in`.readString()
        id = `in`.readLong()
        author = `in`.readString()
        author_url = `in`.readString()
        post_url = `in`.readString()
    }

    fun getPhotoUrl(requestWidth: Int): String {
        return java.lang.String.format(Locale.getDefault(), PHOTO_URL_BASE, requestWidth, id)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(format)
        dest.writeInt(width)
        dest.writeInt(height)
        dest.writeString(filename)
        dest.writeLong(id)
        dest.writeString(author)
        dest.writeString(author_url)
        dest.writeString(post_url)
    }

    companion object {

        private val PHOTO_URL_BASE = "https://unsplash.it/%d?image=%d"

        val CREATOR: Parcelable.Creator<PhotoDetail> = object : Parcelable.Creator<PhotoDetail> {
            override fun createFromParcel(`in`: Parcel): PhotoDetail {
                return PhotoDetail(`in`)
            }

            override fun newArray(size: Int): Array<PhotoDetail?> {
                return arrayOfNulls(size)
            }
        }
    }
}