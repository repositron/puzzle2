package org.ljw

class BiTest extends org.scalatest.FunSuite {
  test("x") {
    assertResult(2)(Bi.solution(Array(1, 2)))
  }


  test("x2") {
    assertResult(4)(Bi.solution(Array(1, 2, 1, 2)))
  }

  test("x3") {
    assertResult(3)(Bi.solution(Array(1, 2, 3, 2)))
  }
}
