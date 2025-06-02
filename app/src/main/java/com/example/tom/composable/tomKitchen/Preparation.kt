package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tom.ui.theme.sansArabic

@Composable
fun Preparation(items: List<String>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .height(200.dp)
    ) {
        items.forEachIndexed() { index, item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy((-18).dp),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .border(1.dp, Color(0xFFD0E5F0), RoundedCornerShape(100.dp))
                        .clip(RoundedCornerShape(100.dp))
                        .background(Color(0xFFFFFFFF))
                        .zIndex(1f),
                ) {
                    Text(
                        (index + 1).toString(),
                        color = Color(0xFF035587),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        fontFamily = sansArabic,
                        letterSpacing = 0.5.sp,
                    )
                }
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp)
                        .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                        .background(Color(0xFFFFFFFF))
                ) {

                    Text(
                        item, modifier = Modifier.padding(start = 24.dp),
                        fontSize = 14.sp,
                        color = Color(0x99121212),
                        letterSpacing = 0.5.sp,
                        lineHeight = 16.sp,
                        fontFamily = sansArabic,
                        fontWeight = FontWeight(400)
                    )
                }
            }
        }

    }

}
