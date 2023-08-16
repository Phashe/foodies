package com.csc3003S.foodies

class StaffMember(
    _userName: String,
    _userEmail: String,
    _userPassword: String
) : User(_userName, _userEmail, _userPassword) {
    var staffNumber: String? = null
        private set

    private val account: Account? = null

    fun setStaffNumber(staffNumber: String) {
        this.staffNumber = staffNumber
    }

    override fun toString(): String {
        return "StaffMember{" +
                "StaffNumber='$staffNumber', " +
                "Account=$account" +
                '}'
    }
}