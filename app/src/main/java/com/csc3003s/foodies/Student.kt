class Student {
    var studentNumber: String? = null
        private set
    private val Account: Account? = null
    private fun setStudentNumber(studentNumber: String) {
        this.studentNumber = studentNumber
    }

    override fun toString(): String {
        return "Student{" +
                "StudentNumber='" + studentNumber + '\'' +
                ", Account=" + Account +
                '}'
    }
}