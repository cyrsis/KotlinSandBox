package basics

/**
 * Created by victor888 on 2/22/2017.
 */
//It is "as" operator, will throw a exception if cast fail, that is why we use ? to get a null
fun main(args: Array<String>) {
  val any = "Some/Path"
  val someString: String = any as String //String will be good
//  val file: File? = any as File //file should be null and cast fail exception!!!

  val someint = 22
  val value = someint as Int
  println(value)
}