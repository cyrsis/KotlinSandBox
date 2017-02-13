package basics

/**
 * Created by victor888 on 2/13/2017.
 */

//The much more powerful enums, I think it only goes well with
//" when" the switch statement
fun main(args: Array<String>) {

  for (c:Colors in Colors.values()) {
    println("${c.name} + ${c.item[0]}")
    //Todo -> Need to figure out how to access the inner value of Enum Class
  }
}

enum class Colors(val item:IntArray){
   RED(intArrayOf(255,0,0)),
   GREEN(intArrayOf(0,128,0)),
   BLUE(intArrayOf(0,0,255))
}
