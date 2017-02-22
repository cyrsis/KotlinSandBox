package collection

/**
 * Created by victor888 on 2/22/2017.
 */
//Gen some number for a test
fun main(args: Array<String>) {
  val aToz = "a".."z"
  val oneToNine = 1..9

  //Do some testing for whether is in ranges

  val isTrue = "c" in aToz

  println(isTrue)

  val isFalse = 11 in oneToNine

  println(isFalse)

  //not cover by .. operator
  val countDown = 100 downTo 2 step 2
  val rangto= 10.rangeTo(20)

  //Return a new range of data
  val oneToFifty = 1..50
  val oddNumber = oneToFifty.step(2)

  oddNumber.forEach { print(it) }
  val countingDownEvenNumbers = (2..100).step(2).reversed()

  countingDownEvenNumbers.forEach { print("$it \t") }



}