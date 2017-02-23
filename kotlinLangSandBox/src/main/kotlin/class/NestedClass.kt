package `class`

/**
 * Created by victor888 on 2/23/2017.
 */
//Example of nested class

class OuterClassName {
  class NestedClassName {
  }
}

//
internal class Outer {
  internal class StaticNested
  internal inner class Inner
}

class BasicGraphic(val graphName:String)
{
  class Line(val x1:Int, val y1:Int,val x2:Int,val y2:Int){ //it allow the Line Class to access a private memberof the outer class
    fun draw():Unit
    {
      println("Drawing Line from ($x1,$y1) to ($x2, $y2) ")
    }
  }

  fun draw():Unit
  {
    println("Drawing the graphic $graphName")
  }
}

class BasicGraphicWithInner(val graphName: String)
{
  private val name:String
  init {
    name = graphName
  }
  inner class InnerLine(val x1:Int, val y1:Int,val x2:Int,val y2:Int)
  {
    fun draw():Unit{
      println("Drawing Line from ($x1,$y1) to ($x2,$y2) for graphic $name")
    }

  }
  fun draw():Unit{
    println("Drawing the graphic $name")
  }

}

fun main(args: Array<String>) {
  val line = BasicGraphic.Line(1,0,-2,0)
  line.draw()

}
//Kotlin come with a "this" which is more powerful
class	A	{
  private	val	somefield:	Int	=	1
  inner	class	B	{
    private	val	somefield:	Int	=	1
    fun	foo(s:	String)	{
      println("Field	<somefield>	from	B"	+	this.somefield)
      println("Field	<somefield>	from	B"	+	this@B.somefield)
      println("Field	<somefield>	from	A"	+	this@A.somefield)
    }
  }
}