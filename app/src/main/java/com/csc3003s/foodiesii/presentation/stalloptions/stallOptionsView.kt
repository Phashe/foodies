package com.csc3003s.foodiesii.presentation.stalloptions

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StallOptions(navController: NavController){
    val paddingModifier  = Modifier.padding(10.dp)
    Card(elevation = CardDefaults.elevatedCardElevation(defaultElevation = 10.dp), modifier = paddingModifier) {
        Column {
            Text(text = "Simple Card with elevation",
                modifier = paddingModifier)
            Text(text = "Simple Card with elevation",
                modifier = paddingModifier)
        }
    }
}