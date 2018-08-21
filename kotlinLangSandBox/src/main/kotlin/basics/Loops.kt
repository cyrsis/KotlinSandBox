package basics

/**
 * Created by victor888 on 2/22/2017.
 */

//Array have an extension call indices, which help iterate over the index of array
fun main(args: Array<String>) {



  val string = "print me please"
  for (char in string) println(char)

  for (index in string.indices) {
   println("Elemebt $index is ${string[index]}")
  }


}