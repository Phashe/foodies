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

package com.example.inventory.ui.vendor_list

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.inventory.R
import com.example.inventory.ui.navigation.NavigationDestination

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
fun VendorListScreen(
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


