package collection

/**
 * Created by victor888 on 2/16/2017.
 */
fun main(args: Array<String>) {
  var list = arrayListOf(1, 2, 3)
  list.forEach { println(it) }

  //Pair can use
  var list2 = arrayListOf(Pair("Bill","Clinton"),
   "Victor" to "Tong",
      "Tony" to "Wong")

     list2.forEach { println("${it.first} - ${it.second}") }



}