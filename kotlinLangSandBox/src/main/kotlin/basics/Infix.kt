package basics

/**
 * Created by victor888 on 3/13/2017.
 */

fun main(args: Array<String>) {
  val account = Account()
    account.add(100.00)
    println(account.balance)

    val accountInInFixWay = AccountInfix()
     accountInInFixWay add 100.00

    println(accountInInFixWay.balance)

}

class AccountInfix {
    var  balance: Double = 0.0

    infix fun add(d: Double) {
        this.balance = balance +d
    }

}


class Account {
  var balance = 0.0
    fun add(d: Double) :Unit {
        this.balance= balance + d
    }

}
