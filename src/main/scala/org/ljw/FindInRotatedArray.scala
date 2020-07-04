package org.ljw

/*
An sorted array of integers was rotated an unknown number of times.
Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.
For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).
*/
object FindInRotatedArray {
  def find(value: Int, array: Array[Int]) : Int = {
    def find0(l: Int, r: Int) : Int =  {
      if (r < l)
        -1
      else {
        val m = (l + r) / 2
        if (array(m) == value)
          m
        else if (array(0) < array(m)) {
          if ((array(0) <= value) && (value < array(m)))
            find0(0, m)
          else
            find0(m + 1, r)
        }
        else if (array(m + 1) <= array(r)) {
          if ((array(m) <= value) && (value <= array(r)))
            find0(m + 1, r)
          else
            find0(0, m)
        }
        else
          -1
      }
    }
    find0(0, array.length - 1)
  }

  def binarySearch(value: Long, l: Int, r: Int,  array: Array[Int]) : Int =  {
    if (l == r)
      -1
    else {
      val m = (l + r) / 2
      if (array(m) == value)
        m
      else if (value < array(m))
        binarySearch(value, l, m, array)
      else
        binarySearch(value, m + 1, r, array)
    }
  }
}
