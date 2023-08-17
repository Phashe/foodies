package com.csc3003S.foodies

/**
 * Represents a student in the Foodies system, inheriting from the User class.
 *
 * @property userName The username of the student.
 * @property userEmail The email address of the student.
 * @property userPassword The password of the student.
 * @property studentNumber The unique student number associated with the student.
 * @property account The account information associated with the student.
 */
class Student(
    userName: String,
    userEmail: String,
    userPassword: String,
    private val _studentNumber: String,
    private val _account: String
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
     * The account information for the student.
     */
    var account: String = _account
        get() = field
        set(value) {
            field = value
        }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string containing user information and student-specific details.
     */
    override fun toString(): String {
        return "Student{User_Name='$userName', User_Email='$userEmail', StudentNumber='$studentNumber', Account=$account}"
    }
}