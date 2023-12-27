package com.example.platinumhan.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 25.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.hchtm),
                contentDescription = "A7",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            Text(
                color = Color(185, 185, 185, 255),
                modifier = Modifier.padding(vertical = 16.dp),
                text = "欢迎回来"
            )
            OutlinedTextField(value = account.value,
                onValueChange = { account.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
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
                    .padding(horizontal = 10.dp),
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
                    isLogin.value = true
                }) {
                Text(text = "登录")
            }
        }
    }
}
@Preview
@Composable
fun preLogin() {
    LoginScreen()
}