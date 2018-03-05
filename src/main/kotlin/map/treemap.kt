package map

import java.util.*

/**
 * Created by victor888 on 2/11/2017.
 */

fun main(args: Array<String>) {
  //TreeMap是有序的，HashMap和HashTable是无序的
  val binaryReps = TreeMap<Char, String>()
  for (c in 'A'..'F') {
    val binary = Integer.toBinaryString(c.toInt())
    binaryReps[c] = binary
  }

  binaryReps.forEach { t, u -> println("$t,$u")  }
  //TreeMap ensure the keys are sorted by their naturla ordering (by its key), or by comparator
}