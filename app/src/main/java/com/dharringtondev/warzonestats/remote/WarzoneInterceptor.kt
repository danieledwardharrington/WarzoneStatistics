package com.dharringtondev.warzonestats.remote

import com.dharringtondev.warzonestats.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class WarzoneInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val request = original.newBuilder()
            .header("x-rapidapi-key", BuildConfig.RAPID_API_KEY)
            .header("x-rapidapi-host", BuildConfig.RAPID_API_HOST)
            .method(original.method(), original.body())
            .build()

        return chain.proceed(request)
    }
}