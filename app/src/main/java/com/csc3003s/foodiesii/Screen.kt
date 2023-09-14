package com.csc3003s.foodiesii

sealed class Screen (val route: String){
    object UserType: Screen(route = "user_type_screen")
    object CustomerLogin: Screen(route = "customer_login_screen")
    object VendorLogin: Screen(route = "vendor_login_screen")
    object GuestLogin: Screen(route = "guest_login_screen")
    object CustomerRegistration: Screen(route = "customer_registration_screen")
    object StallOptions: Screen(route = "customer_stall__options_screen")
    object CustomerReviews:Screen(route = "customer_reviews_screen")
    object CustomerReviewsScanQR:Screen(route = "customer_reviews_scan_qr_screen")
    object VendorViewReviews:Screen(route = "vendor_view_reviews_screen")
    object VendorRegistration: Screen(route = "vendor_registration_screen")
    object VendorAdmin: Screen(route = "vendor_admin_screen")
}