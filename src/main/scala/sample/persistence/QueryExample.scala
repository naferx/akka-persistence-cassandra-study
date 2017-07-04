package sample.persistence

import akka.NotUsed
import akka.actor._
import akka.persistence.query.{EventEnvelope, PersistenceQuery}
import akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Source

object QueryExample extends App {

  implicit val system = ActorSystem("example")
  implicit val materializer = ActorMaterializer()
  import system.dispatcher

  val persistentActor = system.actorOf(Props(classOf[ExamplePersistentActor]))


  val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](
    LeveldbReadJournal.Identifier)

 /* val src: Source[EventEnvelope, NotUsed] =
    queries.eventsByPersistenceId("sample-id-1", 0L, Long.MaxValue)

  val events = src.runForeach(println)
*/
 val src =
   queries.eventsByTag("eventFailed")

  val events = src.runForeach(println)

  Thread.sleep(10000)
  system.terminate()
}
