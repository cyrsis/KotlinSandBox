package basics

/**
 * Created by victor888 on 2/13/2017.
 */
fun main(args: Array<String>) {
  var sampleString: Any = "Sample String"
  var length: Int?
  if (sampleString is String) //because the check in here  if...is
  {

    length = sampleString.length //no need casting to String before access the .length
  }


  printStringLength("Victor")
}

//In Java we have do this
//public	void	printStringLength(Object	obj)	{
//  if	(obj	instanceof	String)	{
//    String	str	=	(String)	obj
//        System.out.print(str.length())
//  }
//}

fun	printStringLength(any:	Any)	{
  if	(any	is	String)	{
    println(any.length)
  }
}

fun isEmptyString(any: Any): Boolean {
  return any is String && any.length ==0
}

fun	isNotStringOrEmpty(any:	Any):	Boolean	{
  return	any	!is	String	||	any.length	==	0
}