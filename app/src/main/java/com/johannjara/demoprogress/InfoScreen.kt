package com.johannjara.demoprogress

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.johannjara.design.atom.HtmlText
import com.johannjara.design.atom.Icon
import com.johannjara.design.atom.Text
import com.johannjara.design.molecule.AppBar

@Composable
fun InfoScreen(onBackClick: () -> Unit) {
    Scaffold(topBar = {
        AppBar(
            title = "Reto",
            navigationIcon = {
                Icon(
                    onClick = onBackClick,
                    icon = Icons.Filled.ArrowBack,
                    description = "backIcon"
                )
            })
    }) { contentPadding ->
        InfoContent(contentPadding = contentPadding)
    }
}

@Composable
internal fun InfoContent(contentPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(contentPadding)
            .padding(all = 16.dp)
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Text(
            text = "Johann F. Jara Sánchez",
            fontSize = 32.sp
        )
        Text(
            text = "Android Developer",
            modifier = Modifier.padding(top = 8.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
        HtmlText(
            html = "<b>Librerías usadas:</b><br/><ul><li>Compose version 1.2.1</li><li>Navigation Compose version 2.5.2</li></ul>",
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InfoContentPreview() {
    InfoContent(contentPadding = PaddingValues())
}