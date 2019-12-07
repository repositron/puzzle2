package org.ljw

object Sequence {

  def seq(s: String): List[String] = {
    def perm(s: String): String = {
      if (s.isEmpty) ""
      else s.substring(0) + perm(s.substring(1))
    }

    if (s.isEmpty) Nil
    else {
      s :: (if (s.size > 0) seq(s.substring(1)) else List(""))
    }

  }

}

