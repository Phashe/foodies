package com.csc3003S.foodies

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

    fun getItemName(): String? {
        return itemName
    }

    fun getItemID(): String? {
        return itemID
    }

    private fun generateItemID(): String? {
        // Implement the logic to generate an item ID
        return null // Placeholder
    }

    fun getItemAvailability(): Boolean {
        return itemAvailability
    }

    fun setItemAvailability(itemAvailability: Boolean) {
        this.itemAvailability = itemAvailability
    }

    fun getItemPreparedness(): Boolean {
        return itemPreparedness
    }

    fun setItemPreparedness(itemPreparedness: Boolean) {
        this.itemPreparedness = itemPreparedness
    }

    fun getItemDescription(): String? {
        return itemDescription
    }

    fun setItemDescription(itemDescription: String) {
        this.itemDescription = itemDescription
    }

    fun getItemPrice(): Float {
        return itemPrice
    }

    fun setItemPrice(itemPrice: Float) {
        this.itemPrice = itemPrice
    }

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
