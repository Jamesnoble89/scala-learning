package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def factHelper(x: Int, accumulator: BigInt = 1): BigInt =
    if(x <= 1) accumulator
    else factHelper(x -1, x * accumulator)

  val fact10 = factHelper(10)
  val fact2x10 = factHelper(10, 2)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving")

  //pass in every arg
  savePicture("jpg", 800, 600)

  //use names
  savePicture(width = 700)
}
