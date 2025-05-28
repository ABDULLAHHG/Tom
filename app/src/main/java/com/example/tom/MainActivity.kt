package com.example.tom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
                    Column(
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

                        Text("Electric Tom pasta", fontSize = 16.sp)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.CenterVertically

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.heart),
                                contentDescription = null,
                                tint = Color(0xFF03578A),
                                modifier = Modifier.size(16.dp)
                            )
                        }
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
                }
            }
        }
    }
}

