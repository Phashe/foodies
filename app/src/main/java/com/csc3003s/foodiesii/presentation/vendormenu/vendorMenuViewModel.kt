package com.csc3003s.foodiesii.presentation.vendormenu

/**
 *
 *
class Menu {
    /**
     * The dietary requirements associated with the menu.
     */
    private var DietaryRequirements: String? = null

    /**
     * The cuisine type of the menu.
     */
    private var Cuisine: String? = null

    /**
     * The list of items in the menu.
     */
    private val ItemArrayList: ArrayList<Item> = ArrayList()

    /**
     * Constructs a new Menu object with the given dietary requirements and cuisine type.
     *
     * @param dietaryRequirements The dietary requirements to be set.
     * @param cuisine The cuisine type to be set.
     */
    constructor(dietaryRequirements: String, cuisine: String) {
        DietaryRequirements = dietaryRequirements
        Cuisine = cuisine
    }

    /**
     * Gets the dietary requirements associated with the menu.
     *
     * @return The dietary requirements of the menu.
     */
    fun getDietaryRequirements(): String? {
        return DietaryRequirements
    }

    /**
     * Sets the dietary requirements of the menu.
     *
     * @param dietaryRequirements The dietary requirements to be set.
     */
    private fun setDietaryRequirements(dietaryRequirements: String) {
        DietaryRequirements = dietaryRequirements
    }

    /**
     * Gets the cuisine type of the menu.
     *
     * @return The cuisine type of the menu.
     */
    fun getCuisine(): String? {
        return Cuisine
    }

    /**
     * Sets the cuisine type of the menu.
     *
     * @param cuisine The cuisine type to be set.
     */
    private fun setCuisine(cuisine: String) {
        Cuisine = cuisine
    }

    /**
     * Adds an item to the menu.
     *
     * @param item The item to be added.
     */
    fun add(item: Item) {
        ItemArrayList.add(item)
    }

    /**
     * Deletes an item from the menu.
     *
     * @param item The item to be deleted.
     */
    fun delete(item: Item) {
        ItemArrayList.remove(item)
    }

    /**
     * Updates an item in the menu.
     *
     * @param item The item to be updated.
     */
    fun update(item: Item?) {
        // Implement the update logic here
    }

    /**
     * Returns a string representation of the Menu object.
     *
     * @return A string containing dietary requirements, cuisine, and items in the menu.
     */
    override fun toString(): String {
        return "Menu{" +
                "DietaryRequirements='$DietaryRequirements', " +
                "Cuisine='$Cuisine', " +
                "ItemArrayList=$ItemArrayList" +
                '}'
    }
}

 **/