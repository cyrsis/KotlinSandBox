package `class`

/**
 * Created by victor888 on 2/24/2017.
 */
//Create a static method within class

interface IFactory<T>{
  fun create():T
}
class Point(var x:Double,var y:Double){
  companion object /*factory*/ :IFactory<Point>  //I can obmit the factory words in ehre
  {
    override fun create(): Point {
      return Point(0.0,0.0)
    }

    fun createCarterian(x:Double,y:Double) :Point = Point(x,y)
    fun createPolar(x:Double,y:Double) :Point = Point(x,y)

  }
}
fun main(args: Array<String>) {
//The end result is 3 different to create points
  var simplePoint = Point(1.0,2.0)

  //var factoryPoint = Point.factory.createCarterian(1.0,2.0)
  var factoryPoint2 = Point.createCarterian(1.0,2.0) //Same as factory

  //Companion Object can do interface and invoke by
  var defaultPoint = Point.Companion.create() //Companion  object creation

}