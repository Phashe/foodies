class Review {
    private var UserName: String? = null
    private val ReviewID: String? = null
    private var Comment: String? = null
    private var StockAvailability = 0
    private var OrderTime = 0
    private var Cleanliness = 0
    private var CustomerService = 0
    fun GetName(): String? {
        return UserName
    }

    private fun SetName(userName: String) {
        UserName = userName
    }

    fun GetComment(): String? {
        return Comment
    }

    private fun SetComment(comment: String) {
        Comment = comment
    }

    fun GetStockAvailability(): Int {
        return StockAvailability
    }

    private fun SetStockAvailability(stockAvailability: Int) {
        StockAvailability = stockAvailability
    }

    fun GetOrderTime(): Int {
        return OrderTime
    }

    private fun SetOrderTime(orderTime: Int) {
        OrderTime = orderTime
    }

    fun GetCleanliness(): Int {
        return Cleanliness
    }

    private fun SetCleanliness(cleanliness: Int) {
        Cleanliness = cleanliness
    }

    fun GetCustomerService(): Int {
        return CustomerService
    }

    private fun SetCustomerService(customerService: Int) {
        CustomerService = customerService
    }

    fun ToString(): String {
        return "Review{" +
                "UserName='" + UserName + '\'' +
                ", ReviewID='" + ReviewID + '\'' +
                ", Comment='" + Comment + '\'' +
                ", StockAvailability=" + StockAvailability +
                ", OrderTime=" + OrderTime +
                ", Cleanliness=" + Cleanliness +
                ", CustomerService=" + CustomerService +
                '}'
    }
}