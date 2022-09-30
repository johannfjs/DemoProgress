package com.johannjara.design.atom

import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Icon(
    onClick: () -> Unit,
    icon: ImageVector,
    description: String
) {
    IconButton(onClick = onClick) {
        androidx.compose.material.Icon(
            imageVector = icon,
            contentDescription = description
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun IconPreview() {
    Icon(
        onClick = { },
        icon = Icons.Filled.ArrowBack,
        description = "backIcon"
    )
}