package com.csc3003S.foodies

class Review(
    private var userName: String? = null,
    private val reviewID: String? = null,
    private var comment: String? = null,
    private var stockAvailability: Int = 0,
    private var orderTime: Int = 0,
    private var cleanliness: Int = 0,
    private var customerService: Int = 0
) {

    fun getName(): String? {
        return userName
    }

    fun setName(userName: String) {
        this.userName = userName
    }

    fun getComment(): String? {
        return comment
    }

    fun setComment(comment: String) {
        this.comment = comment
    }

    fun getStockAvailability(): Int {
        return stockAvailability
    }

    fun setStockAvailability(stockAvailability: Int) {
        this.stockAvailability = stockAvailability
    }

    fun getOrderTime(): Int {
        return orderTime
    }

    fun setOrderTime(orderTime: Int) {
        this.orderTime = orderTime
    }

    fun getCleanliness(): Int {
        return cleanliness
    }

    fun setCleanliness(cleanliness: Int) {
        this.cleanliness = cleanliness
    }

    fun getCustomerService(): Int {
        return customerService
    }

    fun setCustomerService(customerService: Int) {
        this.customerService = customerService
    }

    override fun toString(): String {
        return "Review{" +
                "UserName='$userName', " +
                "ReviewID='$reviewID', " +
                "Comment='$comment', " +
                "StockAvailability=$stockAvailability, " +
                "OrderTime=$orderTime, " +
                "Cleanliness=$cleanliness, " +
                "CustomerService=$customerService" +
                '}'
    }
}
