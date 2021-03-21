package com.dharringtondev.warzonestats.remote

import com.dharringtondev.warzonestats.BuildConfig
import com.dharringtondev.warzonestats.remote.responses.MatchResponse
import com.dharringtondev.warzonestats.remote.responses.StatsResponse
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface WarzoneService {

    //@Headers("x-rapidapi-key: ${BuildConfig.RAPID_API_KEY}", "x-rapidapi-host: ${BuildConfig.RAPID_API_HOST}")
    @GET("warzone/{username}/{platform}")
    suspend fun getWarzoneMatches(@Path("username") username: String, @Path("platform") platform: String): Response<MatchResponse>

    //@Headers("x-rapidapi-key: ${BuildConfig.RAPID_API_KEY}", "x-rapidapi-host: ${BuildConfig.RAPID_API_HOST}")
    @GET("warzone-matches/{username}/{platform}")
    suspend fun getWarzoneStats(@Path("username") username: String, @Path("platform") platform: String): Response<StatsResponse>

    companion object {
        fun create(): WarzoneService {
            val client = OkHttpClient.Builder().addInterceptor(WarzoneInterceptor()).build()
            val contentType = MediaType.get("application/json")


            val retrofit = Retrofit.Builder()
                .addConverterFactory(Json.asConverterFactory(contentType))
                .baseUrl(BuildConfig.COD_API_BASE_URL)
                .client(client)
                .build()

            return retrofit.create(WarzoneService::class.java)
        }
    }
}