package com.example.basicstatecodelab

import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    val count: MutableState<Int> = remember { mutableStateOf(0) }
    Column (modifier = modifier.padding(16.dp)){
        Text(
            text = "You've had ${count.value} glasses."
        )
        Button(onClick = { count.value++}, Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}