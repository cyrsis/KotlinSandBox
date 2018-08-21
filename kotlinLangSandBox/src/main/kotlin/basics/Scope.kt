package basics

/**
 * Created by victor888 on 2/22/2017.
 */
//T
class Building(val address: String) {
  inner class Reception(telephone: String) {
    fun printMyAddress() = println(this@Building.address)
  }
}
//The nested scope, if we want to refer an outer instance.We have to use
//label