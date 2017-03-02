package `class`

import java.util.*

/**
 * Created by victor888 on 3/2/2017.
 */

//The best use case is from java.io
//Imp is AudioinputStream
//ByteArrayInputStream
//FileInputStream
abstract class abs {
  abstract fun dosomething()
}

open	class	AParent	protected	constructor()	{
  open	fun	someMethod():	Int	=	Random().nextInt()
}
abstract	class	DDerived	:	AParent()	{
  abstract	override	fun	someMethod():	Int
}
class	AlwaysOne	:	DDerived()	{
  override	fun	someMethod():	Int	{
    return	1
  }
}
