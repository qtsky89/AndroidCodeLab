package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, { count++ }, modifier)
}

    /* https://developer.android.com/codelabs/jetpack-compose-state#6
    Column (modifier = modifier.padding(16.dp)){
        var count by remember { mutableStateOf(0)}
        if (count > 0) {
            var showTask by remember { mutableStateOf(true)}
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 min walk today?",
                    onClose = { showTask = false }
                )
            }
            Text(text = "You've had ${count} glasses.")
        }

        Row(Modifier.padding(top=8.dp)) {
            Button(onClick = { count++}, enabled = count < 10) {
                Text("Add one")
            }
            Button (onClick = { count = 0}, Modifier.padding(start= 8.dp)) {
                Text("Clear water count")
            }
        }
    }*/
