package com.karthik.basicviews.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.karthik.basicviews.card.one.MyCard


@Composable
fun DashboardScreen(){
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxSize() //taking full screen
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       MyCard()
    }

}