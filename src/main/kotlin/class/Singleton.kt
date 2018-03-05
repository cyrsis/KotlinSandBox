package `class`

/**
 * Created by victor888 on 2/27/2017.
 */

object Singleton{
  private var count = 0
  fun doSomething():Unit{
    println("Calling a doSomething (${++count} call/-s in total)")
  }
}
fun main(args: Array<String>) {
  Singleton.doSomething();
  Singleton.doSomething();
  Singleton.doSomething();
}