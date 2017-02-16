package map

/**
 * Created by victor888 on 2/13/2017.
 */
//Kotlin do not have concept of Dictionary,
//And HashMap does not have a concept of TryGetValue, it just
//a look up table which is more efficient because it is  a single lookup

fun main(args: Array<String>) {
  val myHashMap = HashMap<Int, String>()
  myHashMap[1] ="cat"
  myHashMap[2] ="hat"
  myHashMap[3] ="mat"
   myHashMap.forEach { t, u -> print("item[$t]=$u \n") }

  //Kotlin do not have new keyword, to make a object would be something like this
  //Something like hashMapOf just like observable "of" something
  var map:HashMap<String,Int>  = hashMapOf<String,Int>("one" to 1,"two" to 2)
  println(map["one"])

  val dict = hashMapOf("Women" to "Do shopping", "Man" to "Work like a dog","Kids" to "Always have good time")

  //This is call multi declaration where yu assign the each pair key and value to separate variables
  for ((k,v) in dict)
    println("Keys in $k has value $v")

  for (k in dict.keys)
    println("Keys in '$k' with value '${dict[k]}'")

  println("Looping using entrySet")

  dict.entries.forEach { x-> println("key ${x.key} with value ${x.value}") }



}


