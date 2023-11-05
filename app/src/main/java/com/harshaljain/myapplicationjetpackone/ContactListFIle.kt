package com.harshaljain.myapplicationjetpackone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable()
fun  AllContactView(){
//    Column(
//        modifier = Modifier.verticalScroll(rememberScrollState())
//    ) {
////getContacts().map {
////    item -> myCardItem(imgId = item.imgId, name = item.name, phone = item.phone, modifier = Modifier.background(
////    Color.White
////))}
//
//
//    }


    LazyColumn(content = {
        items(getContacts()){
                item -> myCardItem(imgId = item.imgId, name = item.name, phone = item.phone,
            modifier = Modifier.background(Color.White))
        }
    })
}



@Composable
fun myCardItem(imgId: Int , name:String, phone: String, modifier: Modifier){
    Row(
//       size, padding, margin, alignment, background color
        modifier = modifier.padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center

    ){
        Image(painter = painterResource(id = imgId), contentDescription = "somthing",
            modifier = Modifier
                .clip(CircleShape)
                .border(2.dp, Color.Blue, CircleShape)
                .weight(.3f)
        )
        Column(
            modifier = Modifier
                .padding(10.dp)
                .weight(.7f)

        ) {
            Text(text = name,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp
            )
            Text(text = phone,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )

        }
    }
}


data class Contact(val imgId: Int, val name:String , val phone:String)


fun getContacts():
        MutableList<Contact>{
    val list = mutableListOf<Contact>()
    list.add(Contact(R.drawable.ic_launcher_foreground, "Harshal","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_background, "Viraj","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_foreground, "Harshal","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_background, "Viraj","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_foreground, "Harshal","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_background, "Viraj","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_foreground, "Harshal","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_background, "Viraj","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_foreground, "Harshal","+91 7000896210"))
    list.add(Contact(R.drawable.ic_launcher_background, "Viraj","+91 7000896210"))

    return  list
}