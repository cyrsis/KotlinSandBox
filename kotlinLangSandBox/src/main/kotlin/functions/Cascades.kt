package functions

/**
 * Created by victor888 on 2/16/2017.
 */
fun main(args: Array<String>) {

   //This call make extension function and infix call.
  // Very handy to deal with pesky Java object init
  var superman = Superman() with {

    name = "Victor Tong"
    punch()
    fly()
    sidekick = Spiderman() with {
      special()
    }

  }
}

class Spiderman() : SideKick {
  override fun special() {
    val name = "Peter Parker"
    println("$name webs")
  }

}

public infix fun <T> T.with(operation: T.() -> Unit): T {
  operation()
  return this
}

class Superman {
  var name: String = "Victor Tong"
  var sidekick: SideKick = Robin()
  fun punch() = print("$name punches")
  fun fly() = print("$name flies")
  fun kick() = print("$name kicks")

}

class Robin : SideKick {
  var name: String = "Robin"
  override fun special() = println("$name is useless")

}

interface SideKick {
  public fun special()

}
