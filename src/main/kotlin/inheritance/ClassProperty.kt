package inheritance

/**
 * Created by victor888 on 2/12/2017.
 */
//Working with OOP for a bit
// -- Pass in as value, Field as reciever

class PersoninClassProperty{

  //A bit crazy if we need to init in here,what we can do it make it as constructor
 // or using lateinit, avoid assign the value with class itself
  //The only problem without laterinit set the name, it will crash
  lateinit var name: String  //All of this is properity , with getter and settier already
  var age:Int = -1   //It does have backing field


  val canVote: Boolean //Cannt not be assign directly to it but can get by the rules
    get() = age >=16 //it do NOT have backing field

  var ssn ="SSN0000000"
      get() = field   //field as backing field
  set(value) {
      field =value
      println("The ssn had been change")

  }
}

//Primary constructor as init block
class Human(var name:String, var age : Int )
{
  //If I want to store the properity
  //Can do it in here
  //or just add var name and var age
   init {

   }
}
fun main(args: Array<String>) {
  val human = Human("Victor", 32)
  println("${human.name} +  ${human.age}")

  val me = PersoninClassProperty()
 me.name ="Victor Tong"
  me.age =33
  print("${me.name}  can ${if (!me.canVote) "not" else "" } vote \n")
  me.ssn ="NEWSSN0000"
  print("${me.ssn}")


}