package com.csc3003S.foodies

class Student(
    userName: String,
    userEmail: String,
    userPassword: String,
    _studentNumber: String,
    _account: String
) : User(userName, userEmail, userPassword) {

    var studentNumber: String = _studentNumber
        get() = field
        set(value) {
            field = value
        }

    var account: String = _account
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Student{User_Name='$userName', User_Email='$userEmail', StudentNumber='$studentNumber', Account=$account}"
    }
}
