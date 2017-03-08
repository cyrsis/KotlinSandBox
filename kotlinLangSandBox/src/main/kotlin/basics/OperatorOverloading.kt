package basics


/**
 * Created by victor888 on 3/8/2017.
 */
//Add more function to the plus operator
//https://kotlinlang.org/docs/reference/operator-overloading.html
//here is the list of overloading things

data class Vector(var x:Int, var y:Int) {
  operator fun plus(other: Vector): Vector {
      return Vector(x+other.x,y+other.y)
  }
}

fun main(args: Array<String>) {
  var v1 = Vector(3,4)
  var v2 = Vector(6,9)

  println(v1+v2)

}
