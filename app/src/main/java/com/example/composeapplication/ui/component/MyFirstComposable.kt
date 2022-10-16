package com.example.composeapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.ui.theme.ComposeApplicationTheme


@Composable
fun MyFirstComposable() {
    ComposeApplicationTheme {
        Surface {
            Text(text = "Hello World!")
        }
    }
}

@Preview(
    name = "First preview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun MyFirstComposePreview() {
    MyFirstComposable()
}

//@Preview(name = "Second preview", showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
//@Composable
//fun MySecondComposePreview() {
//    MyFirstComposable()
//}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Text one")
        Text(text = "Text two")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Text tree")
        Text(text = "Text four")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Text five")
        Text(text = "Text six")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomComposableLayoutPreview() {
    Row(
        Modifier
            .padding(8.dp)
            .background(Color.Blue)
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(text = "Hello, ")
        Column(
            Modifier
                .padding(8.dp)
                .background(Color.Cyan)
                .padding(4.dp)
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.5f)
        ) {
            Text(text = "World!")
            Text(text = "Learning")
            Box(
                Modifier
                    .padding(8.dp)
                    .background(Color.Green)
                    .padding(4.dp)
                    .fillMaxSize()
            ) {
                Text(text = "About")
                Text(text = "Composable")
            }
        }
    }
}