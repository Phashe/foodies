package com.csc3003S.foodies

class StaffMember(
    _userName: String,
    _userEmail: String,
    _userPassword: String
    _point: int
) : User(_userName, _userEmail, _userPassword) {
    var staffNumber: String? = null
        private set

    private val account: Account? = null

    fun setStaffNumber(staffNumber: String) {
        this.staffNumber = staffNumber
    }

    var point: int = _point
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "StaffMember{" +
                "StaffNumber='$staffNumber', " +
                "Points=$point" +
                '}'
    }
}
