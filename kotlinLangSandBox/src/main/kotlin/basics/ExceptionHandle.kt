package basics

import java.nio.file.Files
import java.nio.file.Path

/**
 * Created by victor888 on 2/22/2017.
 */

//ExceptionHandle is same as Java, but exceptions are unchecked which means no more shit in method signatures

class File(path:String)
{
  fun close():Unit {}
}

fun openFile():File =File("")
fun readFromFile(file: File):Unit{}

fun readFile(path: Path):Unit
{
  val input = Files.newInputStream(path)
  try {
    var byte = input.read()
    while (byte !=-1){
      println(byte)
      byte = input.read()
    }
  } catch(e: Exception) {
    println("Error reading from file. Error was ${e.message}")
  } finally {
    input.close()
  }
}

fun main(args: Array<String>) {
  val a = File("/mock.txt") //No new for constructor, just call the function as constructor
  val b = File("/mock.txt")

  val sameRef = a === b //This is referential equality to test 2 reference to same files
  //or !== not the same file object
}