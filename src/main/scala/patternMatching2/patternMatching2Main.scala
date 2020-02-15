package patternMatching2

import scala.collection.mutable.ArrayBuffer

object patternMatching2Main extends App {

  def reverse(list: Any): Any = list match {
    case (x,y) => y + "," + x
    case x:List[Any] => x(1) + "," + x.head
    case y:Array[Int] => y(1) + "," + y(0)
  }


  val list: List[Int]= List(1,2)
  val array: Array[Int]= Array(1,2)
  println(reverse(1,2))
  println(reverse(list))
  println(reverse(array))


}
