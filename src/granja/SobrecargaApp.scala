package granja

object SobrecargaApp extends App {
  
  val a = new A
  
  val b: AnyVal = 5
  
  a.m("bla")
  a.m(b)
  a.m(b)
}

class A {
  def m(p: String): String = {
    println(s"String $p")
    ""
  }
  
  def m(p: Int): Int = {
    println(s"Int $p")
    2
  }
  
//  def m(p: Any): String = {
//    println(s"Any $p")
//    ""
//  }
  
  def m(p: AnyVal): String = {
    println(s"AnyVal $p")
    ""
  }
  
}

