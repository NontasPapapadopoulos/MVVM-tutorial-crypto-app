package com.example.cryptocurrencyapp


import com.google.gson.annotations.SerializedName

data class StatsX(
    @SerializedName("contributors")
    val contributors: Int,
    @SerializedName("followers")
    val followers: Int,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("subscribers")
    val subscribers: Int
)