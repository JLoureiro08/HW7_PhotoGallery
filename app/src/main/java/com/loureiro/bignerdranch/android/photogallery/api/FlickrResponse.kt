package com.loureiro.bignerdranch.android.photogallery.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)          //Javascript Object Notation This helps to format the data from the website

data class FlickrResponse (
    val photos: PhotoResponse
        )