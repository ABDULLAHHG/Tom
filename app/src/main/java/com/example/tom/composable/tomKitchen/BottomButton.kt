package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomButton() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter) {
        Box(
            modifier = Modifier
                .height(86.dp)
                .fillMaxWidth()
                .background(Color(0xFFFFFFFF))
                .border(1.dp, Color(0x1F1F1F1E))
                .padding(16.dp, 15.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxSize(),
                colors = ButtonColors(
                    Color(0xFF226993),
                    Color(0xDEFFFFFF),
                    Color(0xFF226993),
                    Color(0xFF226993)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Text("Add to cart")

                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(5.dp)
                            .background(Color(0x61FFFFFF))
                    )

                    Column() {
                        Text(
                            "3 cheeses",
                            fontFamily = null,
                            lineHeight = 16.sp,
                            letterSpacing = 0.5.sp,
                            textAlign = TextAlign.Center,
                            fontSize = 14.sp,
                        )

                        Text(
                            "5 cheeses",
                            fontFamily = null,
                            lineHeight = 16.sp,
                            letterSpacing = 0.5.sp,
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
                            textDecoration = TextDecoration.LineThrough,
                            color = Color(0xCCFFFFFF)
                        )
                    }
                }
            }
        }
    }

}