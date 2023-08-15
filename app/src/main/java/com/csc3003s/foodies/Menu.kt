package com.csc3003S.foodies

class Menu {
    private var DietaryRequirements: String? = null
    private var Cuisine: String? = null
    private val ItemArrayList: ArrayList<Item> = ArrayList()

    constructor(dietaryRequirements: String, cuisine: String) {
        DietaryRequirements = dietaryRequirements
        Cuisine = cuisine
    }

    fun getDietaryRequirements(): String? {
        return DietaryRequirements
    }

    private fun setDietaryRequirements(dietaryRequirements: String) {
        DietaryRequirements = dietaryRequirements
    }

    fun getCuisine(): String? {
        return Cuisine
    }

    private fun setCuisine(cuisine: String) {
        Cuisine = cuisine
    }

    fun add(item: Item) {
        ItemArrayList.add(item)
    }

    fun delete(item: Item) {
        ItemArrayList.remove(item)
    }

    fun update(item: Item?) {
        // Implement the update logic here
    }

    override fun toString(): String {
        return "Menu{" +
                "DietaryRequirements='" + DietaryRequirements + '\'' +
                ", Cuisine='" + Cuisine + '\'' +
                ", ItemArrayList=" + ItemArrayList +
                '}'
    }
}