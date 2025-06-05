package com.example.tom.composable.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
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
fun SubHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {


        Column(
            modifier = Modifier
                .height(66.dp)
                .wrapContentWidth(),
            horizontalAlignment = Alignment.Start,
        ) {

            Text(
                "Electric Tom pasta",
                fontSize = 20.sp,
                modifier = Modifier.size(179.dp, 24.dp),
                letterSpacing = 0.5.sp,
                lineHeight = 16.sp,
                fontFamily = sansArabic,
                fontWeight = FontWeight.Medium,
            )

            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier.height(91.dp).wrapContentWidth()
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
                    "5 cheeses",
                    fontSize = 12.sp,
                    modifier = Modifier.height(18.dp).wrapContentWidth(),
                    fontWeight = FontWeight(500),
                    letterSpacing = 0.sp,
                    lineHeight = 12.sp,
                    fontFamily = sansArabic,
                    color = Color(0xFF03578A)
                )
            }
        }



        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .height(58.dp)
                .fillMaxWidth()
                .padding(top = 17.dp, bottom = 17.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = null,
                tint = Color(0xFF03578A),
                modifier = Modifier.size(16.dp)
            )
        }

    }
}
