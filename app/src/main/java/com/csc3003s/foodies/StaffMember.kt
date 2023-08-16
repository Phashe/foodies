class StaffMember : User{
    var staffNumber: String? = null

    private val Account: Account? = null

    private fun setStaffNumber(staffNumber: String) {
        this.staffNumber = staffNumber
    }

    override fun toString(): String {
        return "StaffMember{" +
                "StaffNumber='" + staffNumber + '\'' +
                ", Account=" + Account +
                '}'
    }
}