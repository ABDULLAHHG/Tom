package com.example.tom.composable.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.R
import com.example.tom.ui.theme.sansArabic


@Composable
fun Hero(){
    Box() {
        Row(
            modifier = Modifier
                .size(328.dp,92.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    Brush.linearGradient(
                        listOf(
                            Color(0xFF03446A),
                            Color(0xFF0685D0)
                        )
                    )
                )
        ) { // Hero
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
            ) {
                Text(
                    "Buy 1 Tom and get 2 for free",
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.sp,
                    fontFamily = sansArabic,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    "Adopt Tom! (Free Fail-Free Guarantee)",
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    letterSpacing = 0.sp,
                    fontFamily = sansArabic,
                    fontWeight = FontWeight(400),
                    color = Color(0xCCFFFFFF),
                    modifier = Modifier.width(177.dp)
                )
            }

        }
    }
}