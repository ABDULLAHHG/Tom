package com.example.tom.composable.jerryStore

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tom.R
import com.example.tom.ui.theme.sansArabic

@Composable
fun Card(image: Int, title: String, description: String, price: Int,oldPrice : Int? = null) {
    Box() {
        Column(
            Modifier
                .size(160.dp, 219.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(Color(0xFFFFFFFF)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Column(modifier = Modifier.padding(8.dp)){

                Column(modifier = Modifier.width(144.dp)) {
                    Text(
                        title,
                        fontSize = 18.sp,
                        lineHeight = 18.sp,
                        letterSpacing = 0.sp,
                        fontWeight = FontWeight(600),
                        fontFamily = sansArabic,
                        color = Color(0xFF1F1F1E),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(144.dp)
                    )
                    Text(
                        description,
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        letterSpacing = 0.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = sansArabic,
                        color = Color(0xFF969799),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(144.dp)

                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.height(144.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .size(108.dp, 30.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFD0E5F0))
                            .padding(horizontal = 8.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,

                        ) {
                        Icon(
                            painter = painterResource(id = R.drawable.bugicon),
                            contentDescription = null,
                            tint = Color(0xFF03578A),
                            modifier = Modifier.size(16.dp)

                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        if (oldPrice != null) {
                            Text(
                                "$oldPrice",
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .height(18.dp)
                                    .wrapContentWidth(),
                                fontWeight = FontWeight(500),
                                letterSpacing = 0.sp,
                                lineHeight = 12.sp,
                                fontFamily = sansArabic,
                                color = Color(0xFF03578A),
                                textDecoration = TextDecoration.LineThrough,
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                        }
                        Text(
                            "$price cheeses",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .height(18.dp)
                                .wrapContentWidth(),
                            fontWeight = FontWeight(500),
                            letterSpacing = 0.sp,
                            lineHeight = 12.sp,
                            fontFamily = sansArabic,
                            color = Color(0xFF03578A),
                        )
                    }
                    Box(Modifier.size(30.dp)) {
                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .size(30.dp)
                                .border(1.dp, Color(0xFF03578A), RoundedCornerShape(8.dp))
                                .clip(RoundedCornerShape(8.dp)),

                            ) {
                            Box(
                                Modifier.size(30.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.cart_icon),
                                    contentDescription = null,
                                    modifier = Modifier.wrapContentSize(),
                                    tint = Color(0xFF03578A),
                                )
                            }
                        }
                    }
                }
            }

        }
        Box() {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .offset(y = (-16).dp, x = 30.dp)
            )
        }
    }
}

