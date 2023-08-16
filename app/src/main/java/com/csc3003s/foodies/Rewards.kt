package com.csc3003S.foodies

/**
 * Represents a Rewards class that stores information about points earned.
 *
 * @property pointCounter The counter for points earned.
 * @property queueLength The length of the queue for rewards processing.
 * @property ourMenu The menu associated with the rewards.
 */
class Rewards(
    private val pointCounter: Int,
    private val queueLength: Int,
    private val ourMenu: Menu
) : LiveUpdate(queueLength, ourMenu) {

    /**
     * Gets the counter for points earned.
     *
     * @return The points counter.
     */
    fun getPointCounter(): Int {
        return pointCounter
    }

    /**
     * Returns the length of the queue for rewards processing.
     *
     * @return The length of the queue.
     */
    override fun getQueueLength(): Int {
        return queueLength
    }

    /**
     * Returns the menu associated with the rewards.
     *
     * @return The menu.
     */
    override fun getMenu(): String? {
        return ourMenu.toString()
    }

    /**
     * Returns a string representation of the Rewards object.
     *
     * @return A string containing points counter, queue length, and menu details.
     */
    override fun toString(): String {
        return "Rewards{PointCounter=$pointCounter, QueueLength=$queueLength, ${super.toString()}}"
    }
}
