package collection

/**
 * Created by victor888 on 2/13/2017.
 */
//List<T> from C# seems missing  in Kotlin
//it actually is arrayListOf in Kotlin
fun main(args: Array<String>) {

  val listofDouble = arrayListOf<Double>(-1.0, -2.1, 4.4)

  listofDouble.add(22.0)
  listofDouble.remove(-2.1)

  listofDouble.forEach (::println )

}
//The concept of mutable and immutable collection,
//Read up from here https://kotlinlang.org/docs/reference/collections.html
