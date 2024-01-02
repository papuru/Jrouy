package com.example.platinumhan.ui.login

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.platinumhan.R
import com.example.platinumhan.ui.view.Index


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val account = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    var isLogin = remember {
        mutableStateOf(false)
    }

    if (isLogin.value) {
        Index()
    } else {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.LightGray
        ) {
            Image(
                painter = painterResource(id = R.drawable.rectangle_1),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                alignment = Alignment.TopCenter
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hchtm),
                    contentDescription = "A7",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(20))
                        .background(Color(255, 255, 255))
                        .padding(horizontal = 5.dp),
                )
                Text(
                    text = "海宁中国家纺城",
                    modifier = Modifier.padding(24.dp),
                    color = Color.White,
                    fontWeight = FontWeight.W500,
                    fontSize = 25.sp
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp, vertical = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                loginForm(account = account, password = password, isLogin = isLogin)
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginForm(
    account: MutableState<String>, password: MutableState<String>,
    isLogin: MutableState<Boolean>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
                ,
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                color = Color.Gray,
                modifier = Modifier.padding(vertical = 16.dp),
                text = "欢迎回来",
                fontSize = 15.sp
            )
        }
        OutlinedTextField(value = account.value,
            onValueChange = { account.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            label = { Text(text = "手机号") },
            singleLine = true,
            trailingIcon = {
                Icon(imageVector = Icons.Filled.Clear, contentDescription = "clear")
            },
            supportingText = {
                Row {
                    Text(text = "*必要选项")
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "20/20")
                }
            }
        )
        OutlinedTextField(value = password.value,
            onValueChange = { password.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            label = { Text(text = "验证码") },
            singleLine = true,
            trailingIcon = {
                TextButton(
                    onClick = {

                    },
                    modifier = Modifier.padding(horizontal = 5.dp)
                ) {
                    Text(text = "获取验证码")
                }
            }
        )
        Button(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 15.dp)
                .fillMaxWidth(),
            elevation = ButtonDefaults.elevatedButtonElevation(),
            shape = RoundedCornerShape(20),
            onClick = {
//                isLogin.value = true
            }) {
            Text(text = "登录")
        }
    }
}

@Preview
@Composable
fun preLogin() {
    LoginScreen()
}