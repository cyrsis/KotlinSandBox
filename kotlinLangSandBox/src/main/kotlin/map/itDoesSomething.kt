package map

/**
 * Created by victor888 on 2/13/2017.
 */
fun main(args: Array<String>) {
  val listOfString = listOf<String>("One", "Two", "Three")
  //itDoesSomethingInCrazyWay(listOfString)
  val itDoesSomethingInBetterWay = itDoesSomethingInBetterWay(listOfString)
  itDoesSomethingInBetterWay.forEach(::println)
}


fun itDoesSomethingInBetterWay(elements: List<String>):List<Pair<String,Int>> {

  return elements.groupBy { it } //Pass in lambda and Group it by x=x
                  .map { Pair(it.key,it.value.count()) } //make into pairs of key and values
}

//fun itDoesSomethingInCrazyWay(elements: List<String>): HashMap<String, Int> {
//  var i = 0
//  val results = hashMapOf<String, Int>()
//  while (i < elements.size) {
//    var element  = results.get(elements[i])
//    if (element != null) {
//      results.set(elements[i], element + 1)
//    } else {
//      results.set(element[i], 1)
//    }
//    i++
//  }
//  return results
//}


