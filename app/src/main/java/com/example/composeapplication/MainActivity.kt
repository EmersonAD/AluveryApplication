package com.example.composeapplication

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.R.*
import com.example.composeapplication.ui.extension.toBrazilianCurrency
import com.example.composeapplication.ui.model.Product
import com.example.composeapplication.ui.theme.ComposeApplicationTheme
import com.example.composeapplication.ui.theme.Purple500
import com.example.composeapplication.ui.theme.Teal200
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    ComposeApplicationTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Spacer(modifier = Modifier)
                ProductSection()
                ProductSection()
                ProductSection()
                Spacer(modifier = Modifier)
            }
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Surface(shape = RoundedCornerShape(size = 16.dp), elevation = 4.dp) {
        Column(
            Modifier
                .width(200.dp)
                .heightIn(min = 250.dp, max = 300.dp)
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = "Product image",
                    modifier = Modifier
                        .offset(y = imageSize / 2)
                        .align(BottomCenter)
                        .size(imageSize)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
                Text(
                    text = product.price,
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}

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
                    drawable.burger
                )
            )
            ProductItem(
                Product(
                    "Pizza",
                    BigDecimal(45.00).toBrazilianCurrency(),
                    drawable.pizza
                )
            )
            ProductItem(
                Product(
                    "Batata Frita",
                    BigDecimal(6.00).toBrazilianCurrency(),
                    drawable.fries
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

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            "Hello",
            BigDecimal(10.00).toBrazilianCurrency(),
            R.drawable.ic_delete
        )
    )
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}
