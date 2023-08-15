package com.csc3003S.foodies

class LiveUpdate(queueLength: Int, ourMenu: Menu) {
    private var QueueLength = queueLength
    private val OurMenu: Menu = ourMenu

    fun getQueueLength(): Int {
        return QueueLength
    }

    private fun setQueueLength(queueLength: Int) {
        QueueLength = queueLength
    }

    fun getItemAvailability(): Boolean {
        // Implement the logic to check item availability
        return false // Placeholder
    }

    fun getItemPreparedness(): Boolean {
        // Implement the logic to check item preparedness
        return false // Placeholder
    }

    fun getMenu(): String? {
        return OurMenu?.toString()
    }

    override fun toString(): String {
        return "LiveUpdate{" +
                "QueueLength=" + QueueLength +
                ", OurMenu=" + OurMenu +
                '}'
    }
}