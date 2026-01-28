abstract class Appliance {
    abstract fun calculatePowerUsage()
}

class Fan : Appliance() {
    override fun calculatePowerUsage() {
        val hours = 18
        val watt = 88
        val kWh = hours * watt / 1000.0
        println("Fan usage : $kWh")
    }
}
class AirConditioner : Appliance() {
    override fun calculatePowerUsage() {
        val hours = 15
        val watt = 1800
        val kWh = hours * watt / 1000.0
        println("AirConditioner usage : $kWh")


    }
}

class LightBulb : Appliance() {
    override fun calculatePowerUsage() {

        val hours = 18
        val watt = 20
        val kWh = hours * watt / 1000.0
        println("LightBulb usage : $kWh")

    }
}

fun main() {
    val fan = Fan()
    fan.calculatePowerUsage()
    val airConditioner = AirConditioner()
    airConditioner.calculatePowerUsage()
    val lightBulb = LightBulb()
    lightBulb.calculatePowerUsage()


}
