package com.example.cryptocurrencyapp


import com.google.gson.annotations.SerializedName

data class LinksExtendedX(
    @SerializedName("stats")
    val stats: StatsX,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)