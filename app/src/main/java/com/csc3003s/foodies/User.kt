package com.csc3003S.foodies

/**
 * Represents a User class that stores information about a user.
 *
 * @property userName The name of the user.
 * @property userEmail The email address of the user.
 * @property userPassword The password of the user.
 */
open class User(
    _userName: String,
    _userEmail: String,
    _userPassword: String
) {
    /**
     * The name of the user.
     */
    var userName: String = _userName
        get() = field
        set(value) {
            field = value
        }

    /**
     * The email address of the user.
     */
    var userEmail: String = _userEmail
        get() = field
        set(value) {
            field = value
        }

    /**
     * The password of the user.
     */
    var userPassword: String = _userPassword
        get() = field
        set(value) {
            field = value
        }

    /**
     * Returns a string representation of the User object.
     *
     * @return A string containing user name and user email.
     */
    override fun toString(): String {
        return "User{User_Name='$userName', User_Email='$userEmail'}"
    }
}

