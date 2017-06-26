package com.example.instantapp.instantappdemo.feeds


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.instantapp.dagger.ApplicationModule
import com.example.instantapp.dagger.DaggerBaseComponent
import com.example.instantapp.dagger.RetrofitModule
import com.example.instantapp.instantappdemo.feeds.dagger.DaggerPhotoAppComponent
import com.example.instantapp.photo.Photo
import com.example.instantapp.photo.PhotoApi
import com.example.instantapp.photo.PhotoRepository
import com.example.instantapp.photo.dagger.DaggerPhotoComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class PhotosActivity : AppCompatActivity() {

    @Inject lateinit var mPhotoRepo: PhotoRepository;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeds)

        val baseC = DaggerBaseComponent.builder()
                .applicationModule(ApplicationModule(application))
                .retrofitModule(RetrofitModule(PhotoApi.ENDPOINT))
                .build()
        val photoC = DaggerPhotoComponent.builder().baseComponent(baseC).build();
        DaggerPhotoAppComponent.builder().photoComponent(photoC).build().inject(this);
        mPhotoRepo.getPhotos().subscribeOn(Schedulers.io()).subscribe(Consumer {
            print("got it")
        })
    }
}
