package com.tekri.harakamall.ui.screens.vp

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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.tekri.harakamall.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VpScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("CONTACT") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = neworange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = neworange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = neworange
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        //content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                Column(
                    modifier = Modifier.fillMaxSize()
                        .background(neworange)
                        .verticalScroll(rememberScrollState())
                ) {

                    //Box


                        //card
                        Card(
                            modifier = Modifier.fillMaxWidth().height(300.dp),
                            colors = CardDefaults.cardColors(newwhite )
                        ) {
                            Text(
                                text = "WELCOME TO MY APP , HARAKAMALL",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Row(modifier = Modifier.padding(start = 20.dp)) {
                                //card1
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(180.dp)
                                        .clickable { navController.navigate(ROUT_HOME) },
                                    elevation = CardDefaults.cardElevation(10.dp)
                                ) {
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
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(180.dp)
                                        .clickable { navController.navigate(ROUT_ABOUT) },
                                    elevation = CardDefaults.cardElevation(10.dp)
                                ) {
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


                        }
                        //End of Card

                        Card(
                            modifier = Modifier.fillMaxWidth().height(300.dp)
                                .padding(start = 20.dp, end = 20.dp).offset(y = 90.dp)
                        ) {
                            //CONTENTS OF CARD
                            Row {

                                Spacer(modifier = Modifier.width(20.dp))



                            }
                        }


                    //End of box
                    Spacer(modifier = Modifier.height(100.dp))
                    //row
                    Row(modifier = Modifier.padding(start = 20.dp)) {
                        //card1
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(180.dp)
                                .clickable { navController.navigate(ROUT_HOME) },
                            elevation = CardDefaults.cardElevation(10.dp)
                        ) {
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
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(180.dp)
                                .clickable { navController.navigate(ROUT_ABOUT) },
                            elevation = CardDefaults.cardElevation(10.dp)
                        ) {
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


                }
            }


            //End of scaffold
        })}
@Preview(showBackground = true)
@Composable
fun VpScreenPreview(){
    VpScreen(rememberNavController())
}
