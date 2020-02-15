package iteration

object iterationMain extends App {

  def multiPrint(message: String, a: Int): Unit =
    for (i <- 1 to a)
      println(message)

  multiPrint("hi", 3)

}
