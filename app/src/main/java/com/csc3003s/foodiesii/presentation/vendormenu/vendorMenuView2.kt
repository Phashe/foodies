package com.csc3003s.foodiesii.presentation.vendorlogin
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.gson.Gson // Import Gson for parsing JSON data

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantMenu(jsonData: String) {
    // Parse the JSON data into a data class
    val restaurant = remember {
        Gson().fromJson(jsonData, Restaurant::class.java)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = restaurant.name) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),

        ){
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(restaurant.items) { item ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(text = item.name, style = MaterialTheme.typography.bodySmall)
                            Text(text = "Price: $${item.price}", style = MaterialTheme.typography.bodySmall)
                            Text(text = item.availability, style = MaterialTheme.typography.bodySmall)
                            Text(text = item.preparedness, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}

data class Restaurant(
    val name: String,
    val items: List<MenuItem>,
    val dietaryRequirements: String,
    val cuisine: String
)

data class MenuItem(
    val name: String,
    val price: Double,
    val availability:String,
    val preparedness:String,
)

@Composable
fun ViewMenu(navController: NavController){
    val jsonData = """
{
  "name": "Budget Rolls",
  "dietaryRequirements": "Vegetarian",
  "cuisine": "Asian Fusion",
  "items": [
    { "name": "Filter Coffee", "price": 18.00,"availability":"available","preparedness":"pre-prepared"},
    { "name": "Hot Chocolate", "price": 25.00,"availability":"available","preparedness":"prepared" },
    { "name": "Chocochino", "price": 25.00,"availability":"available","preparedness":"pre-prepared" },
    { "name": "Five Roses Tea", "price": 10.00,"availability":"unavailable","preparedness":"prepared" },
    { "name": "Rooibos Tea", "price": 10.00,"availability":"available","preparedness":"pre-prepared" },
    { "name": "Chai Latte", "price": 18.00,"availability":"unavailable","preparedness":"pre-prepared" }
  ]
}
"""
    RestaurantMenu(jsonData)
}