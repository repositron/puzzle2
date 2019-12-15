package org.ljw

import org.scalatest._


class SequenceSpec extends FunSuite {

  test("An empty Set should have size 0") {
    val a =
    Assertions.assertResult(Set("xyz", "xy", "yz", "xz", "x", "y", "z"))(Sequence.seq("xyz").toSet)
    
  }


}
