package basics

//as someAdditionalFunction is great for  conflict

//1.1 -- Check out some of the convention from Java
//-- Lower camelCase for names
//-- Method and Properties lower camelCase
//-- Semicolons  are optional(and only required in a single place)
// -- Types in Uppercase
//package following reserve notation com.victortong.kotlincouse.whatever.whatever
//Package do not have to match the folder name
//Multiple class per file allowed

/**
 * Created by victor888 on 2/2/2017.
 */
fun main(args: Array<String>) {

  println("hello world")

  "victor".Hello()
  "Jim".Hello()
  //someAdditionalFunction("Additional Function Print String")
  //someUtiils("Something interesting")

  //@Language("JSON")
  var string = "{\"name\":\"dahi\"}" //Inject the Json in here for good

  var somethingelse ="something"

  println(string)

//Ctrl+ Shit move Line again,nice

  //println(5.sumInShortForm(10))

}

fun String.Hello() {
  println(this +"Hello")

}
