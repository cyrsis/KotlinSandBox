package basics

/**
 * Created by victor888 on 2/23/2017.
 */

//Where does the return occur?

fun main(args: Array<String>) {
  println(FunctionCallingInnerFunction(90, 20, 30))
  printLessThanTwo() //Return from annon function
  returnWithLabel()
  returnWithImplicitLabel()


}

fun returnWithImplicitLabel() {
  val listOf = listOf("1", "2", "stop", "4")
  listOf.forEach {
    if (it =="stop") return@forEach //Will go back to foreach
    else println(it)
  }
}

fun returnWithLabel() {
  val list = listOf("a","b","stop","c")
  list.forEach stop@{
    if (it =="stop") return@stop //will go back to label
    else println(it)
  }
}

fun printLessThanTwo() { //Return from anonymous function
  val numbers = listOf(1,2,3,4,5)
  numbers.forEach(fun(x) {
    when {
      x < 2-> println(x)
      else -> return
    }
  })
    println("This line will execute")
}

fun FunctionCallingInnerFunction(a: Int, b: Int, c: Int):Int { //this function calling inner function by itself
  fun largest(a:Int, b:Int) :Int{
    if (a>b) return a
      else return b
  }

   return largest(largest(a,b),largest(b,c))
}
