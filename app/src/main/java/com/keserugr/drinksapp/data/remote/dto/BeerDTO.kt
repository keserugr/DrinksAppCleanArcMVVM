package com.keserugr.drinksapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class BeerDTO(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val first_brewed: String,
    @SerializedName("image_url")
    val image_url: String?
)
