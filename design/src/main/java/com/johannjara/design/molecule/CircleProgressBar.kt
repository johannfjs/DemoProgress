package com.johannjara.design.molecule

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.johannjara.design.atom.CircleProgress
import com.johannjara.design.atom.Text

@Composable
fun CircleProgressBar(text: String = "") {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        CircleProgress(modifier = Modifier.padding(top = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
internal fun CircleProgressBarPreview() {
    CircleProgressBar(text = "Circle Progress Bar")
}