package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, age: Int){
    def +(title: String) : Person  = new Person(s"$name ($title)", favouriteMovie, age)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def learns(item: String) : String = s"$name learns $item"
    def learnsScala : String = this.learns("Scala")
    def apply(value: Int): String = s"$name watched $favouriteMovie $value times"
  }

  val mary = new Person("mary", "Bill and Ted", 32)
  println(mary + "The Excellent")
  println(+mary)
  println(mary learnsScala)
  println(mary(2))

}
