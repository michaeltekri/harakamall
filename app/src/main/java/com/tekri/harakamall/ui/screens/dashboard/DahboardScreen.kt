package com.tekri.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.R
import com.tekri.harakamall.navigation.ROUT_ABOUT
import com.tekri.harakamall.navigation.ROUT_HOME
import com.tekri.harakamall.navigation.ROUT_ITEM
import com.tekri.harakamall.ui.theme.neworange
import com.tekri.harakamall.ui.theme.neworange1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()
        .background(neworange)
        .verticalScroll(rememberScrollState())
    ) {
        TopAppBar(
            title = { Text("Dashboard Section") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            }

        )
        //Box

        Box(){
            //card
            Card(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworange1)
            ) {
                Text(
                    text = "WELCOME TO MY APP , HARAKAMALL",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold
                )




            }
            //End of Card

            Card(
                modifier = Modifier.fillMaxWidth().height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp,end=20.dp).offset(y=90.dp)
            ) {
                //CONTENTS OF CARD
               Row {
                   //Image
                   Image(
                       painter = painterResource(R.drawable.birds),
                       contentDescription = "birds",
                       modifier = Modifier.size(100.dp)


                   )
                   Spacer(modifier = Modifier.width(20.dp))

                   Text(text = "a very large building or buildings containing a lot of stores and often restaurants, and usually with space around it outside for parking: Judy likes to hang out at the mall with her friends. A mall is also a street in a city or town with a lot of stores and that is closed to traffic."
                       , fontSize = 15.sp)

               }
            }

        }
        //End of box
        Spacer(modifier = Modifier.height(100.dp))
        //row
        Row (modifier = Modifier.padding(start = 20.dp)){
            //card1
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_HOME)},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "HOME", fontSize = 15.sp)
                }
            }
            //end of card1
            Spacer(modifier = Modifier.width(40.dp))
            //card2
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ABOUT)},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "about",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "ABOUT", fontSize = 15.sp)
                }
            }
            //end of card2


        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))


        //row
        Row (modifier = Modifier.padding(start = 20.dp)){
            //card3
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ABOUT)},

                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "contact",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "CONTACT", fontSize = 15.sp)
                }
            }
            //end of card3
            Spacer(modifier = Modifier.width(20.dp))
            //card4
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ITEM)},

                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "product",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "PRODUCTS", fontSize = 15.sp)
                }
            }
            //end of card4


        }
        //end of row

    }

}
@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}