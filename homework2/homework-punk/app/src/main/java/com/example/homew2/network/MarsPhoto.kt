package com.example.homew2.network

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


data class MarsPhoto(
    val id: Int,
    val name: String,
    @SerializedName("image_url")
    val imgSrc: String
)