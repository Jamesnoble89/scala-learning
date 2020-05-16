package lectures.part1basics

object CBNvsCBV extends App{

  //arguments computed before evaluated
  def calledByValue(x: Long): Unit = {
    println("by val: " + x)
    println("by val: " + x)
  }

  //evaluates argument every time it's used => delays evaluation until used
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit= println(x)

  //printFirst(infinite(), 34) //crashed with stack overflow
  printFirst(34, infinite()) //doesn't crash as not actually calling the second argument
}
