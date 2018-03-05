package collection

/**
 * Created by victor888 on 2/16/2017.
 */

//Array is low leve data structure , only use it when you need to.
//Always use ArranyList
//Just somehow Array can create from initial sized and function
fun main(args: Array<String>) {

  val array = arrayOf(1,2,3)
  val perfectSquares =Array(10, {k->k*k})

  println("Perfect Square")
  perfectSquares.forEach { print("$it \t") }



  var hongkongpeople = arrayListOf("Hong Kong" to "Cantonese" , "Chinese" to "Mandarin")

  println("\n")
  hongkongpeople.forEach { println(" ${it.first}  ${it.second}") }

  val numbers = arrayListOf(1,2,3,4,5)
  numbers.forEach { println(it) }

  //here is some special one for performance and avoid boxing
  val bools = booleanArrayOf(true,false,true)
  val bytes=  byteArrayOf(1,2)
  val ints = intArrayOf(1,2,3,4)
  val floats = floatArrayOf(1.0f,2.0f,3.0f)
  val doubles = doubleArrayOf(1.0,2.0,3.0)
  val longs = longArrayOf(1,2,3)
  val chars = charArrayOf('1','2','3')
  val shorts = shortArrayOf(1,2,3)
}