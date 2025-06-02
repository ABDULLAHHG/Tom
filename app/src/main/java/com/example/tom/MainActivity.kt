package com.example.tom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tom.screen.JerryStore
import com.example.tom.screen.TomKitchen
import com.example.tom.ui.theme.TomTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomTheme {
//                TomKitchen()
                JerryStore()
            }
        }
    }
}
