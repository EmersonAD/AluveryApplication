package com.example.composeapplication.ui.component

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.R
import com.example.composeapplication.ui.extension.toBrazilianCurrency
import com.example.composeapplication.ui.model.Product
import java.math.BigDecimal

@Composable
fun ProductSection() {
    Column {
        Text(
            modifier = Modifier.padding(start = 16.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            text = "Promoções"
        )
        Row(
            Modifier
                .padding(top = 8.dp)
                .horizontalScroll(state = rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            ProductItem(
                Product(
                    "Hamburguer",
                    BigDecimal(10.00).toBrazilianCurrency(),
                    R.drawable.burger
                )
            )
            ProductItem(
                Product(
                    "Pizza",
                    BigDecimal(45.00).toBrazilianCurrency(),
                    R.drawable.pizza
                )
            )
            ProductItem(
                Product(
                    "Batata Frita",
                    BigDecimal(6.00).toBrazilianCurrency(),
                    R.drawable.fries
                )
            )
            Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection()
}