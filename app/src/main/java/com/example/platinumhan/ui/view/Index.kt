package com.example.platinumhan.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Index() {
    val snackbarHostState = remember {
        SnackbarHostState()
    }
    val isDisplay = remember {
        mutableStateOf(false)
    }
    LaunchedEffect(isDisplay.value) {
        if (isDisplay.value){
            snackbarHostState.showSnackbar("  you see me")
        }
    }
    Scaffold(
        snackbarHost = {
            SnackbarHost( hostState = snackbarHostState)
        }
    ) {
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Text(text = "snackBarScreen")
            Button(onClick = {
                isDisplay.value = !isDisplay.value
            }) {
                Text(text = "显示snackBar")
            }
        }

    }
}