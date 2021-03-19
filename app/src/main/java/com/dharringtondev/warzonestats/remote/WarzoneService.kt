package com.dharringtondev.warzonestats.remote

import com.dharringtondev.warzonestats.BuildConfig
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface WarzoneService {

    @Headers("x-rapidapi-key: ${BuildConfig.RAPID_API_KEY}", "x-rapidapi-host: ${BuildConfig.COD_API_BASE_URL}")
    @GET
    fun getWarzoneMatches()

    @Headers("x-rapidapi-key: ${BuildConfig.RAPID_API_KEY}", "x-rapidapi-host: ${BuildConfig.COD_API_BASE_URL}")
    @GET
    fun getWarzoneStats()

    companion object {
        fun create(): WarzoneService {
            val client = OkHttpClient.Builder().build()
            val contentType = MediaType.get("application/json")

            val retrofit = Retrofit.Builder()
                .addConverterFactory(Json.asConverterFactory(contentType))
                .baseUrl(BuildConfig.COD_API_BASE_URL)
                .build()

            return retrofit.create(WarzoneService::class.java)
        }
    }
}