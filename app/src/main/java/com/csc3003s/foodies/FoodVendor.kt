package com.csc3003S.foodies

class FoodVendor(
    _userName: String,
    _userEmail: String,
    _userPassword: String,
    private var _vendorNumber: String?,
    private var _waitingTime: Int?,
    private var _liveUpdate: Boolean
) : User(_userName, _userEmail, _userPassword) {

    var vendorNumber: String?
        get() = _vendorNumber
        set(value) {
            if (_vendorNumber == null) {
                _vendorNumber = value
            }
        }

    var waitingTime: Int?
        get() = _waitingTime
        set(value) {
            if (_waitingTime == null) {
                _waitingTime = value
            }
        }

    fun setWaitingTime(waitingTime: Int) {
        if (_waitingTime == null) {
            _waitingTime = waitingTime
        }
    }

    override fun toString(): String {
        return "FoodVendor{User_Name='$userName', User_Email='$userEmail', Vendor Number='${_vendorNumber ?: ""}', Waiting Time='${_waitingTime ?: 0} minutes', LiveUpdate='$_liveUpdate'}"
    }
}
