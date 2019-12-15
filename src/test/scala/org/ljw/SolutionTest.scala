package org.ljw

class SolutionTest extends org.scalatest.FunSuite {
  test("a") {
    assertResult(4)(Solution.solution(Array(1, 4, 7, 3, 3, 5)))
  }

  test("b") {
    assertResult(1)(Solution.solution(Array(1, 4)))
  }
}
