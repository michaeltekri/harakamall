package com.tekri.harakamall.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.R
import com.tekri.harakamall.navigation.ROUT_DASHBOARD
import com.tekri.harakamall.ui.theme.neworange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
        .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.cart),
            contentDescription = "cart",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Create an account",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //Fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname= it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp ,end=20.dp),
            leadingIcon = { Icon(imageVector =  Icons.Default.Person, contentDescription="")},
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //End

        Spacer(modifier = Modifier.height(20.dp))

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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //End

        Spacer(modifier = Modifier.height(20.dp))

        //EmailADDRESS
        OutlinedTextField(
            value = email,
            onValueChange = {email= it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp ,end=20.dp),
            leadingIcon = { Icon(imageVector =  Icons.Default.Email, contentDescription="")},
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        //End

        Spacer(modifier = Modifier.height(20.dp))


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
            visualTransformation = PasswordVisualTransformation()

        )

        //End

        Spacer(modifier = Modifier.height(20.dp))

        //Confirm Password
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword= it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp ,end=20.dp),
            leadingIcon = { Icon(imageVector =  Icons.Default.Lock, contentDescription="")},
            label = {Text(text = "Confirm password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        //End

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start= 20.dp, end=20.dp)

        ) {
            Text(text = "Register")
        }



    }

}
@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())

}

