package com.example.composeapplication.ui.mock

import com.example.composeapplication.R
import com.example.composeapplication.ui.extension.toBrazilianCurrency
import com.example.composeapplication.ui.model.Product
import java.math.BigDecimal

fun getMockProducts() = listOf(
    Product(
        "Hamburguer",
        BigDecimal(10.00).toBrazilianCurrency(),
        R.drawable.burger
    ),
    Product(
        "Pizza",
        BigDecimal(45.00).toBrazilianCurrency(),
        R.drawable.pizza
    ),
    Product(
        "Batata Frita",
        BigDecimal(6.00).toBrazilianCurrency(),
        R.drawable.fries
    )
)