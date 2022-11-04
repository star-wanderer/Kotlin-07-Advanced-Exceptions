package ru.netology

data class Place(
    val id: Int? = null,
    val title: String? = null,
    val latitude: Int = 0x0000,
    val longitude: Int = 0x0000,
    val created: Int? = null,
    val icon: String? = null,
    val country: String = "",
    val city: String = "",
    val type: Int = 0x0000,
    val groupId: Int = 0x0000,
    val groupPhoto: String? = null,
    val checkins: Int = 0,
    val updated: Int? = null,
    val address: Int = 0x0000
)