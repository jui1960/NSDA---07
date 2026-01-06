/*arithmetic operator a+b a-b a*b a/b a%b a++ a--
assignment operator a=b a+=b a-=b a*=b a/=b a%=b
comparison operator a==b a>b b<a a>=b a<=b a!=b
logical operator a&&b a||b a!b
*
*
* */


//fun main(){
//    val x = 10 + 20
//    println(x)
//    var name = 19
//    println(name++)
//}

//fun main(){
//    for (i in 1..10){
////       var x = i + i+1
//        var x1 = i * (i+1)
//        var x2 = i / (i+1)
//
//        println(i)
//        println(x1)
//        println(x2)
//    }
//}

//Arithmetic operator
//fun main() {
//    print("Enter your number of a : ")
//    var a = readln().toInt()
//    print("Enter your number of a : ")
//    var b = readln().toInt()
//
//    val sum = a+b
//    val sub = a-b
//    val mul = a*b
//    val div = a/b
//    val mod = a%b
//
//    println("Addition of a = $a and b = $b is = $sum")
//    println("Substraction of a = $a and b = $b is = $sub")
//    println("Multiplication of a = $a and b = $b is = $mul")
//    println("Division of a = $a and b = $b is = $div")
//    println("Modulation of a = $a and b = $b is = $mod")
//    a++
//    b--
//    println("Increment value of a is = $a")
//    println("Decrement value of b is = $b")
//}



//Assignment operator
fun main(){
    var a = 20
    println("Initial value of a is : $a")
    a += 10
    println("Value of a after adding 10 is : $a")
    a -= 5
    println("Value of a after subtracting 5 is : $a")
    a *= 5
    println("Value of a after multiplying by 5 is : $a")
    a /= 3
    println("Value of a after dividing by 3 is : $a")
    a %= 4
    println("Value of a after modulus by 4 is : $a")

}


