package iteration4

import iteration3.iteration3Main.fizzBuzz

import scala.collection.mutable.ListBuffer

object iteration4Main extends App {

  def multiPrintRecursive(message: String, a: Int): Unit =
    if (a > 0) {
      print(message)
      multiPrintRecursive(message, a-1)
    }

  multiPrintRecursive("hi", 3)
  println("")


  def multiPrintV2Recursive(message: String, a: Int, b: Int = 0): Unit = {
    if (a > 0) {
      multiPrintRecursive(message, a + b)
      println("")
      multiPrintV2Recursive(message, a-1, b + 1)
    }
  }

  multiPrintV2Recursive("H", 4)

  def fizzBuzzRecursive(fizz:String, buzz:String, limit: Int): List[Any] = {
    var list = List[Any]()
    assignFizzBuzzValue(fizz, buzz, limit)
    def assignFizzBuzzValue(fizz: String, buzz: String, limit: Int): List[Any] = {
      if (limit % 3 == 0 && limit % 5 == 0)
        list = (fizz + buzz) +: list
      else if (limit % 3 == 0)
        list = fizz +: list
      else if (limit % 5 == 0)
        list = buzz +: list
      else
        list = limit +: list
      if (limit > 1)
      assignFizzBuzzValue(fizz, buzz, limit - 1)
      list
    }
    list

  }
  println(fizzBuzzRecursive("fizz", "buzz", 15))

}
