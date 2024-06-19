package com.karthik.basicviews.card.one

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.karthik.basicviews.R


@Composable
fun BalanceCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(R.string.total_balance),
            color = Color.White.copy(0.7f),
            fontSize = 16.sp,
            )
        Text(
            text = "1800000000",
            fontSize = 40.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SummaryMiniCard(
                painter = painterResource(id = R.drawable.ic_arrow_downward_green),
                heading = "Income",
                content = "+$${123457}"
            )
            SummaryMiniCard(
                painter = painterResource(id = R.drawable.ic_arrow_upward_red),
                heading = "Expense",
                content = "-$${12}"
            )
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}