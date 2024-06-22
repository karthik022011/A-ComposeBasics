package com.karthik.dialogs


import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDatePickerDialog() {
    // Initial state setup for the DatePickerDialog. Specifies to show the picker initially
    val datePickerState = rememberDatePickerState(initialDisplayMode = DisplayMode.Picker)
    // State to control the visibility of the DatePickerDialog
    val showDatePicker = remember { mutableStateOf(false) }
    // this will store whatever date the user selects
    val selectedDate = remember { mutableStateOf("") }
    if (showDatePicker.value) {
        DatePickerDialog(
            onDismissRequest = { showDatePicker.value = false },
            confirmButton = {
                TextButton(
                    onClick = { showDatePicker.value = false },
                    enabled = datePickerState.selectedDateMillis != null
                ) {
                    Text(text = "Confirm")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDatePicker.value = false }) {
                    Text(text = "Dismiss")
                }
            }
        ){
            //Setting the selected date
            selectedDate.value = datePickerState.selectedDateMillis?.convertMillisToDate()?: ""
            //passing content
            DatePicker(state = datePickerState)
        }
    }
}

fun Long.convertMillisToDate(): String {
    // Create a calendar instance in the default time zone
    val calendar = Calendar.getInstance().apply {
        timeInMillis = this@convertMillisToDate
        // Adjust for the time zone offset to get the correct local date
        val zoneOffset = get(Calendar.ZONE_OFFSET)
        val dstOffset = get(Calendar.DST_OFFSET)
        add(Calendar.MILLISECOND, -(zoneOffset + dstOffset))
    }
    // Format the calendar time in the specified format
    val sdf = SimpleDateFormat("MMM dd, yyyy", Locale.US)
    return sdf.format(calendar.time)
}