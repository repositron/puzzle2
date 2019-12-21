package org.ljw

class CrossWiresTest extends org.scalatest.FunSuite {
  test("puzze1") {
    val a = CrossWires.getValues(PuzzleData.d1)
    val points = CrossWires.plotPaths(a.toList, Point(1, 1))

  }

}
