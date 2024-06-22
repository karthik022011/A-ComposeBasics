package com.karthik.dialogs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun CustomAlertDialogInput(
    title: String,
    message: String,
    userInput: String,
    onUserInputChanged: (String) -> Unit,
    onDismissRequest: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = {
            onDismissRequest()
        },
        title = { Text(title) },
        text = {
            Column {
                Text(message)
                TextField(
                    value = userInput,
                    onValueChange = { onUserInputChanged(it) },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            } },
        confirmButton = {
            Button(
                onClick = {
                    onConfirm()
                }
            ) {
                Text("OK")
            }
        },
        dismissButton = {
            Button(
                onClick = onDismissRequest
            ) {
                Text("Dismiss")
            }
        }
    )
}