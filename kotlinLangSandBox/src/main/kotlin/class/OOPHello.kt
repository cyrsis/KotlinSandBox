package `class`

/**
 * Created by victor888 on 2/21/2017.
 */
fun main(args: Array<String>) {
  Greeter(args[0]).greet()
  //Can crush the compiler with this thing
}

class Greeter(val name:String) {
  fun greet() {
     println("Hello, ${name}")
  }
}
