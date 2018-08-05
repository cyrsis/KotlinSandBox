package algosearch

//Binary searching, find the position in the
//Divide it into
fun main(args: Array<String>) {

    val orderlist = listOf("Adam", "Clark", "Tommy", "Tim", "Zack")
    val order = listOf(1, 2, 3, 4, 5)
    println(orderlist)

    val name = "Clark"
    val num = 2

    println("\n$name is in the position ${victorSearch(orderlist, name)} in the ordered List.")
    println("\n$name is in the position ${victorSearch(order, 5)} in the ordered List.")


}

fun <T : Comparable<T>> victorSearch(list: List<T>, key: T): Int? {

    var rangeStart =0
    var rangeEnd = list.count();
    while (rangeStart<rangeEnd) {

        val midindex = rangeStart + (rangeEnd-rangeStart)/2

        if (list[midindex] == key) {
            return midindex
        } else if (list[midindex]<key ) {
            rangeStart= midindex+1
        } else {
           rangeEnd = midindex
        }
    }


    return null
}

fun <T : Comparable<T>> binarySearch(list: List<T>, key: T): Int? {
    var rangeStart = 0
    var rangeEnd = list.count()
    while (rangeStart < rangeEnd) {

        val midIndex = rangeStart + (rangeEnd - rangeStart) / 2

        if (list[midIndex] == key) {
            return midIndex
        } else if (list[midIndex] < key) {
            rangeStart = midIndex + 1
        } else {
            rangeEnd = midIndex
        }
    }
    return null
}