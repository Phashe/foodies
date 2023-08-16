package com.csc3003S.foodies
/**
 * Represents a Student class that extends the User class and stores information about students.
 *
 * @property userName The user's name.
 * @property userEmail The user's email.
 * @property userPassword The user's password.
 * @property studentNumber The student's unique identification number.
 * @property account The student's associated account information.
 */
class Student(
    userName: String,
    userEmail: String,
    userPassword: String,
    _studentNumber: String,
    _account: String
) : User(userName, userEmail, userPassword) {

    /**
     * The student's unique identification number.
     */
    var studentNumber: String = _studentNumber
        get() = field
        set(value) {
            field = value
        }

    /**
     * The student's associated account information.
     */
    var account: String = _account
        get() = field
        set(value) {
            field = value
        }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string containing user details, student number, and account information.
     */
    override fun toString(): String {
        return "Student{User_Name='$userName', User_Email='$userEmail', StudentNumber='$studentNumber', Account=$account}"
    }
}
