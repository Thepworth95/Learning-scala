package TypeInterface

object TypeInterfaceMain extends App {

  def returnInput(input: Any): Any = input

  println(returnInput(6.5))
  println(returnInput("Hello"))
  println(returnInput(65))
  println(returnInput(true))

}
