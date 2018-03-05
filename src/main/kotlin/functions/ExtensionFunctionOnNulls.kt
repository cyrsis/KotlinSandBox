package functions

/**
 * Created by victor888 on 3/13/2017.
 */

//This is a safe way to check equal for nulls
fun main(args: Array<String>) {
  var x= 123
    var y = null

    println(x.safeEquals(y))

}

fun	Any?.safeEquals(other:	Any?):	Boolean	{
    if	(this	==	null	&&	other	==	null)	return	true
    if	(this	==	null)	return	false
    return	this.equals(other)
}