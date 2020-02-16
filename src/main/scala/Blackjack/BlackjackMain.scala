package Blackjack

object BlackjackMain extends App {

  def blackjack(a:Int, b:Int):Int =
    if (a>21 && b>21)
    0
  else if (a>21)
    b
  else if (b>21)
    a
  else if (a>b)
    a
  else
    b


  println(blackjack(22,43))
  println(blackjack(12,43))
  println(blackjack(22,13))
  println(blackjack(18,20))
  println(blackjack(19,14))
  println(blackjack(15,15))

}
