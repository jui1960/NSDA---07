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

fun main(){
    for (i in 1..10){
//       var x = i + i+1
        var x1 = i * (i+1)
        var x2 = i / (i+1)

        println(i)
        println(x1)
        println(x2)
    }
}