package Strings2

object Strings2Main extends App {

  def combineAndReplace(string1: String, string2: String, char1: Char, char2: Char): String = (string1 + string2).replace(char1, char2)

  println(combineAndReplace("", "llo", 'a', 'e'))

}