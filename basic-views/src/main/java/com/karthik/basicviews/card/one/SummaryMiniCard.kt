package com.karthik.basicviews.card.one

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SummaryMiniCard(
    painter: Painter,
    heading: String,
    content: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(Color(0xFFFAD9E6))
        ) {
            Image(
                painter = painter,
                contentDescription = heading,
                modifier = Modifier
                    .size(40.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))

        Column() {
            Text(
                text = heading,
                color = Color.White.copy(0.7f),
                fontSize = 16.sp,
            )
            Text(
                text = content,
                color = Color.White
            )

        }
    }
}