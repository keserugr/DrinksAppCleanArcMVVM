package com.keserugr.drinksapp.presentation.beer_listing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import com.keserugr.drinksapp.data.local.BeerEntity
import com.keserugr.drinksapp.data.mapper.toBeer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class BeerListViewModel @Inject constructor(
    pager: Pager<Int, BeerEntity>
): ViewModel() {

    val beerPagingFlow = pager
        .flow
        .map { paginData ->
            paginData.map { it.toBeer() }
        }
        .cachedIn(viewModelScope)
}