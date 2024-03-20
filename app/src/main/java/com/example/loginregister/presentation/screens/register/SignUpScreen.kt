package com.example.loginregister.presentation.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginregister.R
import com.example.loginregister.presentation.util.components.HeadingTextComponent
import com.example.loginregister.presentation.util.components.MyTextField
import com.example.loginregister.presentation.util.components.NormalTextComponent

@ExperimentalMaterial3Api
@Composable
fun SignUpScreen(){
Surface(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(28.dp),

    ) {
    Column(modifier = Modifier.fillMaxSize()) {
        NormalTextComponent(value = stringResource(id = R.string.hello))
        HeadingTextComponent(value = stringResource(id = R.string.create_Account))
        MyTextField( LabelValue = "FullName")
    }


}
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}