package com.example.tom.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tom.R
import com.example.tom.composable.tomKitchen.BottomButton
import com.example.tom.composable.tomKitchen.Content
import com.example.tom.composable.tomKitchen.Details
import com.example.tom.composable.tomKitchen.Preparation
import com.example.tom.composable.tomKitchen.Spacer12Vertical
import com.example.tom.composable.tomKitchen.Spacer16Vertical
import com.example.tom.composable.tomKitchen.SubHeader
import com.example.tom.ui.theme.sansArabic

@Composable
fun TomKitchen(){
    Box( // Background TODO: make it function and move it to another file
        modifier = Modifier
            .size(360.dp, 400.dp)
            .background(Color(0x80035484))
            .padding(horizontal = 16.dp)
        ,
        contentAlignment = Alignment.TopEnd
    ) {}

    Image( // food image
        painter = painterResource(id = R.mipmap.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 148.dp , top = 58.dp)
            .size(188.dp , 168.dp)
            .zIndex(1f)
    )

    Box() { // background image
        Icon(
            painter = painterResource(id = R.drawable.ellipse_3),
            contentDescription = null,
            modifier = Modifier
                .graphicsLayer()
                .size(384.750244140625.dp, 414.2118225097656.dp)
                .offset(x = (-94).dp, y = (-10).dp),
            tint = Color.Unspecified
        )

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
    ) {


        Row( // mobile status bar
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color.Black)
                .padding(horizontal = 16.dp)
        ) {

        }

        Column( // header
            modifier = Modifier
                .fillMaxWidth()
                .height(162.dp)
                .padding(start = 16.dp, end = 16.dp)

        ) {
            Row(modifier = Modifier.padding(top = 40.dp)) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.unkownicon1),
                            contentDescription = null,
                            tint = Color(0xFFFFFFFF)

                        )

                        Text(
                            "High tension",
                            color = Color(0xDEFFFFFF),
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.cooker),
                            contentDescription = null,
                            tint = Color(0xFFFFFFFF)
                        )

                        Text("Shocking foods", color = Color(0xDEFFFFFF))
                    }

                }


            }


        }


        Column( // TODO : Find better way to make the button appear in the bottom without taking size from middle container
            modifier = Modifier
                .fillMaxWidth()
                .height((620 - 88).dp)
                .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                .background(Color(0xFFEEF4F6))
                .padding(16.dp, 0.dp)
        ) {
            Spacer(Modifier.height(32.dp))
            SubHeader()
            Spacer16Vertical()
            Content()
            Spacer12Vertical()
            Details()
            Text(
                "Preparation",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 18.sp,
                color = Color(0xDE1F1F1E),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                fontFamily = sansArabic,
                fontWeight = FontWeight.Medium
            )
            Preparation(
                listOf(
                    "Put the pasta in a toaster.",
                    "Pour battery juice over it.",
                    "Wait for the spark to ignite.",
                    "Serve with an insulating glove."
                )
            )

        }

        BottomButton()
    }
}