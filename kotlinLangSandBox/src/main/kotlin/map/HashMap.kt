package map

/**
 * Created by victor888 on 2/13/2017.
 */
//Kotlin do not have concept of Dicionary,
//And HashMap does not have a conceopt of TryGetValue, it just
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
}