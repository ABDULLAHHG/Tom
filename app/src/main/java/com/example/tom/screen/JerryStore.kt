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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tom.R
import com.example.tom.composable.jerryStore.Card
import com.example.tom.composable.jerryStore.Header
import com.example.tom.composable.jerryStore.Hero
import com.example.tom.composable.jerryStore.Search
import com.example.tom.ui.theme.sansArabic

@Composable
fun JerryStore() {
    val mobileWidth = PortraitWidth()
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
            .fillMaxSize()
            .background(Color(0xffEEF4F6))
            .padding(top = 30.dp)
    ) {
        item() {
            Header()


            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            ) { // Content Section
                Search()
                Hero()

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



                Column(
                    modifier = Modifier.height(
                        (745 + ((mobileWidth.value - LocalConfiguration.current.screenWidthDp) * 0.55)).dp
                    )
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    val columnCount = if (LocalConfiguration.current.screenWidthDp < 600) 2 else 4
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(columnCount),
                        contentPadding = PaddingValues(top = 16.dp, bottom = 28.dp),
                        verticalArrangement = Arrangement.spacedBy(28.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        userScrollEnabled = false
                    ) {
                        item() {
                            Card(
                                R.drawable.sport_tom,
                                "Sport Tom",
                                "He runs 1 meter... trips over his boot.\n",
                                3,
                                5
                            )
                        }
                        item() {
                            Card(
                                R.drawable.tom_the_lover,
                                "Tom the lover",
                                "He loves one-sidedly... and is beaten by the other side.",
                                5
                            )
                        }
                        item() {
                            Card(
                                R.drawable.tom_the_bomb,
                                "Tom the bomb",
                                "He blows himself up before Jerry can catch him.",
                                10
                            )
                        }
                        item() {
                            Card(
                                R.drawable.spy_tom,
                                "Spy Tom",
                                "Disguises itself as a table.\n" +
                                        "\n",
                                12
                            )
                        }
                        item() {

                            Card(
                                R.drawable.frozen_tom,
                                "Frozen Tom",
                                "He was chasing Jerry, he froze after the first look\n",
                                10
                            )
                        }
                        item() {
                            Card(
                                R.drawable.sleeping_tom,
                                "Sleeping Tom",
                                "He doesn't chase anyone, he just snores in stereo.\n",
                                10
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))


        }


    }


}

@Composable
fun TomHasMoney() {
    Box(
        modifier = Modifier
            .layoutId("overlay")
            .zIndex(1f)
    ) {
        Box(
            contentAlignment = Alignment.CenterEnd, modifier = Modifier
                .fillMaxWidth()
                .offset(
                    x = (-1).dp,
                    y = (360 * -0.053).dp
                )
        ) {
            Box(modifier = Modifier.offset(x = (30).dp, y = 18.dp)) {
                Image(
                    painter = painterResource(R.drawable.ellipse_1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(139.2218180591613.dp, 113.69356622004429.dp)
                        .offset(x = 5.64.dp),
                )
                Image(
                    painter = painterResource(R.drawable.ellipse_2),
                    contentDescription = null,
                    modifier = Modifier.size(132.05275062266338.dp, 110.73708426431098.dp),
                )
            }
            Image(
                painter = painterResource(R.drawable.tom_has_money),
                contentDescription = null,
                modifier = Modifier.size(115.37560272216797.dp, 108.dp)
            )
        }
    }
}
