package com.example.myapplication

class Sing {
    object Singleton {
    }

    fun createCars() {
        val BMW = Car(
            brand = "BMW",
            color = "Blue",
            engineVolume = "V8",
            governmentNumber = "1311"
        )
        val Mazda = Car(
            brand = "Mazda",
            color = "Blue",
            engineVolume = "V1",
            governmentNumber = "1311"
        )
        val Audi = Car(
            brand = "Audi",
            color = "Blue",
            engineVolume = "V3",
            governmentNumber = "1311"
        )
        val Merc = Car(
            brand = "Merc",
            color = "Blue",
            engineVolume = "V5",
            governmentNumber = "1311"
        )
        val Lux = Car(
            brand = "Lux",
            color = "Blue",
            engineVolume = "V1",
            governmentNumber = "1311"
        )
        val Jeep = Car(
            brand = "Jeep",
            color = "Blue",
            engineVolume = "V9",

            )


        println(BMW.carInfo())
        println(Mazda.carInfo())
        println(Audi.carInfo())
        println(Merc.carInfo())
        println(Lux.carInfo())
        println(Jeep.carInfo())
    }
}



