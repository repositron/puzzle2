package org.ljw.test

import org.scalatest._
import org.ljw.Sequence


class SequenceSpec extends FunSuite {

  test("An empty Set should have size 0") {
    val a =
    Assertions.assertResult(Set("xyz", "xy", "yz", "xz", "x", "y", "z"))(Sequence.seq("xyz").toSet)

  }
}
