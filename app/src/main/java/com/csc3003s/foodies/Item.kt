package com.csc3003S.foodies

/**
 * Represents an Item class that stores information about food items.
 *
 * @property itemName The name of the item.
 * @property itemID The unique identification ID of the item.
 * @property itemAvailability Indicates whether the item is available.
 * @property itemPreparedness Indicates whether the item is prepared.
 * @property itemDescription The description of the item.
 * @property itemPrice The price of the item.
 */
class Item(
    private var itemName: String?,
    private val itemID: String?,
    private var itemAvailability: Boolean = false,
    private var itemPreparedness: Boolean = false,
    private var itemDescription: String?,
    private var itemPrice: Float = 0f
) {
    init {
        if (itemName == null) {
            throw IllegalArgumentException("Item name cannot be null")
        }

        if (itemDescription == null) {
            throw IllegalArgumentException("Item description cannot be null")
        }

        // You can implement additional initialization logic here
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    fun getItemName(): String? {
        return itemName
    }

    /**
     * Gets the unique identification ID of the item.
     *
     * @return The item's ID.
     */
    fun getItemID(): String? {
        return itemID
    }

    /**
     * Generates a unique identification ID for the item.
     *
     * @return The generated item ID.
     */
    private fun generateItemID(): String? {
        // Implement the logic to generate an item ID
        return null // Placeholder
    }

    /**
     * Checks the availability status of the item.
     *
     * @return `true` if the item is available, `false` otherwise.
     */
    fun getItemAvailability(): Boolean {
        return itemAvailability
    }

    /**
     * Sets the availability status of the item.
     *
     * @param itemAvailability The availability status to be set.
     */
    fun setItemAvailability(itemAvailability: Boolean) {
        this.itemAvailability = itemAvailability
    }

    /**
     * Checks the preparedness status of the item.
     *
     * @return `true` if the item is prepared, `false` otherwise.
     */
    fun getItemPreparedness(): Boolean {
        return itemPreparedness
    }

    /**
     * Sets the preparedness status of the item.
     *
     * @param itemPreparedness The preparedness status to be set.
     */
    fun setItemPreparedness(itemPreparedness: Boolean) {
        this.itemPreparedness = itemPreparedness
    }

    /**
     * Gets the description of the item.
     *
     * @return The description of the item.
     */
    fun getItemDescription(): String? {
        return itemDescription
    }

    /**
     * Sets the description of the item.
     *
     * @param itemDescription The description to be set.
     */
    fun setItemDescription(itemDescription: String) {
        this.itemDescription = itemDescription
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    fun getItemPrice(): Float {
        return itemPrice
    }

    /**
     * Sets the price of the item.
     *
     * @param itemPrice The price to be set.
     */
    fun setItemPrice(itemPrice: Float) {
        this.itemPrice = itemPrice
    }

    /**
     * Returns a string representation of the Item object.
     *
     * @return A string containing item details.
     */
    override fun toString(): String {
        return "Items{" +
                "ItemName='$itemName', " +
                "ItemID='$itemID', " +
                "ItemAvailability=$itemAvailability, " +
                "ItemPrepraredness=$itemPreparedness, " +
                "ItemDescription='$itemDescription', " +
                "ItemPrice=$itemPrice" +
                '}'
    }
}

