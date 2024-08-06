package com.jatasra.part01basics

object Instructions {

  // Instructions vs Expressions
  // do this, do that, repeat(10) {...} - imperative programming (executed)
  // 2 + 3, IO effects, map, flatMap, filter - functional programming (evaluated)

  // Instructions are executed and expressions are evaluated
  // everything in Scala is an expression
  // in Scala, an instruction is a structure (expression) returning Unit
  val printing: Unit = println("This is an instruction")
  val theUnit: Unit = ()

  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  var aVariable = 10
  val resassignment = aVariable += 1

  def main(args: Array[String]): Unit = {
    println(printing == theUnit)

    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }
  }
}
