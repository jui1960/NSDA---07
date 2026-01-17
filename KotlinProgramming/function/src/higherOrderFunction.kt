/*
fun main() {
    val add = { a: Int, b: Int -> a + b }
    val sub = { a: Int, b: Int -> a - b }
    val mul = { a: Int, b: Int -> a * b }
    val div = { a: Int, b: Int -> a / b }

    val num1 = 10
    val num2 = 5

    println(calculate(num1, num2, add))
    println(calculate(num1, num2, sub))
    println(calculate(num1, num2, mul))
    println(calculate(num1, num2, div))
}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)

}

*/


fun main(){

    val add = {x:Int,y:Int -> x+y}
    val sub = {x:Int,y:Int -> x-y}

    val num1 = 10
    val num2 = 5

    println(cal(num1, num2,add))
    println(cal(num1, num2,sub))

}
fun cal(a:Int,b: Int,operation:(Int,Int)->Int):Int{
    return operation(a, b)

}









































