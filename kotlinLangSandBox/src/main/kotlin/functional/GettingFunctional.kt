package functional

/**
 * Created by victor888 on 2/2/2017.
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

//Todo check out this website http://hadihariri.com/2013/11/09/refactoring-to-functional-basic-primitives/
//For getting functional, this guy piss off lot of people
fun main(args: Array<String>) {

    var somethng = "String with .Var"//this works really well

    println(operation(12, 25,::Multiplyit)) //passing into function work really well

    val sumLamda :(Int,Int)-> Int ={x,y -> x+y}

}

fun route(path: String, vararg action: (String, String) -> String) {

}

fun UnaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun Sumit(x: Int, y: Int) = x + y

fun Multiplyit(x: Int,y:Int) = x*y
