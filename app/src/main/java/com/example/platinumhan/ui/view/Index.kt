package com.example.platinumhan.ui.view

import android.view.Window
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LifecycleOwner
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Stable
data class User(val name: String, val token: String)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Index(user: User,

) {
    val snackbarHostState = remember {
        SnackbarHostState()
    }

    val reComposableKey = remember {
        mutableStateOf(false)
    }

    val stableUser by rememberUpdatedState(newValue = user)

    val scope = rememberCoroutineScope()

//    LaunchedEffect(Unit) {
//        delay(3000L)
//        snackbarHostState.showSnackbar(stableUser.name)
//        println("get it")
//    }




    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        modifier = Modifier
            .fillMaxWidth()
    ) { innerPadding ->
        Surface(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            Row(

            ) {

                Text(text = "${user.name},${user.token}")
                Button(onClick = {
                    reComposableKey.value = true
                    scope.launch {
                        snackbarHostState.showSnackbar(stableUser.name)
                    }
                }) {
                    Text(text = "显示snackBar")
                }
            }
        }


    }
}


@Preview
@Composable
fun preIndex() {
    Index(user = User("ttt", "refdsf"))
}