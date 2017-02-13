package basics

/**
 * Created by victor888 on 2/13/2017.
 */
fun main(args: Array<String>) {
  var sampleString: Any = "Sample String"
  var length: Int?
  if (sampleString is String)
  {

    length = sampleString.length //no need casting to String before access the .length
  }

}