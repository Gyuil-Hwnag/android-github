package com.nextstep.edu.data.di

import com.nextstep.edu.data.ApiClient
import com.nextstep.edu.data.RemoteService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object NetworkModule {

    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(ApiClient.BASE_URL)
        .client(provideOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    fun provideMainAPIService(retrofit: Retrofit): RemoteService = retrofit.create(RemoteService::class.java)
}
