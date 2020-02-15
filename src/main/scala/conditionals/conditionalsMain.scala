package conditionals

object conditionalsMain extends App {

  def conditionalAddition(a:Int, b:Int, add:Boolean):Int =
    if (add)
      a + b
    else
      a * b


  println(conditionalAddition(3, 9, true))
  println(conditionalAddition(12, 46, true))
  println(conditionalAddition(19, 24,true))
  println(conditionalAddition(3, 9, false))
  println(conditionalAddition(12, 46, false))
  println(conditionalAddition(19, 24,false))


}
