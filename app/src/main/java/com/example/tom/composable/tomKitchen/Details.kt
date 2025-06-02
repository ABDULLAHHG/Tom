package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.R
import com.example.tom.ui.theme.sansArabic

@Composable
fun Details() {
    Text("Details",
        modifier = Modifier.fillMaxWidth(),
        fontFamily = sansArabic,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.5.sp,
        color = Color(0xDE1F1F1E)
        )
    Row(
        modifier = Modifier
            .padding(top = 12.dp, bottom = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Card(
            painterResource(id = R.drawable.temperature),
            title = "1000 V",
            description = "Temperature"
        )
        Card(
            painterResource(id = R.drawable.timer_02),
            title = "3 sparks",
            description = "Time"
        )
        Card(
            painterResource(id = R.drawable.evil),
            title = "1M 12K",
            description = "No. of deaths"
        )

    }
}