import scala.io.Source

object Day01a extends App:

  def run =
    val lines = Source.fromFile("src/resources/Day01.txt").getLines
    val values = lines.toList
    val numbers = values.map(_.toInt)
    println(numbers.sum)

  run
