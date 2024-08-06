package com.jatasra.part01basics

object Functions {

  // function = mini-program/reusable piece of code that you can parameterize
  def aFunction(a: String, b: Int): String =
    // always a single instruction
    a + " " + b

  val anInvocation = aFunction("Scala", 999)

  def aVoidFunction(aString: String): Unit =
    println(aString)

  def aFunctionWithSideEffects(aString: String): String = {
    println(aString) // side effects
    aString + " " + aString // last expression gets "returned"
  }

  // can define smaller functions inside bigger ones
  def aBigFunction(n: Int): Int = {
    // can define smaller functions
    def aSmallerFunction (a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n + 1)
  }

  def main(args: Array[String]): Unit = {
    println(anInvocation)
    println(aVoidFunction("Hello Scala"))
    println(aFunctionWithSideEffects("World"))
    println(aBigFunction(5))
  }
}
