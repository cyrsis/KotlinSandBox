package functions

import java.io.Closeable

/**
 * Created by victor888 on 2/13/2017.
 */
//C# had using keyword but kotlin dont, here is what we get
//Someone said use "use"
//todo figure out how to use keyword
fun using(obj: Closeable, block: () -> Unit) {
  try {
    block()
  } finally {
    obj.close()
  }
}

fun main(args: Array<String>) {
  val ClassA = ClassA()
  using(ClassA)
  {
     //Do whatever
  }
}

class ClassA : Closeable {
  override fun close() {
    //Do whatever when u done
  }

}
