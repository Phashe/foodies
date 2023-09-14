package com.csc3003s.foodiesii.presentation.customerlogin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.csc3003s.foodiesii.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerLoginPage(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Customer Login",
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 28.sp,
            modifier = Modifier.padding(8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        var username by remember { mutableStateOf(TextFieldValue("")) }

        Spacer(modifier = Modifier.height(16.dp))
        var email by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            label = { Text(text = "Email") },
            value = email,
            onValueChange = { newText ->
                email = newText
            }
        )

        Spacer(modifier = Modifier.height(16.dp))
        var password by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            label = { Text(text = "Password") },
            value = password,
            onValueChange = { newText ->
                password = newText
            },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate(route = Screen.StallOptions.route) },
            modifier = Modifier.size(width = 200.dp, height = 50.dp),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),)
        {
            Text("Login",
                color = Color.White, modifier = Modifier.clickable {navController.navigate(route = Screen.CustomerRegistration.route) })
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 200.dp, height = 50.dp),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),)
        {
            Text("Login with Google", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(32.dp))
        Text("Not registered yet? Click here", color = Color.Black)
    }
}