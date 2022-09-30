package com.johannjara.demoprogress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.johannjara.design.atom.HorizontalDivider
import com.johannjara.design.atom.Icon
import com.johannjara.design.molecule.AppBar
import com.johannjara.design.molecule.CircleProgressBar
import com.johannjara.design.molecule.ProgressBar
import com.johannjara.design.theme.DemoProgressTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoProgressTheme {
                Scaffold(topBar = {
                    AppBar(
                        title = "Reto",
                        actions = {
                            Icon(onClick = { }, icon = Icons.Filled.Info, description = "infoIcon")
                        })
                }) { contentPadding ->
                    Column(
                        modifier = Modifier
                            .padding(contentPadding)
                            .padding(all = 16.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                    ) {
                        ProgressBar(text = "Progress Bar")
                        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
                        CircleProgressBar(text = "Circle Progress Bar")
                    }
                }
            }
        }
    }
}
