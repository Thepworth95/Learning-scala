package conditionals2

object conditional2Main extends App {

  def conditionalAddition(a:Int, b:Int, add:Boolean):Int =
    if (a == 0)
      b
    else if (b == 0)
      a
    else if (add)
      a + b
    else
      a * b


  println(conditionalAddition(3, 9, true))
  println(conditionalAddition(12, 46, true))
  println(conditionalAddition(19, 24,true))
  println(conditionalAddition(3, 9, false))
  println(conditionalAddition(12, 46, false))
  println(conditionalAddition(19, 24,false))
  println(conditionalAddition(0, 24,true))
  println(conditionalAddition(0, 9, false))
  println(conditionalAddition(19, 0,true))
  println(conditionalAddition(3, 0, false))
  println(conditionalAddition(0, 0,true))
  println(conditionalAddition(0, 0, false))
}
