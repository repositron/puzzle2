package org.ljw

object FiftyStars {
  def fs(mass :  Int) : Int = {
    math.floorDiv(mass, 3) - 2
  }

  def getValues(s: String) : Vector[Int] = {
    s.split("\n").map(_.toIntOption).flatten.toVector
  }

  def calcMasses(masses : Vector[Int])(f: Int => Int) : Int = {
    masses.map(f(_)).iterator.sum
  }

  def fuelR(mass: Int) : Int = {
    def f(mass: Int, acc: Int = 0) : Int = {
      val m = fs(mass)
      if (m <= 0)
        acc
      else
        f(m, acc + m)
    }
    f(mass, 0)
  }
}
