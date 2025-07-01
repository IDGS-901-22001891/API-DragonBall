package com.example.api_dragonball_idgs904

import kotlinx.coroutines.internal.OpDescriptor

// Mapemaos la API para tomar sus datos
data class Character (
    val name: String,
    val description: String?,
    val image: String?,
    val id: Int,
    val ki: String,
    val maxKi: String,
    val race: String,
    val gender: String,
    val affiliation: String
)