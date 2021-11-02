package com.madkins.ffcompleto.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class XIVServiceProvider {
    companion object {
        private const val BASE_URL = "https://xivapi.com"
        private var retrofit: Retrofit? = null

        fun getRetrofit(): Retrofit {
            when(retrofit) {
                null -> retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit as Retrofit
        }
    }
}