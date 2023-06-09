package com.loureiro.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "612532a80bd83b29328ac772619168d7"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}