package com.csc3003S.foodies

open class User(
    _userName: String,
    _userEmail: String,
    _userPassword: String
) {
    var userName: String = _userName
        get() = field
        set(value) {
            field = value
        }

    var userEmail: String = _userEmail
        get() = field
        set(value) {
            field = value
        }

    var userPassword: String = _userPassword
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "User{User_Name='$userName', User_Email='$userEmail'}"
    }
}
