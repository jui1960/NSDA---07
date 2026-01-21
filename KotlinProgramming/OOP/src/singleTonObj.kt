object Phonee {
    var name = " "
    var battery = 20
    var color = "blue"

    fun display(){
        println("phone name is $name& battery is $battery health & color is $color" )
    }
    fun show(){
        println("singleton object")
    }
}

fun main() {
    Phonee.name = "redmi y3 "
    Phonee.battery = 20
    Phonee.color = "blue"

    Phonee.display()
    Phonee.show()
}


//singleton obj holo program a sudu ektai obj thakbe and Object keyword use hbe