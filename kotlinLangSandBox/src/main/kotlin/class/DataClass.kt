package `class`

data class Personlocal(val name:String,val age: Int? =null) {
}
//With Data Class
//I will get
// --- equal
// --- HashCode
// --- ToString() in default
// --- copy()
// -- Destructing

/**
 * Created by victor888 on 2/8/2017.
 */
//The data class will auto gen lot of things for me, like compare and thing like that
fun main(args: Array<String>) {

  val persons = listOf(Personlocal("Alice",39),Personlocal("Bob",21))
  val persons2 = listOf(Personlocal("Alice",39),Personlocal("Bob",21))

  println(persons == persons2)
  //I want to compare this two without do anything
  //That is why i need dataclass
  val oldest = persons.maxBy { it.age ?: 0 }

  println("The oldest person is $oldest");

  val personlocal = Personlocal("Victor",10)
  val personlocal2 = personlocal.copy()
  val (name, age) = Personlocal("Victor",22) //this is call destructuring
  println(name) //After destructing, everything would work

}