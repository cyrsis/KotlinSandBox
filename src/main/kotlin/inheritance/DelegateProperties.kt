package inheritance

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by victor888 on 2/16/2017.
 */
//it actually delegate the behavoir of the property
//The "by" keyword
//Sometime you just want common function for all of the properties
// Example such as the build in one call "lazy
class PropertyDelegate{
   operator fun getValue(thisRef: Any?, property: KProperty<*>):String{
     return "$thisRef, Thank you for delegate ${property.name} to me "
   }

  operator fun setValue(thisRef: Any?,property: KProperty<*>,value:String){
    println("$value had been assign to  '${property.name} in $thisRef .' ")
  }
}

class PersoninPropertyDelegate{
 var name :String by PropertyDelegate()//No init but init by PropertyDelegate
 val lazyValue :String by lazy { //Only Val would work
   println("Lazy init call, only once")
   "LazyValue"
 }// The {} means we have to provide the function

  //Need to know when someone change the property
  var otherName: String by Delegates.observable("John"){ //The prop value
  prop, old, new -> println("$old Change to $new")
  //Change the interface or in event bus
  }
}

fun main(args: Array<String>) {
  var person = PersoninPropertyDelegate()
  person.name = "Victor" //Setter
  val s = person.name //Gettter
   println(s)
  println(person.lazyValue)
  println(person.lazyValue)
  println(person.lazyValue)

  person.otherName ="Jack"

  println(person.otherName)
}
