package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 2))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  //Use recursion instead of loops
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  //function with return type unit only executes sideeffects
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("Hi")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+ b

    aSmallerFunction(n, n-1)
  }

  def greetingWithNameAndAge(name: String, age: Int): Unit = println("Hi, my name is " + name + " and I am " + age + " years old")

  greetingWithNameAndAge("James", 31)

  def factorialCalculator(n: Int): Int = {
    if(n == 1) n
    else n * factorialCalculator(n-1)
  }

  println(factorialCalculator(10))

  def fibonacciSequence(n: Int): Int ={
    if(n <= 2) 1
    else fibonacciSequence(n -1) + fibonacciSequence(n-2)
  }

  println(fibonacciSequence(7))

  def isPrime(n: Int): Boolean ={
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(156*10840))
}
