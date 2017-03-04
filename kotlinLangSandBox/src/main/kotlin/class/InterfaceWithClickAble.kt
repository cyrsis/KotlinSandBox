package `class`

/**
 * Created by victor888 on 3/2/2017.
 */

//Interface in Kotlin can use property too which java cannt do
//Just punch of thing need to be there,
fun main(args: Array<String>) {
  var somebutton= Button(12)
  somebutton.Click()
  println(somebutton.name)
  println(somebutton.foo)
}

class Button(override var foo:Int) :Clickable,Touchable {//3. use the primary constructor
  //override var foo: Int = 12                           //2. or assign a value so I dont have to do the backing field
//    get() =                                            //1. With Var I can make the getter and setter work in here
//        "not implemented") //To change initializer of created properties use File | Settings | File Templates.
//    set(value) {}
  override val age: Int
    get() = 12 //To change initializer of created properties use File | Settings | File Templates.

  override fun Click() = println("I am click")
}

interface Touchable {
   val name:String get() = "Touchable" //Add the property that can interace
  val age:Int   //Abstract property , concrete class need to implement the members

  var foo:Int //With Var need to implement the setter and getter
}

interface Clickable {
  fun Click()
}
