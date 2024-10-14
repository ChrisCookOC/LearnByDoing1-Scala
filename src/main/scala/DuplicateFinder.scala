import scala.io.Source

case class DuplicateFinder() {

  def run(): (String, String) = {

    val file = Source.fromResource("puzzle.csv").getLines().mkString("\n")
    val list = csvToList(file)

    val answer = findDuplicates(list)

    (answer.head._1, answer.last._1)

  }

  private def csvToList(csv: String) =
    csv.split("\n").foldLeft(List.empty[(String, String)]){
      (cur, entry) => {
        val entrySplit = entry.split(",")
        cur :+ (entrySplit.head, entrySplit.last)
      }
    }

  private def findDuplicates(list: List[(String, String)]) = {
    //list.filter(x => list.count(_._2 == x._2)== 2)
//    val firstMatch = list.find(x => list.count(_._2 == x._2) == 2).get
//    val secondMatch = list.find(x => x._2 == firstMatch._2 && firstMatch._1 != x._1).get
//    (firstMatch, secondMatch)

    list.groupBy(x => x._2).filter(x=>x._2.size == 2).head._2

  }

}
