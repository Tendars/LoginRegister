package com.example.loginregister.presentation.util.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
//import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginregister.R
//import kotlin.String as String

@Composable
fun NormalTextComponent(value: String){
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style =  TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
        )
}
@Composable
fun HeadingTextComponent(value: String){
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth(),
        style =  TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
}
@ExperimentalMaterial3Api
@Composable
//@ComposableInferredTarget
fun MyTextField(LabelValue: String){
    val textValuee = remember {
        mutableStateOf("")
    }
//    OutlinedTextField(
//        value = textValuee.value,
//        onValueChange = { textValuee = it })
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = LabelValue)},
        value = textValuee.value,
        onValueChange ={ textValuee.value = it},
        colors = TextFieldDefaults.outlinedTextFieldColors(
        ),
//        backgroundColor = colorResource(id = R.color.colorGray),
        keyboardOptions = KeyboardOptions.Default,
    )
}