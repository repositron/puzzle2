package org.ljw

object Bi {

  def solution(a: Array[Int]): Int = {
    var long = 0
    var nextStart = 0
    if (a.size == 1)
      return 1
    if (a.size == 0)
      return 0
    while (nextStart < a.size - 1) {
      var (i : Int, j: Int) = bi(a, nextStart)
      if (i > long)
        long = i
      nextStart = j
      if (nextStart == -1)
        return long
    }
    long
  }

  def bi(a: Array[Int], start: Int) : (Int, Int) = {
    var long = 0
    var x = start
    var i = start + 1;
    var nextStartLoc = -1
    while ( i < a.size && a(i) == a(x)) {
      i = i + 1
    }
    // could be longest
    if (long < i - x)
      long = i - x
    if (a.size <= i)
      return (long, nextStartLoc)

    nextStartLoc = i
    var y = i
    i = i + 1
    while (i < a.size && (a(i) == a(x) || a(i) == a(y))) {
      i = i + 1
    }
    if (long < i - x - 1)
      long = i - x - 1

    (long + 1, nextStartLoc)

  }
}
