package `class`

/**
 * Created by victor888 on 2/13/2017.
 */

//The much more powerful enums, I think it only goes well with
//" when" the switch statement
//Enum is class, can take constructor
fun main(args: Array<String>) {
  var index = 0
  //printEnumInnerValue(index)
  println(Planet.valueOf("VENUS"))
  println(Planet.values())

  var b = Color.Blue
  println("B has the name ${b.name} and has value of ${b.rgb} and b had the position ${b.ordinal}")
  println("B has the ${b.example()}") //How simple this is to invoke the function
  for (x in Color.values()){
    println(x)
  }

  println("Vale of Blue is ${Color.valueOf("Red").rgb}")
}

enum class Color(val rgb:Int) //Enum can do wtih abstract function
{
  Red(0xff0000) {
    override fun example(): String {
      return "blood"
    }
  },
  Green(0x00ff00) {
    override fun example(): String {
      return "Green lead"
    }
  },
  Blue(0x0000ff) {
    override fun example(): String {
      return "Ocean Blue"
    }
  };

  abstract fun example():String

}

fun printEnumInnerValue(index: Int) {
  var index1 = index
  for (e: Colors in Colors.values()) {
    println("${e.name}(${e.item.joinToString(",")})")
  }

  for (c: Colors in Colors.values()) {

    println("${c.name} + ${c.item[index1]}")
    //RED (255,0,0)
    //GREEN(0,128,0)
    //BLUE(0,0,255)
    index1++
    //Todo -> Need to figure out how to access the inner value of Enum Class
  }
}

enum class Colors(val item: IntArray) {
  //Array is mutable, Enum can be break into pieces
  RED(intArrayOf(255, 0, 0)),
  GREEN(intArrayOf(0, 128, 0)), BLUE(intArrayOf(0, 0, 255))
}

public enum class Planet(val mass: Double, val radius: Double) {
  MERCURY(3.303e+23, 2.4397e6),
  VENUS(4.869e+24, 6.0518e6),
  EARTH(5.976e+24, 6.37814e6),
  MARS(6.421e+23, 3.3972e6),
  JUPITER(1.9e+27, 7.1492e7),
  SATURN(5.688e+26, 6.0268e7),
  URANUS(8.686e+25, 2.5559e7),
  NEPTUNE(1.024e+26, 2.4746e7);
}



