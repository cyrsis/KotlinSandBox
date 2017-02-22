package `class`

/**
 * Created by victor888 on 2/20/2017.
 */

//The whole point of static class is makie it "object" for the Class factory
fun main(args: Array<String>) {
//  var pf = PointFactor()
//  pf.NewCarterianPoint(12.0,22.0) //Kind of pain in the ass to get the factory all the time


}

//class PointFactor {
object PointFactor { //Save everything
  fun NewCarterianPoint(x: Double, y: Double): Points {
     return Points(x,y)
  }

  fun NewPolarPoint(x: Double, y: Double): Points {
    return Points(x*Math.cos(y), x*Math.sin(y))
  }
}

class Points(var x:Double, var y:Double)
//The var make it property, can live without it
