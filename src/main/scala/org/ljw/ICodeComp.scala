package org.ljw

object ICodeComp {

  def apply(inst: Array[Int]) : Int = {
    val iCodeComp = new ICodeComp(inst,12, 2).run()
    println("Day 2 anser = " + iCodeComp)
    iCodeComp
  }

  def getValues(s: String) : Array[Int] = {
    s.split(",").map(_.toInt).toArray
  }

  def partII(instructions: Array[Int], target: Int) : Unit = {

    for {
      i <- 0 to 99
      j <- 0 to 99} {

      val result = new ICodeComp(instructions map(identity), i, j).run()
      if (result == target) {
        println("partII " + result + " ::: " +i + ", " + j)
        return
      }

    }
    println("partII none found")
  }
  val puzzle = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,5,23,1,23,5,27,2,27,10,31,1,31,9,35,1,35,5,39,1,6,39,43,2,9,43,47,1,5,47,51,2,6,51,55,1,5,55,59,2,10,59,63,1,63,6,67,2,67,6,71,2,10,71,75,1,6,75,79,2,79,9,83,1,83,5,87,1,87,9,91,1,91,9,95,1,10,95,99,1,99,13,103,2,6,103,107,1,107,5,111,1,6,111,115,1,9,115,119,1,119,9,123,2,123,10,127,1,6,127,131,2,131,13,135,1,13,135,139,1,9,139,143,1,9,143,147,1,147,13,151,1,151,9,155,1,155,13,159,1,6,159,163,1,13,163,167,1,2,167,171,1,171,13,0,99,2,0,14,0"

}

abstract class Instruction
case class Stop() extends Instruction
case class Op(op1: Int, op2: Int, storePos: Int) extends Instruction

class ICodeComp(var inst: Array[Int], noun: Int, verb: Int) {
  def run() : Int = {
    def loop(pos: Int) : Int = {
      val op = inst(pos)
      op match {
        case 1 => {
          inst(inst(pos + 3)) = add(inst(inst(pos + 1)), inst(inst(pos + 2)))
        }
        case 2 => {
          inst(inst(pos + 3)) = mult(inst(inst(pos + 1)), inst(inst(pos + 2)))

        }
        case 99 => return inst(0)
      }
      loop(pos + 4)
    }
    inst(1) = noun
    inst(2) = verb
    loop(0)
  }

  def add(op1: Int, op2: Int) : Int = {
    op1 + op2
  }

  def mult(op1: Int, op2: Int) : Int = {
    op1 * op2
  }


}

