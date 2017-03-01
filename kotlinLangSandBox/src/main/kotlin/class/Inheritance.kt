package `class`

/**
 * Created by victor888 on 2/28/2017.
 */
fun main(args: Array<String>) {

  val john = PersonInInheritance("Victor")

  john.Talk()
}

open class PersonInInheritance(var name: String) {
  fun Talk() {
    println("hello I am $name")
  }

}

class Manager(name:String, var subordinates:List<PersonInInheritance>): PersonInInheritance(name)
{

}