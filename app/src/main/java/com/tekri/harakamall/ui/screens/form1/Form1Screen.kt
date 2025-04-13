package com.tekri.harakamall.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.R
import com.tekri.harakamall.ui.theme.neworange
import com.tekri.harakamall.ui.theme.newwhite

@Composable
fun Form1Screen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()

    ){

        Box(){
           Column {
               Card(
                   modifier = Modifier.background(Color.Blue),

               ) {
                   Row {
                       Image(
                           painter = painterResource(R.drawable.cart),
                           contentDescription = "cart",
                       )
                       Text(
                           text = "Logo App",
                           fontSize = 40.sp,
                           fontWeight = FontWeight.ExtraBold
                       )

                   }
                   Image(
                       painter = painterResource(R.drawable.fruits),
                       contentDescription = "fruit",
                       modifier = Modifier.size(400.dp)
                   )
               }
               Spacer(modifier = Modifier.height(20.dp))

               Card(
                   modifier = Modifier.fillMaxWidth().background(newwhite).fillMaxHeight(),
                   shape = RoundedCornerShape(20.dp),



                   ) {
                   Text(
                       text = "The Most Worth Grocery App",
                       fontSize = 30.sp,
                       color = neworange,
                       textAlign = TextAlign.Center,
                       modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                   )
                   var username by remember { mutableStateOf("") }
                   //Username
                   OutlinedTextField(
                       value = username,
                       onValueChange = {username= it},
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp ,end=20.dp),
                       leadingIcon = { Icon(imageVector =  Icons.Default.AccountCircle, contentDescription="")},
                       label = {Text(text = "Username")},
                       colors = OutlinedTextFieldDefaults.colors(
                           focusedBorderColor = neworange,
                           focusedLabelColor = neworange,
                           unfocusedBorderColor = Color.Black
                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                       shape = AbsoluteRoundedCornerShape(20.dp),

                       )

                   //End

                   Spacer(modifier = Modifier.height(20.dp))
                   var password by remember { mutableStateOf("") }
                   //Password
                   OutlinedTextField(
                       value = password,
                       onValueChange = {password= it},
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp ,end=20.dp),
                       leadingIcon = { Icon(imageVector =  Icons.Default.Lock, contentDescription="")},
                       label = {Text(text = "Password")},
                       colors = OutlinedTextFieldDefaults.colors(
                           focusedBorderColor = neworange,
                           focusedLabelColor = neworange,
                           unfocusedBorderColor = Color.Black

                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                       visualTransformation = PasswordVisualTransformation(),
                       shape = AbsoluteRoundedCornerShape(20.dp),


                       )

                   //End

                   Spacer(modifier = Modifier.height(20.dp))
                   Button(
                       onClick = {

                       },
                       colors = ButtonDefaults.buttonColors(neworange),
                       shape = AbsoluteRoundedCornerShape(20.dp),
                       modifier = Modifier.fillMaxWidth().padding(start= 20.dp, end=20.dp)

                   ) {
                       Text(text = "Sign Up")
                   }
                   Spacer(modifier = Modifier.height(20.dp))


                   Row(){
                       Text(
                           text = "Already a member ?",
                           modifier = Modifier.padding(start = 50.dp)
                       )
                   }

               }
           }
        }



    }


}
@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())

}