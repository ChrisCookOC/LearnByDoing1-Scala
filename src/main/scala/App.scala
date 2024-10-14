import java.time.{Instant, LocalDate, LocalDateTime}

object App {

  def main(args: Array[String]): Unit = {
    val startTime = System.nanoTime()

    val answer = DuplicateFinder().run()

    println(s"Answer is ${answer._1} & ${answer._2}")

    val endTime = System.nanoTime()

    val timeElapsed = (endTime - startTime) / 1000000000

    println(s"Elapsed time is ${timeElapsed} seconds")

  }
}

