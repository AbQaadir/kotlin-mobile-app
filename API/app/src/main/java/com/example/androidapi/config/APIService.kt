package com.example.androidapi.config

import com.example.androidapi.model.Game
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


const val BASE_URL = "https://www.freetogame.com/api/"
interface APIService {


    @GET("games")
    suspend fun getGames(): List<Game>


    companion object {
        var apiService: APIService? = null

        fun getInstance(): APIService {
            if (apiService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                apiService = retrofit.create(APIService::class.java)
            }
            return apiService!!
        }
    }




}