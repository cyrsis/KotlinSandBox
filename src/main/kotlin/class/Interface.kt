package `class`

import java.io.InputStream
import java.io.OutputStream

/**
 * Created by victor888 on 3/1/2017.
 */
//Interface just punch of contract

interface Document{ //interface with 3 property and 3 methods, no need to init for interface
  val version: Long
  val size: Long
  val name:String
  get() = "NoName"

  fun save(input : InputStream)
  fun load(stream :OutputStream)
  fun getDescription(): String{
    return  "Document $name has $size byte (-s)"
  }
}