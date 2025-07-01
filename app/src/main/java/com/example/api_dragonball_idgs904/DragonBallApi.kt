package com.example.api_dragonball_idgs904

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DragonBallApi {
    @GET("characters")
    // @GET("characters?gender=Female")
    suspend fun getCharacterss(): ClaseRespuestas

    companion object {
        fun create(): DragonBallApi {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://dragonball-api.com/api/") // <--- ¡Añade una barra inclinada aquí!
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(DragonBallApi::class.java)
        }
    }
}