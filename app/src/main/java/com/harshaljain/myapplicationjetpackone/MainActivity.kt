package com.harshaljain.myapplicationjetpackone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harshaljain.myapplicationjetpackone.ui.theme.MyApplicationJetpackOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
myScreen1()
        }
    }
}


@Preview (showBackground = true, name = "myscreen1", showSystemUi = true)
@Composable
fun myScreen1(){
    AllContactView()
}




//@Composable
//fun myFunc1(){
//
////    Box(contentAlignment = Alignment.Center){
////                Text(
////            text = "t1",
////            fontSize = 24.sp,
////            fontWeight = FontWeight.Bold,
////            color = Color.Red,
////            textAlign = TextAlign.Center,
////        )
////
////        Text(
////            text = "t2",
////            fontSize = 24.sp,
////            fontWeight = FontWeight.Bold,
////            color = Color.Blue,
////            textAlign = TextAlign.Center,
////        )
////    }
//
////    Row(
////        horizontalArrangement = Arrangement.Center,
////        verticalAlignment = Alignment.CenterVertically
////    ) {
////        Text(
////            text = "t1",
////            fontSize = 24.sp,
////            fontWeight = FontWeight.Bold,
////            color = Color.Red,
////            textAlign = TextAlign.Center,
////        )
////
////        Text(
////            text = "t2",
////            fontSize = 24.sp,
////            fontWeight = FontWeight.Bold,
////            color = Color.Blue,
////            textAlign = TextAlign.Center,
////        )
////    }
//
////             Column(
////                 verticalArrangement = Arrangement.SpaceAround,
////                 horizontalAlignment = Alignment.CenterHorizontally
////             ) {
////                 Text(
////                     text = "t1",
////                     fontSize = 24.sp,
////                     fontWeight = FontWeight.Bold,
////                     color = Color.Red,
////                     textAlign = TextAlign.Center,
////                 )
////
////                 Text(
////                     text = "t2",
////                     fontSize = 24.sp,
////                     fontWeight = FontWeight.Bold,
////                     color = Color.Blue,
////                     textAlign = TextAlign.Center,
////                 )
////
////
////                 Text(
////                     text = "t3",
////                     fontSize = 24.sp,
////                     fontWeight = FontWeight.Bold,
////                     color = Color.Blue,
////                     textAlign = TextAlign.Center,
////                 )
////             }
//}



