package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.ui.theme.sansArabic

@Composable
fun Card(icon: Painter, title: String, description: String) {
    Box(
        modifier = Modifier
            .size(104.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFFD0E5F0))
            .padding(12.dp, 12.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.67.dp , 3.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Color(0xFF035587),
                modifier = Modifier.size(32.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                title,
                fontSize = 14.sp,
                color = Color(0x99121212),
                letterSpacing = 0.5.sp,
                lineHeight = 16.sp,
                fontFamily = sansArabic,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(500),
                modifier = Modifier.width(79.dp)
            )
            Text(
                description,
                fontSize = 12.sp,
                color = Color(0x5E121212),
                letterSpacing = 0.5.sp,
                lineHeight = 16.sp,
                fontFamily = sansArabic,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(500),
                modifier = Modifier.width(80.dp)
            )
        }
    }

}