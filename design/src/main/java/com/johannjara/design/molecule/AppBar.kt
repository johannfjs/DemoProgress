package com.johannjara.design.molecule

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.johannjara.design.atom.Icon
import com.johannjara.design.atom.Title

@Composable
fun AppBar(
    title: String,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = {
            Title(text = title)
        },
        navigationIcon = navigationIcon,
        actions = actions
    )
}

@Preview(showBackground = true)
@Composable
internal fun AppBarWithoutNavigationPreview() {
    AppBar(
        title = "Title"
    )
}

@Preview(showBackground = true)
@Composable
internal fun AppBarPreview() {
    AppBar(
        title = "Title",
        navigationIcon = {
            Icon(onClick = { }, icon = Icons.Filled.ArrowBack, description = "backIcon")
        }
    )
}

@Preview(showBackground = true)
@Composable
internal fun AppBarWitActionsPreview() {
    AppBar(
        title = "Title",
        actions = {
            Icon(onClick = { }, icon = Icons.Filled.Info, description = "infoIcon")
        }
    )
}