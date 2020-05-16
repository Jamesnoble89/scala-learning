package lectures.part1basics

object Strings extends App{

  val str: String = "Hello, I am learning Scala"
  //access to java member function
  println(str.charAt(2))

  println(str.substring(7, 11))

  println(str.split(" ").toList)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')

  println(aNumberString.reverse)

  println(str.take(2))

  //s interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"

  println(anotherGreeting)

  //f interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)

  //raw interpolator
  println(raw"This is a \n newline")

  val escaped = "this is a \n newline"

  println(raw"$escaped")
}
