package org.ljw

class BreakTestTest extends org.scalatest.FunSuite {


  test ("2 lines") {

    assertResult(5000)(BreakTest.fn(5000))

  }
}
