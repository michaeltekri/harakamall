package com.tekri.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.R

@Composable
fun HomeScreen(navController: NavController){
   Column (
       modifier = Modifier.fillMaxSize()
           .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)
   ) {
       Text(
           text = "HarakaMall",
           fontSize = 30.sp,
           color= Color.Magenta,
           fontWeight = FontWeight.ExtraBold
       )
       Image(
           painter = painterResource(R.drawable.camera),
           contentDescription = "camera"
       )
       Text(
           text = "Welcome to my app",
           fontSize = 15.sp,
           fontStyle = FontStyle.Italic
       )
       Text(
           text = "Haraka Mobility provides mobility equipment inside The Mall, which includes manual wheelchairs, special needs chairs, childrens chairs, power chairs",
           fontSize = 15.sp,
           fontWeight = FontWeight.Bold
       )
       Button(
           onClick = {},
           colors = ButtonDefaults.buttonColors(Color.Cyan),
           shape = RoundedCornerShape(10.dp)
       ) {
           Text(text = "Add to Cart")
       }
   }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}
