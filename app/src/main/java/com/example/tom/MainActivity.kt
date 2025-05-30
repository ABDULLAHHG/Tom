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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tom.ui.theme.TomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                ) {
                    Row( // mobile
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                    ) {

                    }

                    Column( // header
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(162.dp)
                            .background(Color(0x80035484))
                            .padding(top = 16.dp, start = 18.dp, end = 18.dp)

                    ) {
                        Row(modifier = Modifier.padding(top = 25.dp)) {
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.spacedBy(20.dp)
                            ) {
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.unkownicon1),
                                        contentDescription = null,
                                        tint = Color(0xFFFFFFFF)

                                    )

                                    Text("High tension", color = Color(0xDEFFFFFF))
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


                    Column( // sub header
                        modifier = Modifier
                            .fillMaxWidth()
                            .height((620 - 88).dp)
                            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                            .background(Color(0xFFEEF4F6))
                            .padding(16.dp, 0.dp)
                    ) {

                        Spacer(Modifier.padding(top = 32.dp))
                        SubHeader()

                        Box(modifier = Modifier.padding(bottom = 12.dp)) {
                            Text("Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).")
                        }

                        Details()
                        Text("Preparation", modifier = Modifier.fillMaxWidth())
                        Preparation(listOf("Aboud", "Abdulaziz", "Ahmed", "Ali"))

                    }

                    BottomButton()
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
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .height(200.dp)
    ) {
        items.forEachIndexed() { index, item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy((-18).dp),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .border(1.dp, Color(0xFFD0E5F0), RoundedCornerShape(100.dp))
                        .clip(RoundedCornerShape(100.dp))
                        .background(Color(0xFFFFFFFF))
                        .zIndex(1f),
                ) {
                    Text((index + 1).toString())
                }
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp)
                        .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                        .background(Color(0xFFFFFFFF))
                ) {

                    Text(
                        item, modifier = Modifier.padding(start = 24.dp),
                        fontSize = 14.sp,
                    )
                }
            }
        }

    }

}

@Composable
fun SubHeader() {
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
                    .size(91.dp, 30.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFD0E5F0)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp),

                ) {
                Spacer(Modifier.padding(start = 3.dp))
                Icon(
                    painter = painterResource(id = R.drawable.bugicon),
                    contentDescription = null,
                    tint = Color(0xFF03578A),
                    modifier = Modifier.size(16.dp)

                )
                Text("5 Cheeses", fontSize = 12.sp)
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
}

@Composable
fun Details() {
    Text("Details", modifier = Modifier.fillMaxWidth())
    Row(
        modifier = Modifier
            .padding(top = 12.dp, bottom = 12.dp),
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
}

@Composable
fun BottomButton() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(1.dp, Color(0x1F1F1E1F))
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
                        "3 Chess",
                        fontFamily = null,
                        lineHeight = 16.sp,
                        letterSpacing = 0.5.sp,
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                    )

                    Text(
                        "5 Chess",
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

