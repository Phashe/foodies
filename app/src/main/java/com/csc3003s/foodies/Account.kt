package com.csc3003S.foodies

/**
 * Represents an Account class that stores information about user accounts and their associated data.
 *
 * @property ReviewsArrayList A list of reviews associated with the account.
 * @property points The number of points associated with the account.
 * @property accountNumber The account number of the user.
 */
class Account {
    /**
     * List of reviews associated with the account.
     */
    private val ReviewsArrayList: ArrayList<Review>? = null

    /**
     * The number of points associated with the account.
     */
    var points = 0
        private set

    /**
     * The account number.
     */
    var accountNumber: String? = null
        private set

    /**
     * Sets the account number.
     *
     * @param accountNumber The account number to be set.
     */
    private fun setAccountNumber(accountNumber: String) {
        this.accountNumber = accountNumber
    }

    /**
     * Returns a string representation of the Account object.
     *
     * @return A string containing reviews, points, and account number.
     */
    override fun toString(): String {
        return "Account{" +
                "ReviewsArrayList=" + ReviewsArrayList +
                ", Points=" + points +
                ", AccountNumber='" + accountNumber + '\'' +
                '}'
    }
}
