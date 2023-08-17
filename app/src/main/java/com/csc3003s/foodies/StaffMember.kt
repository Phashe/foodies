package com.csc3003S.foodies

/**
 * Represents a staff member in the Foodies system.
 *
 * @property _userName The username of the staff member.
 * @property _userEmail The email address of the staff member.
 * @property _userPassword The password of the staff member.
 */
class StaffMember(
    _userName: String,
    _userEmail: String,
    _userPassword: String
) : User(_userName, _userEmail, _userPassword) {
    /**
     * The staff number of the staff member.
     */
    var staffNumber: String? = null
        private set

    /**
     * The account associated with the staff member.
     * This property is currently not used and is always null.
     */
    private val account: Account? = null

    /**
     * Sets the staff number for the staff member.
     *
     * @param staffNumber The staff number to set.
     */
    fun setStaffNumber(staffNumber: String) {
        this.staffNumber = staffNumber
    }

    /**
     * Returns a string representation of the StaffMember object.
     *
     * @return A string containing the staff number and account information.
     */
    override fun toString(): String {
        return "StaffMember{" +
                "StaffNumber='$staffNumber', " +
                "Account=$account" +
                '}'
    }
}
