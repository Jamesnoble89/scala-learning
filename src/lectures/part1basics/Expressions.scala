package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // if expression

  println(aConditionedValue)

  //never loop
  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  //everything in scala is an expression

  //side effects: println(), while, reassigning return unit

  //codeblocks
  //values in block scoped to block
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2 ) "hello" else "goodbye"  //last expression == return
  }
}
