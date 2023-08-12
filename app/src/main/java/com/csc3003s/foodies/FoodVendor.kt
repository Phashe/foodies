class FoodVendor {
    var vendorNumber: String? = null
        private set
    var waitingTime: Float? = null
        private set
    private val liveUpdate: LiveUpdate? = null
    private fun setVendorNumber(vendorNumber: String) {
        this.vendorNumber = vendorNumber
    }

    private fun setWaitingTime(waitingTime: Float) {
        this.waitingTime = waitingTime
    }

    private override fun toString(): String {
        // Implementation of the ToString() method
        return "Vendor Number: $vendorNumber, Waiting Time: $waitingTime minutes"
    }
}