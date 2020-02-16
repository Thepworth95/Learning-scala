package TooHot

object TooHotMain extends App {

  def tooHot(temp: Int, summer: Boolean):Boolean =
    if (summer)
      temp<100 && temp>60
    else
      temp<90 && temp>60



  println(tooHot(50,true))
  println(tooHot(50, false))
  println(tooHot(70,true))
  println(tooHot(70,false))
  println(tooHot(95,true))
  println(tooHot(95,false))
  println(tooHot(105,true))
  println(tooHot(105,false))
}
