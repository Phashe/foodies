class Item {
    private var ItemName: String? = null
    private val ItemID: String? = null
    private var ItemAvailability = false
    private var ItemPrepraredness = false
    private var ItemDescription: String? = null
    private var ItemPrice = 0f
    fun GetItemName(): String? {
        return ItemName
    }

    private fun SetItemName(itemName: String) {
        ItemName = itemName
    }

    fun GetItemID(): String? {
        return ItemID
    }

    private fun GenerateItemID(): String? {
        // Implement the logic to generate an item ID
        return null // Placeholder
    }

    fun GetItemAvailability(): Boolean {
        return ItemAvailability
    }

    private fun SetItemAvailability(itemAvailability: Boolean) {
        ItemAvailability = itemAvailability
    }

    fun GetItemPrepraredness(): Boolean {
        return ItemPrepraredness
    }

    private fun SetItemPrepraredness(itemPrepraredness: Boolean) {
        ItemPrepraredness = itemPrepraredness
    }

    fun GetItemDescription(): String? {
        return ItemDescription
    }

    private fun SetItemDescription(itemDescription: String) {
        ItemDescription = itemDescription
    }

    fun GetItemPrice(): Float {
        return ItemPrice
    }

    private fun SetItemPrice(itemPrice: Float) {
        ItemPrice = itemPrice
    }

    fun ToString(): String {
        return "Items{" +
                "ItemName='" + ItemName + '\'' +
                ", ItemID='" + ItemID + '\'' +
                ", ItemAvailability=" + ItemAvailability +
                ", ItemPrepraredness=" + ItemPrepraredness +
                ", ItemDescription='" + ItemDescription + '\'' +
                ", ItemPrice=" + ItemPrice +
                '}'
    }
}