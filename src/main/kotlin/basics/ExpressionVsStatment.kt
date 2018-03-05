package basics

import java.io.IOException
import java.util.*


/**
 * Created by victor888 on 2/22/2017.
 */
fun main(args: Array<String>) {
  "An expression is a statement evaluate to a value".startsWith("A")
  //This expression evaluated to "true"

  val statment = 1
  //the Statement has no resulting value return

  isZero(20)

  val date = Calendar.getInstance().get(Calendar.YEAR)
  val today = if (date ==2017) true else false

  println(today)

  val sucess = try {  //Sucess will come out from the try block
   // readFile()
    true
  }catch (e:IOException)
  {
    false
  }

}

fun isZero(i: Int) :Boolean {
//  var isZero :Boolean   //This is a statement,
//  if (i==0)
//    isZero=true
//  else
//    isZero=false
//  return isZero

  return if (i==0) true else false //this is expression , there works much better for read and boilerplate

}



