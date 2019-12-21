package org.ljw

object Sequence {

/*
  def powerset(s: String)  : List[String] = {
    def h(s: String, result : List[String])  : List[String] = {
      h(s.tail.map(x => s.head), )
    }
    h(s.flatten, List(List()))
  }
*/
  def seq(s: String): List[String] = {

    def perm(s: String, acc: List[String]): List[String] = {
      if (s.isEmpty) acc
      else perm(s.substring(1), acc :::
         List(s(0).toString) ::: (acc map (_ + s(0))))
    }
    val v = perm(s, Nil)
    println(v.mkString(","))
    v
/*
    def preSuffix(s: String) : List[(String, String)] = {
      List(s(0), s.substring(1)) :: preSuffix(s.substring(1))
    }
    for (i <- s(0).toString;
      j <- s.substring(1);
      val sss =  seq(j).map(x => i + x);
    ) yield (sss)*/

/*    if (s.length <= 1) List(s)
    else {
      s :: perm(s(0).toString, seq(s.substring(1)))
    }*/

  }

}

