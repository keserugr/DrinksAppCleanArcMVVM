package com.keserugr.drinksapp.data.remote

import com.keserugr.drinksapp.data.remote.dto.BeerDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface BeerApi {

    @GET("beers")
    suspend fun getBeers(
        @Query("page") page: Int,
        @Query("per_page") pageCount: Int
    ): List<BeerDTO>

    companion object {
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}