package functions

/**
 * Created by victor888 on 3/13/2017.
 */
//Member function is define inside
//class, object, interface
//Break down the program into smaller chuck and can be reuse
fun main(args: Array<String>) {
   Square.printArea(12,12)
    var someValue = Square.calculateArea(12,12) //
    println(someValue)


}

object Square {

    fun printArea(width: Int, height: Int): Unit {
        val area = calculateArea(width, height)
        println("The area is $area")
    }

    fun calculateArea(width: Int, height: Int): Int {
        return width * height
    }
}