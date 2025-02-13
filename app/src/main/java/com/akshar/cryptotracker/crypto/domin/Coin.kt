package com.akshar.cryptotracker.crypto.domin

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercentage24Hr: Double

)