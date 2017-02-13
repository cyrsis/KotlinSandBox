package basics

/**
 * Created by victor888 on 2/13/2017.
 */
fun main(args: Array<String>) {

  var b:String? = null

  //Example One can be done, but not the best version of it
  var l = if (b!= null) b.length else -1
  //or with Safe call

  var length:Int? = b?.length //Right Version
//  var wronglength:Int = b?.length as Int? //Wrong Version

  var elvisOperator = b?.length?: -1
  //This is the version i will use all the time

}