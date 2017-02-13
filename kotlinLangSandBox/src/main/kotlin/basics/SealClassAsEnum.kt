package basics

/**
 * Created by victor888 on 2/14/2017.
 */


//todo Check out the website for further study
//http://arturogutierrez.github.io/2016/09/16/creating-enums-with-associated-data-in-kotlin/
fun main(args: Array<String>) {

  // An event list example but this could be retrieved from a Conversation data store in a real app
  val events = listOf(
      Event(ContentType.Text("Hey, I'm Tony"), Direction.Incoming("Tony Stark")),
      Event(ContentType.Image("URL_TO_IMAGE", "Avengers"), Direction.Incoming("Bruce Banner")),
      Event(ContentType.Audio("URL_TO_AUDIO", 15), Direction.Outgoing(DeliveryStatus.Delivered()))
  )

  for (event in events) {
    renderEvent(event)
  }



}

data class Event(val contentType: ContentType, val direction: Direction)

fun renderEvent(event: Event): Unit {
  when (event.contentType) {
    is ContentType.Text -> println("${event.contentType.body}")
    is ContentType.Audio -> println("Audio of ${event.contentType.duration} secs.")
    is ContentType.Image -> println("Image (${event.contentType.caption})")
  }
}

sealed class ForceAllegiance {
  class Jedi : ForceAllegiance()
  class Sith : ForceAllegiance()
}

fun ForceAllegiance.asString() = when (this) {
  is ForceAllegiance.Jedi -> "The Light"
  is ForceAllegiance.Sith -> "The Dark"
}

sealed class DeliveryStatus {
  class Delivered : DeliveryStatus()
  class Delivering : DeliveryStatus()
  class NotDelivered(val error: String) : DeliveryStatus()
}

sealed class Direction {
  class Incoming(val from: String) : Direction()
  class Outgoing(val status: DeliveryStatus) : Direction()
}

sealed class ContentType {
  class Text(val body: String) : ContentType()
  class Image(val url: String, val caption: String) : ContentType()
  class Audio(val url: String, val duration: Int) : ContentType()
}


