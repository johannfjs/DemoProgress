package com.johannjara.design.atom

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider(modifier: Modifier = Modifier) {
    androidx.compose.material.Divider(
        color = Color.LightGray,
        modifier = modifier
            .fillMaxWidth()
            .width(1.dp)
    )
}

@Preview(showBackground = true)
@Composable
internal fun HorizontalDividerPreview() {
    HorizontalDivider()
}