import scala.io.Source

case class DuplicateFinder() {

  def run(): (String, String) = {

    val startTime = System.nanoTime()
    val list = csvToList()
    val endTime = System.nanoTime()

    val timeElapsed = (endTime - startTime) / 1000000000

    println(s"List time is $timeElapsed seconds")


    val answer = findDuplicates(list)

    (answer.head(0), answer.last(0))

  }

  private def csvToList() =
      Source.fromResource("puzzle.csv").getLines()
      .map(_.split(","))
      .toList
//    csv.split("\n").foldLeft(List.empty[(String, String)]){
//      (cur, entry) => {
//        val entrySplit = entry.split(",")
//        cur :+ (entrySplit.head, entrySplit.last)
//      }
//    }

  private def findDuplicates(list: List[Array[String]]) = {
    //list.filter(x => list.count(_._2 == x._2)== 2)
//    val firstMatch = list.find(x => list.count(_._2 == x._2) == 2).get
//    val secondMatch = list.find(x => x._2 == firstMatch._2 && firstMatch._1 != x._1).get
//    (firstMatch, secondMatch)

    list.groupBy(x => x(1)).filter(x=>x._2.size == 2).head._2

  }

}
