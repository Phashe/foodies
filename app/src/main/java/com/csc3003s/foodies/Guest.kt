package com.csc3003S.foodies

/**
 * Represents a Guest class that stores information about visitors.
 *
 * @property visitorName The name of the visitor.
 */
class Guest(private val visitorName: String) {

    /**
     * Gets the name of the visitor.
     *
     * @return The name of the visitor.
     */
    fun getVisitorName(): String {
        return visitorName
    }

    /**
     * Returns a string representation of the Guest object.
     *
     * @return A string containing the visitor's name.
     */
    override fun toString(): String {
        return "Guest{VisitorName='$visitorName'}"
    }
}

