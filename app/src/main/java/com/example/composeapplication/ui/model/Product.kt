package com.example.composeapplication.ui.model

import androidx.annotation.DrawableRes

data class Product(
    val name: String,
    val price: String,
    @DrawableRes val image: Int
)
