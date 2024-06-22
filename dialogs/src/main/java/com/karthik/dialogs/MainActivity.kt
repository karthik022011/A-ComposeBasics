package com.karthik.dialogs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.karthik.dialogs.screens.DatePickerScreen
import com.karthik.dialogs.ui.theme.AComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AComposeBasicsTheme {
                DatePickerScreen()
            }
        }
    }
}