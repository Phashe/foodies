package com.csc3003s.foodiesii

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.sharp.Email
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csc3003s.foodiesii.presentation.usertype.UserType
import com.csc3003s.foodiesii.presentation.vendorregistration.VendorRegistrationPage
import com.csc3003s.foodiesii.ui.theme.FoodiesIITheme
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.csc3003s.foodiesii.presentation.vendorlogin.ViewMenu

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            SetupNavGraph(navController = navController)
        }
    }
}

/**
@Composable
fun MainPage() {
    // A surface container using the 'background' color from the theme

    FoodiesIITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {
            UserType(navController = NavController())
        }
    }
}

 *@Composable
 * fun LoginPage() {
 *     var username by remember { mutableStateOf("") }
 *     var password by remember { mutableStateOf("") }
 *
 *     Column(
 *         modifier = Modifier
 *             .fillMaxSize()
 *             .padding(16.dp),
 *         horizontalAlignment = Alignment.CenterHorizontally,
 *         verticalArrangement = Arrangement.Center
 *     ) {
 *         Text(
 *             text = "Login",
 *             style = MaterialTheme.typography.h4,
 *             fontSize = 28.sp,
 *             modifier = Modifier.padding(8.dp)
 *         )
 *         Spacer(modifier = Modifier.height(16.dp))
 *
 *         BasicTextField(
 *             value = username,
 *             onValueChange = { username = it },
 *             keyboardOptions = KeyboardOptions.Default.copy(
 *                 imeAction = ImeAction.Next
 *             ),
 *             keyboardActions = KeyboardActions(
 *                 onNext = { /* Handle next action */ }
 *             ),
 *             modifier = Modifier
 *                 .fillMaxWidth()
 *                 .padding(8.dp)
 *                 .background(MaterialTheme.colorScheme.background)
 *                 .padding(8.dp),
 *             textStyle = TextStyle(color = Color.Black),
 *             placeholder = { Text(text = "Username") }
 *         )
 *
 *         Spacer(modifier = Modifier.height(8.dp))
 *
 *         BasicTextField(
 *             value = password,
 *             onValueChange = { password = it },
 *             keyboardOptions = KeyboardOptions.Default.copy(
 *                 imeAction = ImeAction.Done
 *             ),
 *             keyboardActions = KeyboardActions(
 *                 onDone = { /* Handle login action */ }
 *             ),
 *             modifier = Modifier
 *                 .fillMaxWidth()
 *                 .padding(8.dp)
 *                 .background(MaterialTheme.colorScheme.background)
 *                 .padding(8.dp),
 *             textStyle = TextStyle(color = Color.Black),
 *             placeholder = { Text(text = "Password") },
 *             visualTransformation = PasswordVisualTransformation()
 *         )
 *
 *         Spacer(modifier = Modifier.height(16.dp))
 *
 *         Button(
 *             onClick = {
 *                 // Handle login button click
 *                 /* Implement login logic here */
 *             },
 *             modifier = Modifier
 *                 .fillMaxWidth()
 *                 .height(56.dp)
 *         ) {
 *             Text(text = "Login")
 *         }
 *     }
 * }
 *
 *

@Composable
fun Button(onClick: () -> Unit, modifier: Any, content: () -> Unit) {

}
 **/




/** Customer Composables**/




/** Customer Views**/

/** Guest Composables



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var presses by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0XFF0F9D58)),

                title = {

                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Stall Options",
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            VendorRegistrationPage(navController = NavController())
        }
    }
}


 **/


/**Previews**/
/**
 *
 *
@Preview(showBackground = true)
@Composable
fun StallOptionsPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
StallOptions()
}
}
}
@Preview(showBackground = true)
@Composable
fun GuestSignInPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
GuestSignInPage()
}
}
}

@Preview(showBackground = true)
@Composable
fun CustomerLoginPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
CustomerLoginPage()
}
}
}

@Preview(showBackground = true)
@Composable
fun CustomerRegistrationPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
CustomerRegistrationPage()
}
}
}

@Preview(showBackground = true)
@Composable
fun VendorHomePreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
VendorHomePage()
}
}
}

/**General Views**/
@Preview(showBackground = true)
@Composable
fun UserTypePreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
UserType()
}
}
}

/** Vendor Previews**/
@Preview(showBackground = true)
@Composable
fun VendorLoginPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
VendorLoginPage()
}
}
}

@Preview(showBackground = true)
@Composable
fun VendorRegistrationPreview() {
FoodiesUITheme {
Surface(
modifier = Modifier
.fillMaxSize()) {
VendorRegistrationPage()
}
}
}



@Preview(showBackground = true)
@Composable
fun ScaffoldViewPreview() {
    FoodiesIITheme{Surface(
            modifier = Modifier
                .fillMaxSize()) {
        UserType(navController = navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun vendorMenuPreview() {
    FoodiesIITheme{Surface(
        modifier = Modifier
            .fillMaxSize()) {
                ViewMenu()
            }
    }
}
**/