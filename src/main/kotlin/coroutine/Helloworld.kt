package coroutine

import kotlinx.coroutines.experimental.cancelAndJoin
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.lang.Thread.sleep
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread


fun main(args: Array<String>) = runBlocking{


    val job = launch {


        repeat(1000) {
            delay(100)
            print(".")
        }
    }

    delay(2500)

    job.cancelAndJoin()

    println("done")
}


