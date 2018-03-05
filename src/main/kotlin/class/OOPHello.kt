package `class`

/**
 * Created by victor888 on 2/21/2017.
 */

//Kotlin support
//encapsulation
// -- all related fields and method are treated as object
//inheritance
// -- new class from exisiting one
//ploymorphism
// -- use interface to make different classes interchanegable

//constructor keyboard is for primary constructor
//init can act like vaild block for argument
//require keyboard throw exception
//val is all properties
//Example of second constructor that call first with this keyword
//constructor(firstName:	String,	lastName:	String)	:		this(firstName, lastName,	null)

//var vs val is not much in constructor
//dont want getter and setting, use val instead
class	Person	constructor(val	firstName:	String,	val	lastName:		String, val	age:	Int?)	{
  init {
    require(firstName.trim().length>0) {"Invalid firstName argument."}
    require(lastName.trim().length>0) {"Invalid lastName argument."}
    if (age!= null){
      require(age>= 0&& age<150){"Invalid age argument."}
    }
  }

}
//constructor keyboard is for primary constructor
fun main(args: Array<String>) {
  //Greeter(args[0]).greet()
  //Can crush the compiler with this thing

  val	person1	=	Person("Alex",	"Smith",	150)
  val	person2	=	Person("Jane",	"Smith",	null)
  println("${person1.firstName},${person1.lastName}	is ${person1.age} years	old")
  println("${person2.firstName},${person2.lastName}	is ${person2.age?.toString()	?:	"?"}	years	old")
}

class Greeter(val name:String) {
  fun greet() {
     println("Hello, ${name}")
  }
}
