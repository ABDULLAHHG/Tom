package com.example.tom.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.R
import com.example.tom.composable.tomAccount.Card
import com.example.tom.composable.tomAccount.TomFavoriteFoods
import com.example.tom.composable.tomAccount.TomSettings
import com.example.tom.ui.theme.sansArabic

@Composable
fun TomAccount() {
    val config = PortraitWidth()
    Box(
        modifier = Modifier
            .height(242.dp)
            .fillMaxWidth()
            .background(Color(0xFF226993))
    )
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
        ) {
            Row( // mobile status bar
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.White)
                    .padding(horizontal = 16.dp)
            ) {

            }
        }

    }
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = LocalConfiguration.current.screenWidthDp.dp)
    ) {
        item() {
            Box(
                Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            ) {
                Box(Modifier.offset(y = -(10).dp, x = 8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.first_background_shape),
                        contentDescription = null,
                        modifier = Modifier
                            .size(509.6139033819642.dp, 208.0567356207359.dp)

                    )
                    Image(
                        painter = painterResource(id = R.drawable.second_background_shape),
                        contentDescription = null,
                        modifier = Modifier
                            .size(631.2524160384561.dp, 277.5324625384211.dp)

                    )
                }
            }
            Column() {
                Spacer(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                )

                Box(
                    modifier = Modifier
                        .height((166).dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {

                    Column(
                        modifier = Modifier.padding(top = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.jerry_donkey_face),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                        )
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Tom",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontFamily = sansArabic,
                                fontWeight = FontWeight.Medium,
                                lineHeight = 18.sp,
                                letterSpacing = 0.sp,
                            )
                            Text(
                                text = "specializes in failure!",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontFamily = sansArabic,
                                fontWeight = FontWeight(400),
                                lineHeight = 12.sp,
                                letterSpacing = 0.sp,
                            )
                        }

                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(bottom = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                Modifier
                                    .size(97.dp, 25.dp)
                                    .clip(RoundedCornerShape(40.dp))
                                    .background(Color(0x1FFFFFFF)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "Edit foolishness",
                                    fontSize = 10.sp,
                                    color = Color.White,
                                    fontFamily = sansArabic,
                                    fontWeight = FontWeight(500),
                                    lineHeight = 10.sp,
                                    letterSpacing = 0.sp
                                )
                            }
                        }
                    }

                }

                Column(
                    modifier = Modifier
                        .height(
                            (621 + ((config.value - LocalConfiguration.current.screenWidthDp) * 0.15)).dp
                        )
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                        .background(Color(0xFFEEF4F6))
                ) {
                    Spacer(modifier = Modifier.height(23.dp))
                    val columnCount = if (LocalConfiguration.current.screenWidthDp < 600) 2 else 4

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(columnCount),
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item() {
                            Card(
                                R.drawable.happy_devil_icon,
                                "2M 12K",
                                "No. of quarrels",
                                color = Color(0xFFD0E5F0)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                        }

                        item() {
                            Card(
                                R.drawable.stat_icon_container,
                                "+500 h",
                                "Chase time",
                                color = Color(0xFFDEEECD)
                            )
                        }

                        item {
                            Spacer(modifier = Modifier.height(8.dp))
                            Card(
                                R.drawable.sad_face_icon,
                                "2M 12K",
                                "Hunting times",
                                color = Color(0xFFF2D9E7)

                            )
                        }

                        item() {
                            Card(
                                R.drawable.broken_heart_icon,
                                "3M 7K",
                                "Heartbroken",
                                color = Color(0xFFFAEDCF)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))
                    Column(
                        modifier = Modifier.height(388.dp),
                    ) {
                        TomSettings()
                        Spacer(modifier = Modifier.height(12.dp))
                        Divider(color = Color(0x14001A1F), thickness = 1.dp)
                        Spacer(modifier = Modifier.height(12.dp))
                        TomFavoriteFoods()
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .height(62.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            "v.TomBeta",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            letterSpacing = 0.sp,
                            fontFamily = sansArabic,
                            color = Color(0x99121212)
                        )
                    }

                }
            }
        }
        item {

        }
    }

}

