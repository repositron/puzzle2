package org.ljw

import jdk.nashorn.internal.runtime.CodeStore.DirectoryCodeStore
import org.scalatest._

class CrossWiresTest extends org.scalatest.FunSuite {
  test ("2 lines") {
    val v = CrossWires.solve("R4,U4", "U4,R5,D2,L2", Point(1, 1))
    assertResult(6)(v)
    println("crosswires  2 lines" + v)
  }

  test("snake") {
    val p = CrossWires.plotPaths(List(U(4), R(5), D(2)/*, L(2)*/), Point(1, 1))
    assertResult(Set(Point(1, 2), Point(1, 3), Point(1, 4), Point(1, 5), //U4
      Point(2, 5), Point(3, 5), Point(4, 5), Point(5, 5), Point(6 ,5), // R5
      Point(6, 4), Point(6, 3), // D2
   //   Point(5, 3), Point(4, 3) // L2
    ))(p)
  }

  test("puzze1") {
    val v = CrossWires.solve(PuzzleData.l1, PuzzleData.l2, Point(1, 1))
    println("crosswires " + v)
  }

  test("one up") {
    val a = CrossWires.plotPaths(List(U(1)), Point(1, 1))
    assertResult(Set(Point(1, 2)))(a)
  }

  test("two up, one right") {
    val a = CrossWires.plotPaths(List(U(2), R(1)), Point(1, 1))
    assertResult(Set(Point(1, 2), Point(1,3), Point(2, 3)))(a)
  }

  test("down 4") {
    val p = CrossWires.dirToPoints(D(4))(Point(2, 8))
    assertResult(List(Point(2, 4), Point(2, 5), Point(2, 6),Point(2, 7)))(p)
  }

  test("left 4") {
    val p = CrossWires.dirToPoints(L(4))(Point(6, 8))
    assertResult(List(Point(2, 8), Point(3, 8), Point(4, 8),Point(5, 8)))(p)
  }

  test("left 4 (1,1)") {
    val p = CrossWires.dirToPoints(L(4))(Point(1, 1))
    assertResult(List(Point(-3, 1), Point(-2, 1), Point(-1, 1), Point(0, 1)))(p)
  }

  test("up 4") {
    val p = CrossWires.dirToPoints(U(4))(Point(2, 8))
    assertResult(List(Point(2, 12), Point(2, 11), Point(2, 10), Point(2, 9)))(p)
  }

  test("right 4") {
    val p = CrossWires.dirToPoints(R(4))(Point(2, 8))
    assertResult(List(Point(6, 8), Point(5, 8), Point(4, 8), Point(3, 8)))(p)
  }

 /* test("plot points 2") {
    val dir1 = List(U(2), R(2))
    val points = CrossWires.plotPaths2(dir1, Point(1, 1))

  }

  test("intersection") {
    val l1 = List(Line(Point(1, 5), Point(1,10)),
      Line(Point(1, 10), Point(4, 10)))
    val l2 = List(Line(Point(2, 5), Point(0,5)))
    val intersectPoints = CrossWires.calcIntersections(l1, l2)
    assertResult(Point(2, 6))(intersectPoints)

  }*/
}
