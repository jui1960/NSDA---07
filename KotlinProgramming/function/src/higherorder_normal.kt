fun main(){
     val sum =calculateNew(10,5,::add)
    val ans =calculateNew(10,5,::sub)
    println(sum)
    println(ans)
}

fun add(a: Int, b: Int): Int {
    return a + b
}
fun sub(a: Int, b: Int): Int {
    return a - b
}

fun calculateNew(x: Int, y: Int,operationNew:(Int,Int)->Int): Int {
    return operationNew(x,y)
}