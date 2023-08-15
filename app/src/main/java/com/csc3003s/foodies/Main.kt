package com.csc3003S.foodies

fun main() {
    val student = Student("John Does", "john@example.com", "password123", "123456", "Savings")

    println(student)
    println("Student Number: ${student.studentNumber}")

    student.userName = "Jane Smith"
    student.studentNumber = "789012"

    println(student)

    val review = Review("John","XX","Great experience!",5,4,5,5)

    println("Review Details:")
    println("Name: ${review.getName()}")
    println("Comment: ${review.getComment()}")
    println("Stock Availability: ${review.getStockAvailability()}")
    println("Order Time: ${review.getOrderTime()}")
    println("Cleanliness: ${review.getCleanliness()}")
    println("Customer Service: ${review.getCustomerService()}")

    println(review.toString())

    val vendor = FoodVendor("John", "john@example.com", "password", "V123", 10, true)
    println(vendor)

    val menu = Menu("Healthy", "Italian")
    val liveUpdate = LiveUpdate(5, menu)

    val item = Item("Burger", "I123", false, true, "A delicious burger", 8.99f)
    println(item)

}