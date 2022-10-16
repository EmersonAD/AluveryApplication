package com.example.composeapplication.ui.component

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.composeapplication.ui.theme.Purple200
import com.example.composeapplication.ui.theme.Purple700

@Preview(showBackground = true)
@Composable
fun ChallengePreview() {
    Card(Modifier.padding(8.dp), shape = RoundedCornerShape(16.dp), elevation = 4.dp) {
        Row(
            Modifier
                .height(200.dp)
                .width(400.dp)) {
            Box(
                Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Purple200, Purple700)
                        )
                    )
                    .fillMaxHeight()
                    .width(100.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_delete),
                    contentDescription = "Image product",
                    modifier = Modifier
                        .offset(x = 50.dp)
                        .align(Alignment.CenterEnd)
                        .size(100.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(
                modifier = Modifier.width(50.dp)
            )
            Column(Modifier.padding(16.dp)) {
                Text(
                    modifier = Modifier.offset(y = 30.dp),
                    text = LoremIpsum().values.first(),
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
