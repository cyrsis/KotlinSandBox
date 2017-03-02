package basics

import java.util.*

/**
 * Created by victor888 on 3/2/2017.
 */
fun main(args: Array<String>) {

  var random = Random().nextInt(20)
  println(random)

  var randomList = IntArray(10){ Random().nextInt(20)}.asList()
  randomList.forEach { print(" $it \t") }
}