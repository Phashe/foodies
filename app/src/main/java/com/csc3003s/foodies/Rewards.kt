package com.csc3003S.foodies

/**
 * Represents a Rewards class that stores information about points earned.
 *
 * @property pointCounter The counter for points earned.
 */
class Rewards(private val pointCounter: Int) {

    /**
     * Gets the counter for points earned.
     *
     * @return The points counter.
     */
    fun getPointCounter(): Int {
        return pointCounter
    }

    /**
     * Returns a string representation of the Rewards object.
     *
     * @return A string containing the points counter.
     */
    override fun toString(): String {
        return "Rewards{PointCounter=$pointCounter}"
    }
}
