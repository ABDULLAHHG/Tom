package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tom.ui.theme.sansArabic

@Composable
fun Content() {
    Box() {
        Text(
            "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            color = Color(0x99121212),
            fontWeight = FontWeight(500),
            letterSpacing = 0.5.sp,
            lineHeight = 20.sp,
            fontFamily = sansArabic,
            fontSize = 14.sp
        )
    }
}