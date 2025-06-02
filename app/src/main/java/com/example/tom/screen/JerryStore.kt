package com.example.tom.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.R
import com.example.tom.composable.tomKitchen.Spacer12Vertical
import com.example.tom.ui.theme.headerBlackFontColor
import com.example.tom.ui.theme.headerGrayFontColor
import com.example.tom.ui.theme.sansArabic

@Composable
fun JerryStore() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffEEF4F6))
            .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
    ) {


        Row( // mobile status bar
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color.Black)
                .padding(horizontal = 16.dp)
        ) {}

        Row(modifier = Modifier.padding(vertical = 2.dp)) { // Header
            Row() {
                Image(
                    painter = painterResource(id = R.mipmap.sleeping_jerry_foreground),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Row() {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    Text(
                        "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        fontFamily = sansArabic,
                        lineHeight = 14.sp,
                        letterSpacing = 0.sp,
                        color = headerBlackFontColor
                    )
                    Text(
                        text = "Which Tom do you want to buy?",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = sansArabic,
                        lineHeight = 12.sp,
                        letterSpacing = 0.sp,
                        color = headerGrayFontColor,

                        )
                }
            }

            Spacer(modifier = Modifier.padding(start = 62.dp))

            Row(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0x261F1F1E), RoundedCornerShape(12.dp)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notification_bell),
                    contentDescription = null
                )
            }

        }

        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) { // Content Section

            Row(
                modifier = Modifier
                    .width(272.dp)
                    .wrapContentHeight()
            )
            { // navigation

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
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
//                    modifier = Modifier.size(48.dp)
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
//                            Color(0xFFFFFFFF),
                            Color(0xFF03578A),
                            Color(0xFF03578A),
                            Color(0xFF03578A),
                            Color(0xFF03578A),
                        )
                    ) {
                        Text("A")
//                        Icon(
//                            painter = painterResource(id = R.drawable.filter_icon),
//                            contentDescription = null,
//                            modifier = Modifier.size(19.5.dp, 17.5.dp)
//                        )
                    }
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .background(Brush.linearGradient(listOf(Color(0xFF03446A), Color(0xFF0685D0))))
            ) { // Hero
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                ) {
                    Text(
                        "Buy 1 Tom and get 2 for free",
                        fontSize = 18.sp,
                        lineHeight = 18.sp,
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

                Box() {

                }
            }
            Row() { // Cheap Tom Section
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "Cheap tom section",
                        fontSize = 20.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp,
                        fontWeight = FontWeight(600),
                        fontFamily = sansArabic,
                        color = Color(0xFF1F1F1E)
                    )
                    Row(
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "View all",
                            fontSize = 12.sp,
                            lineHeight = 12.sp,
                            letterSpacing = 0.sp,
                            fontWeight = FontWeight(500),
                            fontFamily = sansArabic,
                            color = Color(0xFF03578A),
                            modifier = Modifier.padding(end = 4.dp),
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.right_arrow_icon),
                            contentDescription = null,
                            modifier = Modifier.size(8.874999046325684.dp, 4.751708984375.dp),
                            tint = Color(0xFF03578A)
                        )
                    }
                }
            }
            Spacer12Vertical()
            Row() { // Toms products
                Card(painter = painterResource(id = R.))
            }
        }


    }
}


@Composable
fun Card(painter: Painter, title: String, description: String, price: Int) {
    Box() {
        Column() {
            // Icon
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .wrapContentWidth()
                    .offset(y = (-16).dp)
                    .padding(start = 33.83.dp, end = 32.83.dp)
            )
            Column() {
                Text(
                    title,
                    fontSize = 18.sp,
                    lineHeight = 18.sp,
                    letterSpacing = 0.sp,
                    fontWeight = FontWeight(600),
                    fontFamily = sansArabic,
                    color = Color(0xFF1F1F1E)
                )
                Text(
                    description,
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    letterSpacing = 0.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = sansArabic,
                    color = Color(0xFF969799)
                )
            }
            Row() {
                Row(
                    modifier = Modifier
                        .size(91.dp, 30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFD0E5F0))
                        .padding(horizontal = 8.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),

                    ) {
                    Icon(
                        painter = painterResource(id = R.drawable.bugicon),
                        contentDescription = null,
                        tint = Color(0xFF03578A),
                        modifier = Modifier.size(16.dp)

                    )
                    Text(
                        "5 cheese",
                        fontSize = 12.sp,
                        modifier = Modifier.size(55.dp, 18.dp),
                        fontWeight = FontWeight(500),
                        letterSpacing = 0.sp,
                        lineHeight = 12.sp,
                        fontFamily = sansArabic,
                        color = Color(0xFF03578A)
                    )
                }
                Button(
                    onClick = {},
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.cart_icon),
                        contentDescription = null,
                        modifier = Modifier.size(14.26111233755703.dp, 14.58409608282691.dp)
                    )
                }
            }
        }
    }
}