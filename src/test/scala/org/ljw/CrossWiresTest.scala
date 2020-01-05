package org.ljw

class CrossWiresTest extends org.scalatest.FunSuite {
  test("puzze1") {
    val a = CrossWires.getValues(PuzzleData.d1)
    val points = CrossWires.plotPaths(a.toList, Point(1, 1))

  }

  test("plot points 2") {
    val dir1 = List(U(2), R(2))
    val points = CrossWires.plotPaths2(dir1, Point(1, 1))

  }

  test("intersection") {
    val l1 = List(Line(Point(1, 5), Point(1,10)),
      Line(Point(1, 10), Point(4, 10)))
    val l2 = List(Line(Point(2, 5), Point(0,5)))
    val intersectPoints = CrossWires.calcIntersections(l1, l2)
    assertResult(Point(2, 6))(intersectPoints)

  }
}
