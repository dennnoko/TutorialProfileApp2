package com.example.tutorialprofileapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorialprofileapp2.ui.theme.TutorialProfileApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate() はアプリで最初に実行されるメソッド
        super.onCreate(savedInstanceState)
        setContent {
            TutorialProfileApp2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Profile App", //表示する文をString型で与える
            fontSize = 20.sp, //font のサイズにはspを指定する  Androidの文字サイズの設定などを反映できるようにするため
            fontWeight = FontWeight.Bold, //fontWeight で文字の太さを変更できる
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(20.dp, 10.dp) //余白の設定
        )
        Spacer(modifier = Modifier.height(10.dp))

        Image( //画像を表示するコンポーザブル関数
            painter = painterResource(id = R.drawable.icon), //画像を指定 今回はidで指定している.  R：resource(リソース)のR resフォルダが該当する. drawable.icon フォルダ名とファイル名
            contentDescription = "画像の説明を書く",
            modifier = Modifier //modifier で修飾
                .size(150.dp) // 画像のサイズを指定
                .clip(RoundedCornerShape(10.dp)) // 画像の角を丸くする
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "でんのこ",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Text(
            text = "所属",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth() //要素の横幅をできるだけ広げる
                .height(80.dp) //要素の高さを指定
                .padding(10.dp) //周囲に余白を作る
                .background(Color.Green, RoundedCornerShape(8.dp)) //背景を角のまるい緑色にする
                .padding(15.dp) //背景の内側に余白を作る
        )

        Text(
            text = "・名古屋工業大学\n・C0de\n・niC",
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
        )

        var dScreen by remember { mutableStateOf(false) }

        Button(
            onClick = { dScreen = !dScreen }, //ボタンが押された時の処理
            colors = ButtonDefaults.buttonColors(Color.Green), //Button の色は colors で指定する ※ボタンは押したときに色が変化するので色の指定方法がそれに対応するようになっている
            shape = RoundedCornerShape(5.dp), //形が角の丸まり具合を指定
        ) {
            Text(
                text = "詳細",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }

        if(dScreen == true) {
            DetailScreen()
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen(){
    Surface {
        MainScreen()
    }
}

