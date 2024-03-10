package com.keserugr.drinksapp.data.mapper

import com.keserugr.drinksapp.data.local.BeerEntity
import com.keserugr.drinksapp.data.remote.dto.BeerDTO
import com.keserugr.drinksapp.domain.model.Beer

fun BeerDTO.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        first_brewed = first_brewed,
        image_url = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}