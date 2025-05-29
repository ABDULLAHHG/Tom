package com.example.tom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom.ui.theme.TomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomTheme {
                Column() {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(Color(0xFFFFFFFF))
                    ) {

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(162.dp)
                            .background(Color(0xFF226993))
                            .padding(16.dp, 18.dp)

                    ) {

                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(Color(0xFFEEF4F6))
                            .padding(16.dp, 32.dp)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        ) {


                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.Start,
                            ) {
                                Text(
                                    "Electric Tom pasta",
                                    fontSize = 16.sp,
                                    modifier = Modifier.padding(bottom = 12.dp)
                                )
                                Row(
                                    modifier = Modifier
                                        .background(Color(0xFFD0E5F0)),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(5.dp),

                                    ) {

                                    Icon(
                                        painter = painterResource(id = R.drawable.bugicon),
                                        contentDescription = null,
                                        tint = Color(0xFF03578A),
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Text("5 Cheese", fontSize = 12.sp)
                                }
                            }



                            Column(
                                horizontalAlignment = Alignment.End,
                                modifier = Modifier.padding(top = 17.dp, bottom = 17.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.heart),
                                    contentDescription = null,
                                    tint = Color(0xFF03578A),
                                    modifier = Modifier.size(16.dp)
                                )
                            }

                        }


                        Box(modifier = Modifier.padding(bottom = 12.dp)) {
                            Text("Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).")
                        }
                        Text("Details", modifier = Modifier.fillMaxWidth())
                        Row(
                            modifier = Modifier.padding(top = 12.dp, bottom = 12.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Card(
                                painterResource(id = R.drawable.temperature),
                                title = "1000 V",
                                description = "Temperature"
                            )
                            Card(
                                painterResource(id = R.drawable.timer_02),
                                title = "3 sparks",
                                description = "Time"
                            )
                            Card(
                                painterResource(id = R.drawable.evil),
                                title = "1M 12K",
                                description = "No. of deaths"
                            )

                        }
                        Preparation(listOf("Aboud", "Abdulaziz"))

                    }
                }
            }
        }
    }
}


@Composable
fun Card(icon: Painter, title: String, description: String) {
    Box(
        modifier = Modifier
            .size(104.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFFD0E5F0))
            .padding(14.dp, 14.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Color(0xFF035587),
                modifier = Modifier.size(32.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 12.dp), contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                title,
                fontSize = 14.sp,
                color = Color(0x99121212),
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Text(description, fontSize = 10.sp, color = Color(0x5E121212))
        }
    }

}

@Composable
fun Preparation(items: List<String>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items.forEachIndexed() { index, item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(25.dp)
                        .border(1.dp, Color(0xFFD0E5F0), RoundedCornerShape(100.dp)),
                ) {
                    Text(index.toString())
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp)
                        .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                        .background(Color(0xFFFFFFFF))
                ) {
                    Text(item, modifier = Modifier.padding(16.dp))


                }

            }
        }

    }

}

