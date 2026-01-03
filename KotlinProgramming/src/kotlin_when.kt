fun main(){
    val day = 4
    val result = when (day){
        1 -> "Saturday"
        2 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        6 -> "Wednesday"
        7 -> "Thursday"
        8 -> "Friday"
        else -> "Invalid Input"
    }
    println(result)
}