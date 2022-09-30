package com.johannjara.design.atom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.johannjara.design.R
import com.johannjara.design.theme.Green
import com.johannjara.design.theme.Red

@Composable
fun Progress(
    modifier: Modifier = Modifier,
    color: Color = Color.Blue,
    backgroundColor: Color = Color.LightGray,
    progress: Float,
    value: Int = 0,
    isTick: Boolean? = null
) {
    Row(modifier = modifier) {
        LinearProgressIndicator(
            color = color,
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .weight(1f)
                .align(CenterVertically),
            backgroundColor = backgroundColor,
            progress = progress
        )
        ProgressPercent(
            value = value,
            modifier = Modifier
                .align(CenterVertically)
                .padding(start = 8.dp)
        )
        ProgressIcon(isTick = isTick)
    }
}

@Composable
fun ProgressPercent(modifier: Modifier = Modifier, value: Int = 0) {
    if (value != 0) {
        Text(
            text = "$value%",
            modifier = modifier,
            fontSize = 12.sp,
            color = Color.Black
        )
    }
}

@Composable
fun ProgressIcon(
    isTick: Boolean? = null
) {
    when (isTick) {
        true -> {
            androidx.compose.material.Icon(
                painter = painterResource(id = R.drawable.ic_circle_tick),
                tint = Green,
                contentDescription = "Tick",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .padding(start = 8.dp)
            )
        }
        false -> {
            androidx.compose.material.Icon(
                painter = painterResource(id = R.drawable.ic_circle_cross),
                tint = Red,
                contentDescription = "Cross",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .padding(start = 8.dp)
            )
        }
        else -> {}
    }
}

@Composable
fun Progress(
    modifier: Modifier = Modifier,
    color: Color = Color.Blue,
    backgroundColor: Color = Color.LightGray
) {
    LinearProgressIndicator(
        modifier = modifier
            .clip(RoundedCornerShape(24.dp)),
        color = color,
        backgroundColor = backgroundColor
    )
}

@Preview(showBackground = true)
@Composable
internal fun ProgressPreview() {
    Progress(modifier = Modifier.fillMaxWidth())
}

@Preview(showBackground = true)
@Composable
internal fun ProgressWithPercentPreview() {
    Progress(
        modifier = Modifier.fillMaxWidth(),
        progress = 0.3f
    )
}

@Preview(showBackground = true)
@Composable
internal fun ProgressWithTickPreview() {
    Progress(
        modifier = Modifier.fillMaxWidth(),
        progress = 0.3f,
        isTick = true,
        color = Green
    )
}

@Preview(showBackground = true)
@Composable
internal fun ProgressWithCrossPreview() {
    Progress(
        modifier = Modifier.fillMaxWidth(),
        progress = 0.3f,
        isTick = false,
        color = Red
    )
}