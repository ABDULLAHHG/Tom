package com.example.tom.composable.jerryStore

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
fun Search(){
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    )
    { // navigation

        Row(
            modifier = Modifier
                .width(272.dp)
                .height(48.dp)
        ) {
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        "Search about tom ...",
                        color = Color(0xFF969799),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = sansArabic,
                        lineHeight = 14.sp,
                        letterSpacing = 0.sp,
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search_normal),
                        contentDescription = null,
                        modifier = Modifier.size(20.5.dp),
                        tint = Color(0xFF969799)
                    )
                },
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    disabledContainerColor = Color.LightGray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0x14A5A6A4)),
            )
        }

        Row(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF03578A))
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(width = 48.dp, height = 48.dp),
                colors = IconButtonColors(
                    Color(0xFF03578A),
                    contentColor = Color.White,
                    Color.White,
                    Color.White
                )
            ) {
                Box() {
                    Icon(
                        painter = painterResource(id = R.drawable.filter_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(19.5.dp, 17.5.dp)
                    )
                }
            }
        }

    }
}