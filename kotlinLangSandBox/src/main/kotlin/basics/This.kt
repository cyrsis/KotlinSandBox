package basics

/**
 * Created by victor888 on 2/22/2017.
 */
//the instance vairable "this"
fun main(args: Array<String>) {
  val test = PersonInThis("Victor")
  test.printme()

}

class PersonInThis(var name: String) {
  fun printme() = println(this.name) //this is
}
