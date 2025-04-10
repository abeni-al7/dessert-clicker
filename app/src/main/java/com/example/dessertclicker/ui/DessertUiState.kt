package com.example.dessertclicker.ui

import com.example.dessertclicker.R
import com.example.dessertclicker.data.Datasource

data class DessertUiState(
    var revenue: Int = 0,
    var dessertsSold: Int = 0,
    var currentDessertImageId: Int = R.drawable.cupcake,
    var currentDessertPrice: Int = 0,
)
