package com.example.tom.composable.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.ui.theme.sansArabic


@Composable
fun Card(image: Int, title: String, description: String, color: Color) {
    Row(
        modifier = Modifier
            .size(160.dp, 58.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.size(40.dp),
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column() {
            Text(
                title,
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                fontFamily = sansArabic,
                color = Color(0x99121212),
                textAlign = TextAlign.Center
            )
            Text(
                description,
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                lineHeight = 12.sp,
                letterSpacing = 0.5.sp,
                fontFamily = sansArabic,
                color = Color(0x5E121212),
                textAlign = TextAlign.Center
            )
        }
    }
}