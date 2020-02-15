package iteration3

import scala.collection.mutable.ListBuffer

object iteration3Main extends App {

  def fizzBuzz(fizz:String, buzz:String, limit: Int): List[Any] = {
    var list = ListBuffer[Any]()
    for (i <- 1 to limit) {
      if (i % 3 == 0 && i % 5 == 0) {
        list += fizz + buzz
      }
      else if (i % 3 == 0) {
        list += fizz
      }
      else if (i % 5 == 0) {
        list += buzz
      }
      else {
        list += i
      }
    }
    list.toList
  }

  println(fizzBuzz("fizz", "buzz", 15))
}