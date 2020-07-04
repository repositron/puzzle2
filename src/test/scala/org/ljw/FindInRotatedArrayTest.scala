package org.ljw

class FindInRotatedArrayTest extends org.scalatest.FunSuite {
  test("basic test") {
    assertResult(4)(
      FindInRotatedArray.find(8, Array(13, 18, 25, 2, 8, 10)))
  }

  test("empty") {
    assertResult(-1)(
      FindInRotatedArray.find(8, Array()))
  }

  test("one element") {
    assertResult(0)(
      FindInRotatedArray.find(8, Array(8)))
  }

  test("0 rotated") {
    assertResult(5)(
      FindInRotatedArray.find(25, Array(2, 8, 10 , 13, 18, 25)))
  }

}
