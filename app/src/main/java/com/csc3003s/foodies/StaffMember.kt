package com.csc3003S.foodies

/**
 * Represents a StaffMember class that inherits from the User class and adds additional properties.
 *
 * @property staffNumber The staff number of the staff member.
 * @property account The associated account of the staff member.
 */
class StaffMember(
    userName: String,
    userEmail: String,
    userPassword: String
) : User(userName, userEmail, userPassword) {

    /**
     * The staff number of the staff member.
     */
    var staffNumber: String? = null

    /**
     * The associated account of the staff member.
     */
    private val account: Account? = null

    /**
     * Sets the staff number of the staff member.
     *
     * @param staffNumber The staff number to be set.
     */
    private fun setStaffNumber(staffNumber: String) {
        this.staffNumber = staffNumber
    }

    /**
     * Returns a string representation of the StaffMember object.
     *
     * @return A string containing staff number and associated account.
     */
    override fun toString(): String {
        return "StaffMember{" +
                "StaffNumber='$staffNumber', " +
                "Account=$account" +
                '}'
    }
}
