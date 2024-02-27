package com.example.platinumhan.ui.login

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.example.platinumhan.R
import com.example.platinumhan.ui.theme.primaryLight
import com.example.platinumhan.ui.view.Index
import com.example.platinumhan.ui.view.User
import java.util.logging.Logger
import kotlin.math.log


@Composable
fun LoginScreen(

) {


    val isLogin = remember {
        mutableStateOf(false)
    }
    val user1 = User("ethen", "dsadasfdfsad")

    val context = LocalContext.current


    SideEffect {
        Log.d("LoginScreen", "$context")
    }


    if (isLogin.value) {
        Index(user1)
    } else {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hchtm),
                    contentDescription = "A7",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(20))
                        .padding(horizontal = 5.dp),
                )
                Text(
                    text = "海宁中国家纺城",
                    modifier = Modifier.padding(24.dp),
                    color = Color.LightGray,
                    fontWeight = FontWeight.W500,
                    fontSize = 25.sp
                )
                LoginForm(isLogin = isLogin)
            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginForm(
    isLogin: MutableState<Boolean>
) {

    var count by remember {
        mutableStateOf(0)
    }

    val account = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val localView = LocalView.current;


    val context = LocalContext.current


    SideEffect {
        Log.d("LoginForm", "$context")
    }


    TextField(
        value = account.value,
        onValueChange = { account.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        placeholder = { Text(text = "手机号") },
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            placeholderColor = Color.LightGray
        ),
    )
    TextField(
        value = password.value,
        onValueChange = {
            password.value = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        placeholder = { Text(text = "验证码") },
        singleLine = true,
        trailingIcon = {
            TextButton(
                onClick = {

                },
                modifier = Modifier.padding(horizontal = 5.dp)
            ) {
                Text(text = "获取验证码")
            }
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            placeholderColor = Color.LightGray
        ),
    )
    Button(
        modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 15.dp)
            .fillMaxWidth(),
        elevation = ButtonDefaults.elevatedButtonElevation(),
        shape = RoundedCornerShape(50),
        onClick = {
//                isLogin.value = true
            count++
        }) {
        Text(text = "登录")
    }
}


@Preview
@Composable
fun PreLogin() {
    LoginScreen()
}