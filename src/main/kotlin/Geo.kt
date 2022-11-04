package ru.netology

data class Geo (
    val type: String = "",
    val coordinates: String = "No coordinates",
    val place: Place? = null
)