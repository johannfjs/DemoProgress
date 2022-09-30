package com.johannjara.design.atom

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CircleProgress(modifier: Modifier = Modifier) {
    CircularProgressIndicator(modifier = modifier)
}

@Preview(showBackground = true)
@Composable
internal fun CircleProgressPreview() {
    CircleProgress()
}