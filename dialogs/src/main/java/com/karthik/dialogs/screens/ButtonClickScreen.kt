package com.karthik.dialogs.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


//On click of button we need to show Date Picker dialog or Confirmation dialog.

@Composable
fun DatePickerScreen(){
    // Layout for displaying the button and the selected date
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Button to open the DatePickerDialog
        Button(
            onClick = {

            }
        ) {
            Text("Open Date Picker")
        }
        // Displays the selected date
        Text("Selected Date: ${""}")
    }
}