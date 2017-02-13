package basics

/**
 * Created by cyber on 2017-02-08.
 */

//On Return type
fun main(args: Array<String>) {
    funWithUnit() //Unit is Void
    funWithNothing() //Nothing means nothing
}

fun funWithNothing() :Nothing {
    throw Exception("This fun throws an fun exception")
}

fun funWithUnit() :Unit {
    println("This fun works")
}
