package Strings

object StringsMain extends App {

  def endOfString(string: String, characters: Int): String = string.substring(string.length()-characters)

  println(endOfString("hello",3))

}