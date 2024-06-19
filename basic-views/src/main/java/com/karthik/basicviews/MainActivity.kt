package com.karthik.basicviews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karthik.basicviews.card.DashboardScreen
import com.karthik.basicviews.ui.theme.AComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AComposeBasicsTheme {
                Column {
                    Spacer(modifier = Modifier.height(64.dp))
                    DashboardScreen()
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    AComposeBasicsTheme {
        Column {
            Spacer(modifier = Modifier.height(64.dp))
            DashboardScreen()
        }
    }
}