package com.example.tutorialprofileapp2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier
) {
    OutlinedCard(
            modifier = modifier,
            border = BorderStroke(3.dp, color = Color.Green),
            shape = RoundedCornerShape(15.dp)
        ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            TemplateText(hobby = "test1", descriptionText = "abc")
            TemplateText(hobby = "test2", descriptionText = "def")
            TemplateText(hobby = "test3", descriptionText = "ghi")
            TemplateText(hobby = "test4", descriptionText = "jkl")
            TemplateText(hobby = "test5", descriptionText = "mno")
            TemplateText(hobby = "test6", descriptionText = "pqr")
            TemplateText(hobby = "test7", descriptionText = "stu")
            TemplateText(hobby = "test8", descriptionText = "vwx")
            TemplateText(hobby = "test9", descriptionText = "yz")
        }
    }
}

@Composable
fun TemplateText(hobby: String, descriptionText: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Text(
            text = hobby,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .width(120.dp)
                .background(Color(0xFFf0f0f0))
                .border(1.dp, Color.Black, RoundedCornerShape(3.dp))
                .padding(start = 3.dp)
        )
        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = descriptionText,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Preview
@Composable
fun PreviewDetailScreen(){
    Surface {
        DetailScreen()
    }
}

@Preview
@Composable
fun PreviewTemplateText(){
    Surface {
        TemplateText(hobby = "ジョギング", descriptionText = "毎朝42.195km走ってから学校に行きます．")
    }
}