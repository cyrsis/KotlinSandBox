
fun main(args: Array<String>) {

  //args.map { print(it) }//using map, it is easy to read but no the best
  args.map(::println)

  for (arg in args) { //using forloop
    println(arg)
  }
}