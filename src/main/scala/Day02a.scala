import scala.io.Source

object Day02a extends App:

  val lines = Source.fromFile("src/resources/Day02.txt").getLines
  val values = lines.toList
  val forward = values
                   .filter(_.contains("forward"))
                   .map(_.split(" ").last.toInt)
                   .sum
  val depth = values
                   .filter(direction => direction.contains("down") || direction.contains("up"))
                   .map(_.replace("down ","").replace("up ","-").toInt)
                   .sum

  println(forward * depth)

