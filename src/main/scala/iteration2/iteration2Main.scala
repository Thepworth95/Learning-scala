package iteration2

object iteration2Main extends App {

  def multiPrint(message: String, a: Int): Unit =
    for (i <- 1 to a) {
      for (i <- 1 to a) {
        print(message)
        print(" ")
      }
      println("")
    }

  multiPrint("H", 3)

}
