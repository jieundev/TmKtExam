package test.devel.je.tmexample.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import test.devel.je.tmexample.common.AppConstrants.API_BASE_URL

object ApiManager {

    fun service():ApiService {
        val retrofit = Retrofit.Builder().baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(createClient()).build()
        return retrofit.create(ApiService::class.java)
    }

    private fun createClient():OkHttpClient {
        val build = OkHttpClient.Builder()
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        build.addInterceptor(interceptor)
        return build.build()
    }

}