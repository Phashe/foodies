class User {
    private var User_Name: String? = null
    private var User_Email: String? = null
    private var User_Password: String? = null
    fun GetName(): String? {
        return User_Name
    }

    private fun SetName(name: String) {
        User_Name = name
    }

    fun GetEmail(): String? {
        return User_Email
    }

    private fun SetEmail(email: String) {
        User_Email = email
    }

    fun GetPassword(): String? {
        return User_Password
    }

    private fun SetPassword(password: String) {
        User_Password = password
    }

    fun ToString(): String {
        return "User{" +
                "User_Name='" + User_Name + '\'' +
                ", User_Email='" + User_Email + '\'' +
                ", User_Password='" + User_Password + '\'' +
                '}'
    }
}