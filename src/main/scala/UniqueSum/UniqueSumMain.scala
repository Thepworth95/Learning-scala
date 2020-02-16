package UniqueSum

object UniqueSumMain extends App {

  def uniqueSum(a:Int, b:Int, c:Int):Int =
    if (a==b && a==c)
      0
    else if (a==b)
      c
    else if (a==c)
      b
    else if (b==c)
      a
    else
      a + b + c


  println(uniqueSum(6,6,6))
  println(uniqueSum(1,6,6))
  println(uniqueSum(6,2,6))
  println(uniqueSum(6,6,3))
  println(uniqueSum(3,2,6))

}
