package `class`

/**
 * Created by victor888 on 3/2/2017.
 */


fun main(args: Array<String>) {
  Button().Click()
}

class Button :Clickable,Touchable {
  override fun Click() = println("I am click")
}

interface Touchable {

}

interface Clickable {
  fun Click()
}
