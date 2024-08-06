package com.jatasra.part01basics

object Expressions {

  // structures that evaluate to a value
  val meaningOfLife = 40 + 2

  val mathExpression = 2 + 3 * 4

  val equalityTest = 1 == 2

  // if expressions
  val anIfExpression = if (equalityTest) 45 else 99
  val anIfExpression_v2 = if equalityTest then 45 else 99

  // code blocks are also expressions
  val aCodeBlock = {
    // can define local values
    val localValue = 78

    // a bunch of expressions


    // last value = the value of the entire block
    localValue + 99
  }

  val aCodeBlock_v2 =
    val localValue = 78
    localValue + 99

  // pattern matching = switch on steroids
  val someValue = 42
  val description = someValue match {
    case 1 => "the first"
    case 2 => "the second"
    case 42 => "the meaning of life"
    case _ => "something else"
  }

  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(equalityTest)
    println(anIfExpression)
    println(aCodeBlock)
    println(aCodeBlock_v2)
    println(description)
  }
}
