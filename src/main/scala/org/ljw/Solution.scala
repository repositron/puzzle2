package org.ljw

object Solution {
  def adj(a: Array[Int]): Int = {
    if (a.size == 1)
      return 0

    var longest = -1
    var starti = 0

    for {i <- 1 until a.length}
      if (a(starti) < a(i)) {
        if (a(i) <= a(i - 1)) {

          if (i - starti > longest)
            longest = i - starti
        }
      }
      else {
        starti = i
      }
    longest
  }

  def solution (a: Array[Int] ): Int = {
    // write your code in Scala 2.12

    adj (a)
  }
}