/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.ui.vendoradmin

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.inventory.InventoryTopAppBar
import com.example.inventory.R
import com.example.inventory.data.Item
import com.example.inventory.ui.AppViewModelProvider
import com.example.inventory.ui.home.HomeViewModel
import com.example.inventory.ui.item.formatedPrice
import com.example.inventory.ui.navigation.NavigationDestination
import com.example.inventory.ui.theme.InventoryTheme

object VendorAdminDestination : NavigationDestination {
    override val route = "vendor_admin"
    override val titleRes = R.string.vendor_admin
}

/**
 * Entry route for Home screen
 */
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun VendorAdminScreen(
    navigateToMenu: () -> Unit,
    modifier: Modifier = Modifier,

) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(text = stringResource(R.string.vendor_admin))
        
        Button(
            onClick = {
                navigateToMenu
            },
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
        ) {
            Text(text = stringResource(R.string.manage_menu))
        }

        Button(
            onClick = {
                navigateToMenu
            },
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
        ) {
            Text(text = stringResource(R.string.read_reviews))
        }

        Button(
            onClick = {
                navigateToMenu
            },
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
        ) {
            Text(text = stringResource(R.string.logout))
        }

        Button(
            onClick = {
                navigateToMenu
            },
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
        ) {
            Text(text = stringResource(R.string.exit))
        }
    }

}


