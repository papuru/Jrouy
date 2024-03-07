package com.example.platinumhan

import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen
import com.example.platinumhan.ui.login.LoginScreen
import com.example.platinumhan.ui.theme.MyAppTheme
//import com.example.platinumhan.adapter.CommonList
import com.example.platinumhan.ui.view.Index
import com.example.platinumhan.ui.view.User


class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
//            val windowSizeClass: WindowSizeClass = calculateWindowSizeClass(this)
//            var isEx = windowSizeClass.heightSizeClass !=  WindowHeightSizeClass.Compact
            MyAppTheme {
                LoginScreen()
            }
        }

    }


}


@Preview
@Composable
fun preApp() {
    LoginScreen()
}