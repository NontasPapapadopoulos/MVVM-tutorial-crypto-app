package com.example.cryptocurrencyapp


import com.google.gson.annotations.SerializedName

data class WhitepaperX(
    @SerializedName("link")
    val link: String,
    @SerializedName("thumbnail")
    val thumbnail: String
)