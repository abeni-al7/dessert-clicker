package com.example.dessertclicker.ui

import com.example.dessertclicker.model.Dessert

data class DessertUiState(
    val revenue: Int,
    val dessertsSold: Int,
    val currentDessertIndex: Int,
    val currentDessertImageId: Int
)
