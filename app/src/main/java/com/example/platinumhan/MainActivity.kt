package com.example.platinumhan

import android.location.Location
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.Adapter
//import com.example.platinumhan.adapter.CommonList
import com.example.platinumhan.data.Cloth
import com.example.platinumhan.ui.login.LoginScreen
import com.example.platinumhan.ui.theme.Blue80
import com.example.platinumhan.ui.theme.BlueGrey80
import com.example.platinumhan.ui.theme.PlatinumhanTheme
import com.example.platinumhan.ui.theme.PurpleGrey80
import com.google.android.material.snackbar.Snackbar


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }

    }



}


