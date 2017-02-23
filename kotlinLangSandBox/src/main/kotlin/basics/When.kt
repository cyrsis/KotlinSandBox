package basics

/**
 * Created by victor888 on 2/14/2017.
 */
//More Powerful Switch Statement from C# in expression form
//it can return
//can be replace most of the if else block
fun main(args: Array<String>) {

  var x = 245
  var greater ={y:Int -> y>100}

  when{
    x in 1..100 -> println("In ranage")
    greater(x) -> println("Great")
    x == 5 -> println("Exact Match")
    else -> println("Outside range")
  }

  println(isZeroOrOne(1))
  whenInRange(20)
  whenInCollection(20)
  whenInSmartCasting("20")
  whenWithoutArgs(10,20)
}

fun  whenWithoutArgs(x: Int, y: Int) { //Can replace the if else block
  when{
    x < y -> println("x is less than y")
    x > y -> println("x is bigger than y")
    x == y -> println("x is equal y")
  }
}

fun whenInSmartCasting(s: Any) {
  when(s)
  {
    is String -> s.startsWith("S")
  }
}

fun whenInCollection(i: Int) {
  when (i){
    in listOf(1,2,3,4,5,6) -> true
    else -> false
  }

}

fun whenInRange(i: Int): Boolean {
  return when (i){
    in -9..9 -> true //Check for single Digital
    else -> false
  }

}

fun isZeroOrOne(i: Int): Boolean { //no more if else in here, so much clean
  return when (i){
    0,1 ->true
    else -> false
  }
}



enum class DayOfWeek(val dayNumber: Int) {
  MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
  FRIDAY(5), SATURDAY(6), SUNDAY(7)
}




//Swift 3 Code
//public enum DayOfWeek {
//  MONDAY(1),
//  TUESDAY(2),
//  WEDNESDAY(3),
//  THURSDAY(4),
//  FRIDAY(5),
//  SATURDAY(6),
//  SUNDAY(7);
//
//  private int dayNumber;
//  private DayOfWeek(int dayNumber) {
//    this.dayNumber = dayNumber;
//  }
//  public int getDayNumber() {
//    return dayNumber;
//  }
//}