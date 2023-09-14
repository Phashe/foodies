package com.csc3003s.foodiesii.presentation.usertype

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.csc3003s.foodiesii.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserType(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Choose User Type",
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 28.sp,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row{
            Button(onClick = { navController.navigate(route = Screen.VendorLogin.route) },
                modifier = Modifier.size(width = 150.dp, height = 50.dp),
                elevation =  ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),)
            {
                Text("Vendor", color = Color.White)
            }

            Button(onClick = { navController.navigate(route = Screen.CustomerLogin.route) },
                modifier = Modifier.size(width = 150.dp, height = 50.dp),
                elevation =  ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),)
            {
                Text("Customer", color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(route = Screen.GuestLogin.route) },
            modifier = Modifier.size(width = 150.dp, height = 50.dp),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),)
        {
            Text("Guest", color = Color.White)
        }
    }
}