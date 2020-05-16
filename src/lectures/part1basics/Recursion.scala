package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  //can overflow
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x -1, x * accumulator)

    factHelper(n, 1) //tail recursive = recursive call as last expression
  }

  //concatenate a string n times using tail recursion

  def stringConcat(s: String, n: Int) :String = {
    @tailrec
    def tailStingConcat(n: Int, sAccumulator: String): String = {
      if(n < 1) sAccumulator
      else tailStingConcat(n -1, sAccumulator + " " + s)
    }
    tailStingConcat(n, "")
  }

  println(stringConcat("Hi", 5))

  def isPrime(n: Int): Boolean ={
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(50))

  def fibonacciSequence(n: Int): Int ={
    @tailrec
    def fiboTailRec(i: Int, fib1: Int, fib2: Int): Int = {
      if(i >= n) fib1
      else fiboTailRec(i +1 , fib1 + fib2, fib1)
    }
    if(n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacciSequence(5))
}
