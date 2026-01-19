class phone{
    var name=""
    var battery = 0
    var camera = 0
    var color = ""

    fun display(){
        println("phone name : $name , phone battery health : $battery," +
                "camera : $camera,color : $color")
    }

}

fun main() {
    val obj = phone()   //obj create
    obj.name="Redmi y13"
    obj.battery=20
    obj.camera=4
    obj.color="red"
    obj.display()


}