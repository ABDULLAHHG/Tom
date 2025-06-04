package com.example.tom.composable.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.tom.ui.theme.headerBlackFontColor
import com.example.tom.ui.theme.headerGrayFontColor
import com.example.tom.ui.theme.sansArabic


@Composable
fun Header(){

    Row(
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 16.dp)
            .size(360.dp, 68.dp), verticalAlignment = Alignment.CenterVertically
    ) { // Header

        Image(
            painter = painterResource(id = R.drawable.sleeping_jerry),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

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

        Box(
            modifier = Modifier
                .height(70.dp)
                .padding(start = (90-32).dp)
            ,
            contentAlignment = Alignment.CenterEnd
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(width = 40.dp, height = 40.dp)
                    .background(
                        color = Color.Transparent,
                        //shape = RoundedCornerShape(12.dp)
                    )
                    .border(
                        width = 2.dp,
                        color = Color(0x261F1F1E),
                        shape = RoundedCornerShape(12.dp)
                    ).align(alignment = Alignment.CenterEnd)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notification_bell),
                    contentDescription = null,
                )

            }

            Box(
                modifier =
                    Modifier
                        .offset(5.dp, (-22).dp)
                        .size(14.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF03578A)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "3",
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight(500),
                    fontFamily = sansArabic,
                    lineHeight = 10.sp,
                    letterSpacing = 0.sp,
                )
            }
        }
    }
}

