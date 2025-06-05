package com.example.tom.composable.tomAccount

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.R
import com.example.tom.ui.theme.sansArabic


@Composable
fun TomSettings() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier
            .height(182.dp)
            .padding(horizontal = 16.dp)
    ) {
        Text(
            "Tom settings",
            fontSize = 20.sp,
            fontWeight = FontWeight(700),
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            fontFamily = sansArabic,
            color = Color(0xDE1F1F1E)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.height(144.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(40.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFFFFFFF)),
                    contentAlignment = Alignment.Center

                ) {
                    Icon(
                        painter = painterResource(R.drawable.bed_icon),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Change sleeping place",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    lineHeight = 16.sp,
                    letterSpacing = 0.sp,
                    fontFamily = sansArabic,
                    color = Color(0xDE1F1F1E)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(40.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFFFFFFF)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(painter = painterResource(R.drawable.cat_icon), contentDescription = null)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Meow settings",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    lineHeight = 16.sp,
                    letterSpacing = 0.sp,
                    fontFamily = sansArabic,
                    color = Color(0xDE1F1F1E)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(40.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFFFFFFF)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.fridge_icon),
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Password to open the fridge",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    lineHeight = 16.sp,
                    letterSpacing = 0.sp,
                    fontFamily = sansArabic,
                    color = Color(0xDE1F1F1E)
                )
            }
        }
    }
}

