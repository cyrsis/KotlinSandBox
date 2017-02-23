package `class`

/**
 * Created by victor888 on 2/13/2017.
 */

//The much more powerful enums, I think it only goes well with
//" when" the switch statement
//Enum is class, can take constructor
fun main(args: Array<String>) {
var index =0


  for (e: Colors in Colors.values())
  {
    println("${e.name}(${e.item.joinToString(",")})")
  }

  for (c: Colors in Colors.values()) {

    println("${c.name} + ${c.item[index]}")
    //RED (255,0,0)
    //GREEN(0,128,0)
    //BLUE(0,0,255)
    index++
    //Todo -> Need to figure out how to access the inner value of Enum Class
  }
}

enum class Colors(val item:IntArray){
   RED(intArrayOf(255,0,0)),
   GREEN(intArrayOf(0,128,0)),
   BLUE(intArrayOf(0,0,255))
}
//Array is mutable, Enum can be break into pieces



