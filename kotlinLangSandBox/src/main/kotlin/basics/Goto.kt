package basics

/**
 * Created by victor888 on 2/16/2017.
 */
fun main(args: Array<String>) {

  printAgain@ println("print again")

  loop@
  for (i in 1..50)
  {
     print(i)
     if (i==24)
       return //I want to get back to @printAgain
     if (i==25)

       break@loop

  }
}

//Todo I cannt figure out how to go to @printAgain from the loop