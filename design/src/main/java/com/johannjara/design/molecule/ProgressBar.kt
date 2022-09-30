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
import com.johannjara.design.atom.Progress
import com.johannjara.design.atom.Text
import com.johannjara.design.theme.Blue
import com.johannjara.design.theme.Green
import com.johannjara.design.theme.Red

@Composable
fun ProgressBar(text: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Progress(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        )
        Progress(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            progress = 0.3f,
            value = 30,
            color = Blue
        )
        Progress(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            progress = 0.5f,
            value = 50,
            color = Blue
        )
        Progress(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            progress = 0.7f,
            isTick = false,
            color = Red
        )
        Progress(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            progress = 1f,
            isTick = true,
            color = Green
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun ProgressBarPreview() {
    ProgressBar(text = "Progress Bar")
}