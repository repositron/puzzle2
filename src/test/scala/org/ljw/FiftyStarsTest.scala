package org.ljw

import org.scalatest._

class FiftyStarsTest extends org.scalatest.FunSuite {

  test("mass of 12") {
      assertResult(2)(FiftyStars.fs(12))
  }

  test ("mass of 14") {
    assertResult(2)(FiftyStars.fs(14))
  }

  test ("mass of 1969") {
    assertResult(654)(FiftyStars.fs(1969))
  }

  test ("mass of 100756") {
    assertResult(33583)(FiftyStars.fs(100756))
  }

  test ("masses ") {
    val fuel = FiftyStars.calcMasses(FiftyStars.getValues(v1))(FiftyStars.fs)
    println("aaa " + fuel)
  }

  test ("mr 1969") {
    assertResult(966)(FiftyStars.fuelR(1969))
  }

  test ("mr 100756") {
    assertResult(50346)(FiftyStars.fuelR(100756))
  }

  test ("massesr of values") {
    val fuel = FiftyStars.calcMasses(FiftyStars.getValues(v1))(FiftyStars.fuelR)
    println("bbb " + fuel)
  }

  val v1 =
    """
      |142388
      |128965
      |137791
      |93517
      |98732
      |83948
      |64037
      |124603
      |61093
      |132020
      |99227
      |73227
      |75536
      |53249
      |149300
      |75975
      |146023
      |117855
      |105380
      |127149
      |146894
      |73257
      |69233
      |67090
      |87932
      |107473
      |127873
      |132999
      |139324
      |92861
      |83651
      |91064
      |137074
      |94188
      |96969
      |96592
      |116019
      |52969
      |125456
      |97428
      |112642
      |99901
      |89405
      |91983
      |56445
      |64917
      |72393
      |127679
      |122430
      |142036
      |87228
      |118322
      |51965
      |67787
      |130183
      |124044
      |101324
      |107800
      |85585
      |67886
      |140772
      |138280
      |73183
      |116096
      |79239
      |105958
      |92719
      |70896
      |115279
      |51912
      |74396
      |75121
      |131819
      |67970
      |96436
      |107074
      |135588
      |97510
      |57877
      |114504
      |50521
      |100144
      |67840
      |51319
      |73801
      |128333
      |123521
      |105916
      |92601
      |146340
      |135355
      |51461
      |95648
      |92635
      |126711
      |75717
      |136114
      |106814
      |89913
      |119734
      |""".stripMargin
}
