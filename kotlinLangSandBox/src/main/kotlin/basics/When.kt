package basics

/**
 * Created by victor888 on 2/14/2017.
 */
//More Powerful Switch Statement from C#
fun main(args: Array<String>) {

  var x = 245
  var greater ={y:Int -> y>100}

  when{
    x in 1..100 -> println("In ranage")
    greater(x) -> println("Great")
    x == 5 -> println("Exact Match")
    else -> println("Outside range")
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