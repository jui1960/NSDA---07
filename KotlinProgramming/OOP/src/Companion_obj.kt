class Fruit {

    companion object {
        var name = " "
        var color = " "
        var buy = 0
        fun display() {

            println("this ia a $name and its color is $color and buy is $buy")
        }
    }
}


fun main() {

    Fruit.name = "Mango"
    Fruit.color = "Yellow"
    Fruit.buy = 4
    Fruit.display()


  /*  Fruit()  kisui print kore na
    Fruit.display("mango")*/

}
