package com.csc3003S.foodies


/**
 * Represents a FoodVendor class that extends the User class and stores information about food vendors.
 *
 * @property _userName The user's name.
 * @property _userEmail The user's email.
 * @property _userPassword The user's password.
 * @property _vendorNumber The unique identification number of the food vendor.
 * @property _waitingTime The estimated waiting time for orders.
 * @property _liveUpdate Indicates whether live updates are available.
 */
class FoodVendor(
    _userName: String,
    _userEmail: String,
    _userPassword: String,
    private var _vendorNumber: String?,
    private var _waitingTime: Int?,
    private var _liveUpdate: Boolean
) : User(_userName, _userEmail, _userPassword) {

    /**
     * The unique identification number of the food vendor.
     */
    var vendorNumber: String?
        get() = _vendorNumber
        set(value) {
            if (_vendorNumber == null) {
                _vendorNumber = value
            }
        }

    /**
     * The estimated waiting time for orders.
     */
    var waitingTime: Int?
        get() = _waitingTime
        set(value) {
            if (_waitingTime == null) {
                _waitingTime = value
            }
        }

    /**
     * Sets the waiting time for orders if not previously set.
     *
     * @param waitingTime The waiting time to be set.
     */
    fun setWaitingTime(waitingTime: Int) {
        if (_waitingTime == null) {
            _waitingTime = waitingTime
        }
    }

    /**
     * Returns a string representation of the FoodVendor object.
     *
     * @return A string containing user details, vendor number, waiting time, and live update status.
     */
    override fun toString(): String {
        return "FoodVendor{User_Name='$userName', User_Email='$userEmail', Vendor Number='${_vendorNumber ?: ""}', Waiting Time='${_waitingTime ?: 0} minutes', LiveUpdate='$_liveUpdate'}"
    }
}
