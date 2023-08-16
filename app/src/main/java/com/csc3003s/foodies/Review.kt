package com.csc3003S.foodies

/**
 * Represents a Review class that stores information about customer reviews.
 *
 * @property userName The name of the user who provided the review.
 * @property reviewID The unique identification ID of the review.
 * @property comment The comment provided in the review.
 * @property stockAvailability The rating for stock availability.
 * @property orderTime The rating for order time.
 * @property cleanliness The rating for cleanliness.
 * @property customerService The rating for customer service.
 */
class Review(
    private var userName: String? = null,
    private val reviewID: String? = null,
    private var comment: String? = null,
    private var stockAvailability: Int = 0,
    private var orderTime: Int = 0,
    private var cleanliness: Int = 0,
    private var customerService: Int = 0
) {

    /**
     * Gets the name of the user who provided the review.
     *
     * @return The user's name.
     */
    fun getName(): String? {
        return userName
    }

    /**
     * Sets the name of the user who provided the review.
     *
     * @param userName The user's name to be set.
     */
    fun setName(userName: String) {
        this.userName = userName
    }

    /**
     * Gets the comment provided in the review.
     *
     * @return The comment in the review.
     */
    fun getComment(): String? {
        return comment
    }

    /**
     * Sets the comment provided in the review.
     *
     * @param comment The comment to be set.
     */
    fun setComment(comment: String) {
        this.comment = comment
    }

    /**
     * Gets the rating for stock availability.
     *
     * @return The rating for stock availability.
     */
    fun getStockAvailability(): Int {
        return stockAvailability
    }

    /**
     * Sets the rating for stock availability.
     *
     * @param stockAvailability The rating for stock availability to be set.
     */
    fun setStockAvailability(stockAvailability: Int) {
        this.stockAvailability = stockAvailability
    }

    /**
     * Gets the rating for order time.
     *
     * @return The rating for order time.
     */
    fun getOrderTime(): Int {
        return orderTime
    }

    /**
     * Sets the rating for order time.
     *
     * @param orderTime The rating for order time to be set.
     */
    fun setOrderTime(orderTime: Int) {
        this.orderTime = orderTime
    }

    /**
     * Gets the rating for cleanliness.
     *
     * @return The rating for cleanliness.
     */
    fun getCleanliness(): Int {
        return cleanliness
    }

    /**
     * Sets the rating for cleanliness.
     *
     * @param cleanliness The rating for cleanliness to be set.
     */
    fun setCleanliness(cleanliness: Int) {
        this.cleanliness = cleanliness
    }

    /**
     * Gets the rating for customer service.
     *
     * @return The rating for customer service.
     */
    fun getCustomerService(): Int {
        return customerService
    }

    /**
     * Sets the rating for customer service.
     *
     * @param customerService The rating for customer service to be set.
     */
    fun setCustomerService(customerService: Int) {
        this.customerService = customerService
    }

    /**
     * Returns a string representation of the Review object.
     *
     * @return A string containing review details.
     */
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
