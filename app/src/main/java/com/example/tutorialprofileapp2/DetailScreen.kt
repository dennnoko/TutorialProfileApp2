package com.example.tutorialprofileapp2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DetailScreen() {
    Box(modifier = Modifier.padding(30.dp)) { //枠と要素を重ねる
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            templateText(hobby = "test1", descriptionText = "abc")
            templateText(hobby = "test2", descriptionText = "def")
            templateText(hobby = "test3", descriptionText = "ghi")
            templateText(hobby = "test4", descriptionText = "jkl")
            templateText(hobby = "test5", descriptionText = "mno")
            templateText(hobby = "test6", descriptionText = "pqr")
            templateText(hobby = "test7", descriptionText = "stu")
            templateText(hobby = "test8", descriptionText = "vwx")
            templateText(hobby = "test9", descriptionText = "yz")
        }

        //枠を追加
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White.copy(alpha = 0f), RoundedCornerShape(15.dp))
                .border(3.dp, Color.Green, RoundedCornerShape(15.dp))
        )
    }
}

@Composable
fun templateText(hobby: String, descriptionText: String) {
    Row(modifier = Modifier.padding(10.dp)) {
        Text(
            text = hobby,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .width(120.dp)
                .background(Color(0xFFf0f0f0))
                .border(1.dp, Color.Black, RoundedCornerShape(3.dp))
                .padding(3.dp, 0.dp, 0.dp, 0.dp)
        )
        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = descriptionText,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}