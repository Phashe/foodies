class Account {
    private val ReviewsArrayList: ArrayList<Review>? = null
    var points = 0
        private set
    var accountNumber: String? = null
        private set

    private fun setAccountNumber(accountNumber: String) {
        this.accountNumber = accountNumber
    }

    override fun toString(): String {
        return "Account{" +
                "ReviewsArrayList=" + ReviewsArrayList +
                ", Points=" + points +
                ", AccountNumber='" + accountNumber + '\'' +
                '}'
    }
}