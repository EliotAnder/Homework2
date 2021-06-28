package com.example.myapplication

class Car(
    val brand: String,
    var color: String = "Black",
    val engineVolume: String,
    var governmentNumber: String? = null,
) {
    fun carInfo(): String {
        val govNumber = if (governmentNumber != null) governmentNumber else "Transit"
        return "$brand $color $engineVolume $govNumber"
    }
}

fun main() {
    val sing = Sing()
    sing.createCars()
}



