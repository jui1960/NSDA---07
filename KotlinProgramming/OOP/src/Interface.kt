// Interface
interface Vehicle {
    fun start()    // Body নেই
    fun stop()     // Body নেই
}

// Class implements Interface
class Car : Vehicle {
    override fun start() {
        println("Car started")
    }
    override fun stop() {
        println("Car stopped")
    }
}

class Bike : Vehicle {
    override fun start() {
        println("Bike started")
    }
    override fun stop() {
        println("Bike stopped")
    }
}

fun main() {
    val car = Car()
    val bike = Bike()

    car.start()  // Car started
    bike.start() // Bike started
}
