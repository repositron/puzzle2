package org.ljw

import scala.util.control.Breaks._

object BreakTest {
  def fn(up: Int) : Int = {
    var sum = 0
    breakable {
      while (true) {
        sum += 1
        if (sum >= up) break
      }
    }
    sum
  }
}

