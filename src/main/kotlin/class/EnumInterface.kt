package `class`

/**
 * Created by victor888 on 2/27/2017.
 */
//Enum cal do interface too,maybe because it is a Class instead
interface Printable {
  fun print(): Unit
}

public enum class Word : Printable {
  Hello {
    override fun print() {
      println("Word is hello")
    }
  },
  Bye {
    override fun print() {
      print("Bye Byt")
    }
  }

}

fun main(args: Array<String>) {

  val w = Word.Hello
  w.print()
}