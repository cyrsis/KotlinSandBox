package `class`

/**
 * Created by victor888 on 2/28/2017.
 */
//All inheritance have to be open
//Ctrol + O for override cannt be happen without the "open" keyword
fun main(args: Array<String>) {

  val john = PersonInInheritance("Victor")

  john.Talk()

  var boss = Manager("Manager", listOf(john, john))

  boss.Talk()
}

open class PersonInInheritance(var name: String) {
  open fun Talk() {
    println("hello I am $name")
  }

}

class Manager(name:String, var subordinates:List<PersonInInheritance>): PersonInInheritance(name)
{
  //Ctrl + O, nothing happen
  override fun Talk() {
    //super.Talk() //Instead doing this version I want to do something differerent
    println("I am $name and I have  ${subordinates.size} subordinates")
    println("There names are ${subordinates.forEach { it }}")
  }
}