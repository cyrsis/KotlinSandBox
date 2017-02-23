package basics

/**
 * Created by victor888 on 2/23/2017.
 */

//Where does the return occur?

fun main(args: Array<String>) {
  println(largestNumber(90, 20, 30))

}

fun  largestNumber(a: Int, b: Int, c: Int):Int { //this function calling inner function by itself
  fun largest(a:Int, b:Int) :Int{
    if (a>b) return a
      else return b
  }

   return largest(largest(a,b),largest(b,c))
}
