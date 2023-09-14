package com.csc3003s.foodiesii

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.csc3003s.foodiesii.presentation.customerlogin.CustomerLoginPage
import com.csc3003s.foodiesii.presentation.customerregistration.CustomerRegistrationPage
import com.csc3003s.foodiesii.presentation.customerreviews.CustomerReviewsPage
import com.csc3003s.foodiesii.presentation.customerreviewsqrscan.CustomerReviewsQRScanPage
import com.csc3003s.foodiesii.presentation.guestsignin.GuestSignInPage
import com.csc3003s.foodiesii.presentation.stalloptions.StallOptions
import com.csc3003s.foodiesii.presentation.usertype.UserType
import com.csc3003s.foodiesii.presentation.vendoradmin.VendorAdminView
import com.csc3003s.foodiesii.presentation.vendorlogin.VendorLoginPage
import com.csc3003s.foodiesii.presentation.vendorregistration.VendorRegistrationPage
import com.csc3003s.foodiesii.presentation.vendorreviews.VendorReviewsViewPage

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.UserType.route
    ){
        composable(
            Screen.UserType.route //
        ){
            UserType(navController)
        }
        composable(
            Screen.CustomerLogin.route //
        ){
            CustomerLoginPage(navController)
        }
        composable(
            route = Screen.VendorLogin.route //
        ){
            VendorLoginPage(navController)

        }
        composable(
            route = Screen.GuestLogin.route //
        ){
            GuestSignInPage(navController)
        }
        composable(
            route = Screen.CustomerRegistration.route //
        ){
            CustomerRegistrationPage(navController)
        }
        composable(
            route = Screen.StallOptions.route //
        ){
            StallOptions(navController)
        }
        composable(
            route = Screen.CustomerReviews.route //
        ){
            CustomerReviewsPage(navController)
        }
        composable(
            route = Screen.CustomerReviewsScanQR.route //
        ){
            CustomerReviewsQRScanPage(navController)
        }
        composable(
            route = Screen.VendorViewReviews.route //
        ){
            VendorReviewsViewPage(navController)
        }
        composable(
            route = Screen.VendorRegistration.route //
        ){
            VendorRegistrationPage(navController)
        }
        composable(
            route = Screen.VendorAdmin.route //
        ){
            VendorAdminView(navController)
        }
    }
}

/**
 *object UserType: Screen(route = "user_type_screen")
 *     object CustomerLogin: Screen(route = "customer_login_screen")//
 *     object VendorLogin: Screen(route = "vendor_login_screen")//
 *     object GuestLogin: Screen(route = "guest_login_screen")//
 *     object CustomerRegistration: Screen(route = "customer_registration_screen")//
 *     object StallOptions: Screen(route = "customer_stall__options_screen") //
 *     object CustomerReviews:Screen(route = "customer_reviews_screen") //
 *     object CustomerReviewsScanQR:Screen(route = "customer_reviews_scan_qr_screen") //
 *     object VendorViewReviews:Screen(route = "vendor_view_reviews_screen") //
 *     object VendorRegistration: Screen(route = "vendor_registration_screen")
 *     object VendorAdmin: Screen(route = "vendor_admin_screen")
 * **/