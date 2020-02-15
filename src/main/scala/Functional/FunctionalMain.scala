package Functional

object FunctionalMain extends App {


  var list: Array[String] = java.util.TimeZone.getAvailableIDs.filter(i => i.contains("/"))
  for (i <- 0 to list.length - 1 by 10)
    print((list(i).toString.split("/"))(1) + ", ")


}
